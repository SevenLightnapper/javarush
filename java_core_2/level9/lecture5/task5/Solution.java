package javarush.java_core_2.level9.lecture5.task5;
/*
package com.javarush.task.task19.task1910;
*/
/*
Пунктуация
*/
/*
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.

Результат вывести во второй файл.

Закрыть потоки.
Требования:

    •
    Программа должна считывать имена файлов с консоли (используй BufferedReader).
    •
    BufferedReader для считывания данных с консоли должен быть закрыт.
    •
    Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
    •
    Поток чтения из файла (BufferedReader) должен быть закрыт.
    •
    Программа должна записывать во второй файл содержимое первого файла, где удалены все знаки пунктуации, включая символы новой строки (Для записи в файл используй BufferedWriter с конструктором FileWriter).
    •
    Поток записи в файл (BufferedWriter) должен быть закрыт.
    */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader brfr = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bwfw = new BufferedWriter(new FileWriter(fileName2));

        StringBuilder sb = new StringBuilder();
        while (brfr.ready()){
            sb.append((char) brfr.read());
        }

        String str = sb.toString();
        bwfw.write(str.replaceAll("[\\p{P}\n]", ""));

        brfr.close();
        bwfw.close();
    }
}

