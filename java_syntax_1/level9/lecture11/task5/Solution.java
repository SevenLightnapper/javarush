package javarush.java_syntax_1.level9.lecture11.task5;
/*
package com.javarush.Task.task09.task0923;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные
*/
/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine().replaceAll("\\s+", "");
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if(isVowel(ch[i])) {
                System.out.print(ch[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < ch.length; i++){
            if(!isVowel(ch[i])) {
                System.out.print(ch[i] + " ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
