package javarush.java_multithreading_3.level2.lecture7.task1;
/*
package com.javarush.task.task22.task2204;
*/
/*
Форматирование строки
*/
/*
Исправить метод getFormattedString так, чтобы он возвращал строку с параметрами для форматирования.
Для перевода каретки не используйте \n.

Должен быть вывод:
20 / 7 = 2,86
Exp = 3,33e+00
Требования:

    •
    Для перевода строки не должно быть использовано выражение \n.
    •
    Метод getFormattedString должен быть статическим.
    •
    Вывод на экран должен соответствовать условию задачи.
    •
    Метод getFormattedString должен возвращать строку с параметрами для форматирования согласно условию задачи.
    */

public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), 20.0 / 7.0, 10.0 / 3.0));
        //должен быть вывод
        //20 / 7 = 2,86
        //Exp = 3,33e+00
    }

    public static String getFormattedString() {
        return "20 / 7 = %.2f%nExp = %2.2e";
    }
}

