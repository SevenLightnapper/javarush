package javarush.java_syntax_1.level10.lecture4.task6;
/*
package com.javarush.Task.task10.task1006;
*/
/*
Задача №6 на преобразование целых типов
*/
/*
Убери ненужные операторы приведения типа, чтобы получился ответ: result: 1000.0
double Solution = (short) 2.50256e2d;
char c = (short) 'Solution';
short s = (short) 2.22;
int i = (short) 150000;
float f = (short) 0.50f;
double result = f + (i / c) - (Solution * s) - 500e-3;
*/

public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d;
        char c = 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
}
