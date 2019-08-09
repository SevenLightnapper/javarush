package javarush.java_core_2.level8.lecture5.task4;
/*
package com.javarush.task.task18.task1809;
*/
import java.io.*;
/*
Реверс файла
*/
/*
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.

Требования:
    •
    Программа должна два раза считать имена файлов с консоли.
    •
    Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
    •
    Во второй файл нужно записать все байты из первого в обратном порядке.
    •
    Потоки FileInputStream и FileOutputStream должны быть закрыты.
    */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream input = new FileInputStream(reader.readLine());
        FileOutputStream output = new FileOutputStream(reader.readLine());

        reader.close();

        if (input.available() > 0) {
            byte[] buffer = new byte [input.available()];
            input.read(buffer);
            for (int i = buffer.length - 1; i >= 0; i--) {
                output.write(buffer[i]);
            }
        }

        input.close();
        output.close();

    }
}

