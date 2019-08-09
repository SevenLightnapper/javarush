package javarush.java_multithreading_3.level2.lecture9.task3;
/*
package com.javarush.task.task22.task2209;
*/
/*
Составить цепочку слов
*/
/*
В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставь все слова в таком порядке, чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
Вывести полученную строку на экран.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
Требования:

    •
    Метод main должен считывать имя файла с клавиатуры.
    •
    В классе Solution не должно быть статических полей.
    •
    В методе getLine должен быть использован StringBuilder.
    •
    Метод getLine должен возвращать пустую строку(пустой StringBuilder) в случае если ему не были переданы параметры(слова).
    •
    Метод getLine не должен изменять переданные ему параметры(слова).
    •
    Все слова переданные в метод getLine должны быть включены в результирующую строку, если это возможно.
    •
    Вывод на экран должен соответствовать условию задачи.
    */

import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fileName = rd.readLine();
        rd.close();
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) sb.append(sb.length() == 0 ? reader.readLine() : " " + reader.readLine());
        reader.close();
        StringBuilder result = getLine(sb.toString().split(" "));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (words.length == 0) return new StringBuilder();
        else if (words.length == 1) return new StringBuilder(words[0]);
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        while (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (sb.length() == 0) {
                    sb.append(list.get(0));
                    list.remove(0);
                }
                if (sb.toString().toLowerCase().charAt(sb.length() - 1) == list.get(i).toLowerCase().charAt(0)) {
                    sb.append(" ").append(list.get(i));
                    list.remove(i);
                    i = -1;
                }
            }
            if (list.size() > 0) {
                list = new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(list);
                sb = new StringBuilder();
            }
        }
        return sb;
    }
}