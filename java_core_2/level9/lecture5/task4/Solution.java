package javarush.java_core_2.level9.lecture5.task4;
/*
package com.javarush.task.task19.task1909;
*/
/*
Замена знаков
*/
/*
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла и заменить все точки "." на знак "!".
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
    Программа должна записывать во второй файл содержимое первого файла, где заменены все точки "." на знак "!" (Для записи в файл используй BufferedWriter с конструктором FileWriter).
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
        reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        String str;
        while (reader.ready()) {
            str = reader.readLine();
            str = str.replaceAll("\\.", "!");
            writer.write(str);
        }
        writer.close();
        reader.close();
    }

}
