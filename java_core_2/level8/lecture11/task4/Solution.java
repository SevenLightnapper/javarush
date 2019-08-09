package javarush.java_core_2.level8.lecture11.task4;
/*
package com.javarush.task.task18.task1819;
*/
/*
Объединение файлов
*/
import java.io.*;
/*
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.
Требования:

    •
    Программа должна два раза считать имена файлов с консоли.
    •
    Не используй в программе статические переменные.
    •
    Для первого файла создай поток для чтения и считай его содержимое.
    •
    Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
    •
    Содержимое первого и второго файла нужно объединить в первом файле.
    •
    Сначала должно идти содержимое второго файла, затем содержимое первого.
    •
    Созданные для файлов потоки должны быть закрыты.
    */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();

        byte[] first;
        byte[] second;

        FileInputStream one = new FileInputStream(firstFile);
        FileInputStream two = new FileInputStream(secondFile);

        first = new byte[one.available()];
        one.read(first);
        one.close();

        second = new byte[two.available()];
        two.read(second);
        two.close();

        FileOutputStream three = new FileOutputStream(firstFile);
        three.write(second);
        three.write(first);
        three.close();
    }
}

