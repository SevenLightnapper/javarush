package javarush.java_syntax_1.level8.lecture11.task5;
/*
package com.javarush.Task.task08.task0823;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/
/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.trim();

        String[] words = s.split("\\s+");//разделяем на массив из слов при обнаружении пробела


        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            words[i] = word.substring(0, 1).toUpperCase() + word.substring(1) + " ";

        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]); // also you can use this -> System.out.print(words[i]);
        }
    }
}
