package javarush.java_multithreading_3.level6.lecture15_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String message = null;
        boolean boo = true;
        while (boo) {
            try {
                message = reader.readLine();
                boo = false;
                break;
            } catch (IOException e) {
                writeMessage("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
                boo = true;
            }
        }
        return message;
    }

    public static int readInt() {
        int i = 0;
        boolean boo = true;
        while (boo) {
            try {
                i = Integer.parseInt(readString());
                boo = false;
                break;
            } catch (NumberFormatException e) {
                writeMessage("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
                boo = true;
            }
        }
        return i;
    }
}
