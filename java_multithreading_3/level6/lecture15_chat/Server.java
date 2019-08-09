package javarush.java_multithreading_3.level6.lecture15_chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void sendBroadcastMessage(Message message) {
        for (String name : connectionMap.keySet()) {
            try {
                connectionMap.get(name).send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage(String.format("Can't send the message to %s", name));
            }
        }
    }

    public static void main(String[] args) throws IOException {
         ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt());
         System.out.println("Server has started.");

         while (true) {
             try {
                 Socket socket;
                 socket = serverSocket.accept();
                 Handler handler = new Handler(socket);
                 handler.start();
             } catch (Exception e) {
                 serverSocket.close();
                 System.out.println(e.getMessage());
                 break;
             }
         }
    }

    private static class Handler extends Thread {
        Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            String userName = "";
            ConsoleHelper.writeMessage(String.format("Connection has been made with %s.", socket.getRemoteSocketAddress()));
            try (Connection connection = new Connection(socket)) {
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);
            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("There has been an error while data exchange with the RemoteAddress.");
            }
            connectionMap.remove(userName);
            sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            ConsoleHelper.writeMessage(String.format("The connection with %s has been closed.", socket.getRemoteSocketAddress()));
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message != null && message.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + message.getData()));
                } else {
                    ConsoleHelper.writeMessage("Error! Message type is not TEXT.");
                }
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (String name : connectionMap.keySet()) {
                if (!name.equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, name));
                }
            }
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException{
            while (true){
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message answer = connection.receive();
                if (answer.getType() == MessageType.USER_NAME){
                    if (!answer.getData().isEmpty()) {
                        if (!connectionMap.containsKey(answer.getData())){
                            connectionMap.put(answer.getData(), connection);
                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            return answer.getData();
                        }
                    }
                }
            }
        }
    }
}
