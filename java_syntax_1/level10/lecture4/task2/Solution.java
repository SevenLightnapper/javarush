package javarush.java_syntax_1.level10.lecture4.task2;
/*
package com.javarush.Task.task10.task1002;
*/
/*
Задача №2 на преобразование целых типов
*/
/*
Расставьте правильно операторы приведения типа, чтобы получился ответ: Solution=3.765
int a = 15;
int b = 4;
float c = a / b;
double Solution = a * 1e-3 + c;
*/

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}

