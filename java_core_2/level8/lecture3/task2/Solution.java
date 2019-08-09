package javarush.java_core_2.level8.lecture3.task2;
/*
package com.javarush.task.task18.task1802;
*/
import java.io.*;
import java.util.*;

/*
Минимальный байт
*/
/*
 Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.
Требования:

    •
    Программа должна считывать имя файла с консоли.
    •
    Для чтения из файла используй поток FileInputStream.
    •
    В консоль должен выводиться минимальный байт, считанный из файла.
    •
    Поток чтения из файла должен быть закрыт.
    */

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream  = new FileInputStream(reader.readLine());
        reader.close();
        ArrayList list = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        try {
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(Collections.min(list));
        }
    }
}
