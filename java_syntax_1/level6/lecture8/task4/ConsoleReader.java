package javarush.java_syntax_1.level6.lecture8.task4;
/*
package com.javarush.Task.task06.task0610;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Класс ConsoleReader
*/
/*
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false"
и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner)
внутри каждого метода.
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String txt = reader.readLine();
        return txt;//напишите тут ваш код
    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        return number;//напишите тут ваш код
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        double Dnumber = Double.parseDouble(reader.readLine());
        return Dnumber;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String trueFalse = reader.readLine();
        return(trueFalse.equals("true"));//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}

