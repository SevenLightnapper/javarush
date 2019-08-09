package javarush.java_multithreading_3.level2.lecture7.task2;
/*
package com.javarush.task.task22.task2205;
*/
/*
МНЕ нравится курс JavaRush
*/
/*
Исправить метод getFormattedString так, чтобы он возвращал строку с параметрами для форматирования.
Параметры должны меняться местами.

Должен быть вывод:
МНЕ нравится курс JavaRush
Требования:

    •
    Метод getFormattedString должен быть публичным.
    •
    Метод getFormattedString должен быть статическим.
    •
    Вывод на экран должен соответствовать условию задачи.
    •
    Метод getFormattedString должен возвращать строку с параметрами для форматирования согласно условию задачи.
    */

public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //должен быть вывод
        //"МНЕ нравится курс JavaRush"
    }
    public static String getFormattedString() {
        return "%3$s".toUpperCase() + " %4$s %2$s %1$s";
    }
}

