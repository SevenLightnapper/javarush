package javarush.java_syntax_1.level10.lecture4.task4;
/*
package com.javarush.Task.task10.task1004;
*/
/*
Задача №4 на преобразование целых типов
*/
/*
Добавить одну операцию по преобразованию типа, чтобы получался ответ: nine=9
short number = 9;
char zero = '0';
int nine = (zero + number);
*/

public class Solution {
    public static void main(String[] args) {
        short number = (char) 9;
        char zero = ('0');
        int nine = (zero + number);
        System.out.println((char)nine);
    }
}
