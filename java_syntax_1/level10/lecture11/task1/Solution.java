package javarush.java_syntax_1.level10.lecture11.task1;
/*
package com.javarush.Task.task10.task1008;
*/
/*
Правильный ответ: Solution=2.941
*/
/*
Добавить одну операцию по преобразованию типа, чтобы получался ответ: Solution=2.941.
Пример вывода:
2.9411764705882355
*/

public class Solution {
    public static void main(String[] args) {
        int a = 50;
        int b = 17;
        double d = (double) a / b;
        System.out.println(d);
    }
}
