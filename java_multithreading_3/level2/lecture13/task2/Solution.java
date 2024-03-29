package javarush.java_multithreading_3.level2.lecture13.task2;
/*
package com.javarush.task.task22.task2211;
*/
/*
Смена кодировки
*/
/*
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
Требования:

    •
    Программа НЕ должна считывать данные с клавиатуры.
    •
    Программа НЕ должна выводить данные на экран.
    •
    Программа должна записывать данные в файл.
    •
    Содержимое второго файла должно соответствовать содержимому первого файла за исключением кодировки(UTF-8).
    */
import java.io.*;
import java.nio.charset.Charset;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);
        Charset utf8 = Charset.forName("UTF-8");
        Charset windows1251 = Charset.forName("Windows-1251");

        byte[] buffer = new byte[1000];
        fis.read(buffer);
        String s = new String(buffer, windows1251);
        buffer = s.getBytes(utf8);
        fos.write(buffer);
    }
}

