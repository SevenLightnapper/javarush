package javarush.java_core_2.level8.lecture11.task1;
/*
package com.javarush.task.task18.task1816;
*/
import java.io.*;
/*
Английские буквы
*/
/*
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.

Требования:
    Считывать с консоли ничего не нужно.
    Создай поток чтения из файла, который приходит первым параметром в main.
    В файле необходимо посчитать буквы английского алфавита и вывести это число в консоль.
    Нужно учитывать заглавные и строчные буквы.
    Поток чтения из файла должен быть закрыт.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(args[0]);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;

        while (inputStream.available() > 0) {
            char c = (char) inputStream.read();
            if (alphabet.contains(Character.toString(c).toLowerCase())) count++;
        }

        System.out.println(count);

        inputStream.close();
    }
}

