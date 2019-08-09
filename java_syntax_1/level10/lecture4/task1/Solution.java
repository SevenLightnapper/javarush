package javarush.java_syntax_1.level10.lecture4.task1;
/*
package com.javarush.Task.task10.task1001;
*/
/*
Задача №1 на преобразование целых типов
*/
/*
Расставьте правильно операторы приведения типа, чтобы получился ответ: Solution > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long Solution = (short) (a + f / c + b);
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = a + 46;
        byte c = (byte) (a * b);
        double f = /*(double)*/ 1234.15; // I had (double) in site's Task. It passed from the first try:)
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}

