package javarush.java_multithreading_3.level6.lecture15_chat;

import java.io.Serializable;

public class Message implements Serializable {
    private final MessageType type;
    private final String data;

    public Message(MessageType type, String data) {
        this.type = type;
        this.data = data;
    }

    public Message(MessageType type) {
        this.type = type;
        data = null;
    }

    public String getData() {
        return data;
    }

    public MessageType getType() {
        return type;
    }
}
