package javarush.java_multithreading_3.level2.lecture13.task1;
/*
package com.javarush.task.task22.task2210;
*/
/*
StringTokenizer
*/
/*
Используя StringTokenizer разделить query на части по разделителю delimiter.

Пример
getTokens("level22.lesson13.task01", ".")

возвращает массив строк
{"level22", "lesson13", "task01"}
Требования:

    •
    Метод getTokens должен использовать StringTokenizer.
    •
    Метод getTokens должен быть публичным.
    •
    Метод getTokens должен принимать два параметра типа String.
    •
    Массив типа String возвращенный методом getTokens должен быть заполнен правильно(согласно условию задачи).
    */
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String [] s = getTokens("level22.lesson13.task01", ".");
        for (String str : s) {
            System.out.print(str);
        }
    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        ArrayList<String> list = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            list.add(tokenizer.nextToken());

        }
        return list.toArray(new String[list.size()]);
    }
}

