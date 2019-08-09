package javarush.java_core_2.level9.lecture5.task3;
/*
package com.javarush.task.task19.task1908;
*/
/*
Выделяем числа
*/
/*
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8ю 1

Результат:
12 14 1
Требования:

    •
    Программа должна считывать имена файлов с консоли (используй BufferedReader).
    •
    BufferedReader для считывания данных с консоли должен быть закрыт.
    •
    Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором принимающим FileReader).
    •
    Поток чтения из файла (BufferedReader) должен быть закрыт.
    •
    Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).
    •
    Поток записи в файл (BufferedWriter) должен быть закрыт.
    */

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));
        String s = " ";

        while (bufferedReader.ready()) {
            s += (char) bufferedReader.read();
        }
        bufferedReader.close();

        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            bufferedWriter.write(matcher.group() + " ");
            System.out.println(matcher.group() + " ");
        }
        bufferedWriter.close();
    }
}

