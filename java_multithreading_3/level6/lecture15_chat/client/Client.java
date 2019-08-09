package javarush.java_multithreading_3.level6.lecture15_chat.client;

import javarush.java_multithreading_3.level6.lecture15_chat.Connection;
import javarush.java_multithreading_3.level6.lecture15_chat.ConsoleHelper;
import javarush.java_multithreading_3.level6.lecture15_chat.Message;
import javarush.java_multithreading_3.level6.lecture15_chat.MessageType;

import java.io.IOException;
import java.net.Socket;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public void run() {
        SocketThread helpingSocketThread = getSocketThread();
        helpingSocketThread.setDaemon(true);
        helpingSocketThread.start();
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                ConsoleHelper.writeMessage("An exception has occurred while waiting.");
                return;
            }
        }
        if (clientConnected) {
            ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду \'exit\'.");
        } else {
            ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");
        }
        while (clientConnected) {
            String data = ConsoleHelper.readString();
            if (data.equals("exit")) {
                break;
            } else {
                if (shouldSendTextFromConsole())
                    sendTextMessage(data);
            }
        }
    }

    protected String getServerAddress() {
        return ConsoleHelper.readString();
    }

    protected int getServerPort() {
        return ConsoleHelper.readInt();
    }

    protected String getUserName() {
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("The attempt to send a message has failed.");
            clientConnected = false;
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    public class SocketThread extends Thread {
        @Override
        public void run() {
            try {
                String serverAddress = getServerAddress();
                int serverPort = getServerPort();
                Socket socket = new Socket(serverAddress, serverPort);
                connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();
            } catch (IOException | ClassNotFoundException e) {
                notifyConnectionStatusChanged(false);
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.NAME_REQUEST) {
                    String name = getUserName();
                    connection.send(new Message(MessageType.USER_NAME, name));
                } else if (message.getType() == MessageType.NAME_ACCEPTED) {
                    notifyConnectionStatusChanged(true);
                    return;
                } else {
                    throw new IOException("Unexpected MessageType");
                }
            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    processIncomingMessage(message.getData());
                } else if (message.getType() == MessageType.USER_ADDED) {
                    informAboutAddingNewUser(message.getData());
                } else if (message.getType() == MessageType.USER_REMOVED) {
                    informAboutDeletingNewUser(message.getData());
                } else {
                    throw new IOException("Unexpected MessageType");
                }
            }
        }

        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage(String.format("%s has joined the chat.", userName));
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage(String.format("%s has left the chat.", userName));
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
            }
        }
    }
}
