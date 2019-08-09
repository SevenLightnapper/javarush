package javarush.java_multithreading_3.level1.lecture2.task3;
/*
package com.javarush.task.task21.task2103;
*/
/*
Все гениальное - просто!
*/
/*
 Упростить. Переменные не переименовывать, комментарии не оставлять.
Требования:

    •
    Метод calculate должен быть статическим.
    •
    Метод calculate должен возвращать значение типа boolean.
    •
    Метод calculate должен принимать четыре параметра типа boolean.
    •
    Метод calculate должен быть максимально упрощен(поведение должно остаться прежним).
    */

public class Solution {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
        return c; // c == (a && b && c && !d) || (!a && c) || (!b && c) || (c && d)
    }

    public static void main(String[] args) {

    }
}

