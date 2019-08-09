package javarush.java_multithreading_3.level6.lecture8.task1;
/*
package com.javarush.task.task26.task2607;
*/
/*
Вежливость - это искусственно созданное хорошее настроение
*/
/*
В классе Solution создай public static класс IntegerHolder.
IntegerHolder должен быть для типа int (имя переменной должно быть value), быть thread safe и изменяемым.
В этом классе должны быть два public метода get и set.
Требования:

    •
    Класс Solution должен содержать public static класс IntegerHolder.
    •
    Класс IntegerHolder должен содержать private поле value типа int.
    •
    Класс IntegerHolder должен содержать public метод get(), который должен вернуть value.
    •
    Класс IntegerHolder должен содержать public метод set(int value), который должен установить value переданным значением.
    •
    Класс IntegerHolder должен быть thread safe.
    */

public class Solution {

    public static class IntegerHolder {
        private int value;

        public synchronized int get() {
            return value;
        }

        public synchronized void set(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
    }
}

