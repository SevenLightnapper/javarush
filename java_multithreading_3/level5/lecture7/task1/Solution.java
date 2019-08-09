package javarush.java_multithreading_3.level5.lecture7.task1;
/*
package com.javarush.task.task25.task2507;
*/
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/*
Работать в поте лица!
*/
/*
Реализуй логику метода interrupt, который должен прерывать трэд предварительно закрыв используемые ресурсы.
Используй метод super-класса в блоке finally.
Требования:

    •
    Сигнатуру метода interrupt менять нельзя.
    •
    Метод interrupt должен закрывать используемые классом Solution ресурсы.
    •
    Затем, метод interrupt должен прерывать трэд (вызов super.interrupt).
    •
    Трэд должен быть прерван в любом случае, даже если во время закрытия ресурсов было выкинуто исключение.
    */

public class Solution extends Thread {
    private static final int BUFFER_SIZE = 2000;    //2000 bytes
    private final Socket socket;
    private final InputStream in;

    public Solution(Socket socket) throws IOException {
        this.socket = socket;
        this.in = socket.getInputStream();
    }

    public void interrupt() {
        try {
            socket.close();//implement logic here
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            super.interrupt();
        }
    }

    public void run() {
        try {
            byte[] buf = new byte[BUFFER_SIZE];
            while (true) {
                int count = in.read(buf);
                if (count < 0) {
                    break;
                } else {
                    if (count > 0) {
                        //process buffer here
                    }
                }
            }
        } catch (IOException ignored) {}
    }

    public static void main(String[] args) {
    }
}

