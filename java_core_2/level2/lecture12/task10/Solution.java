package javarush.java_core_2.level2.lecture12.task10;
/*
package com.javarush.Task.task12.task1230;
*/
/*
Попадание в десятку
*/
/*
Добавь еще один метод, чтобы программа выводила на экран число 10.

Подсказка:
используй перегрузку методов.
*/

public class Solution {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }
    public static int transformValue(Integer i) {
        return i + i;
    }

}

