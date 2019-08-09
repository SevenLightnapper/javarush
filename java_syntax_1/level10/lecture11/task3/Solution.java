package javarush.java_syntax_1.level10.lecture11.task3;
/*
package com.javarush.Task.task10.task1010;
*/
/*
Правильный ответ: Solution=1.0
*/
/*
Добавить одну операцию по преобразованию типа, чтобы получался ответ: Solution=1.0.
*/

public class Solution {
    public static void main(String[] args) {
        int a = (byte) 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / e;

        System.out.println(d);
    }
}

