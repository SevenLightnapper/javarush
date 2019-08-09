package javarush.java_multithreading_3.level6.lecture15_chat;

import java.io.*;
import java.net.Socket;
import java.net.SocketAddress;

public class Connection implements Closeable {
    private final Socket socket;
    private final ObjectOutputStream out;
    private final ObjectInputStream in;

    public Connection(Socket socket) throws IOException {
        this.socket = socket;
        this.out = new ObjectOutputStream(socket.getOutputStream());
        this.in = new ObjectInputStream(socket.getInputStream());
    }

    public void send(Message message) throws IOException {
        synchronized (this.out){
            this.out.writeObject(message);
        }
    }

    public Message receive() throws IOException, ClassNotFoundException {
        synchronized (this.in){
            return (Message) this.in.readObject();
        }
    }
    public SocketAddress getRemoteSocketAddress() {
        return socket.getRemoteSocketAddress();
    }

    @Override
    public void close() throws IOException {
        socket.close();
        out.close();
        in.close();
    }
}
