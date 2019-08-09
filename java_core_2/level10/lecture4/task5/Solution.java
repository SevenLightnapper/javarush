package javarush.java_core_2.level10.lecture4.task5;
/*
package com.javarush.task.task20.task2010;
*/
/*
Как сериализовать что-то свое?
*/
/*
Сделайте так, чтобы сериализация класса Object была возможной.
Требования:

    •
    Класс Object должен существовать внутри класса Solution.
    •
    Класс Solution.Object должен быть статическим.
    •
    Класс Solution.Object должен быть публичным.
    •
    Класс Solution.Object должен поддерживать интерфейс Serializable.
    •
    Класс Solution.String должен поддерживать интерфейс Serializable.
    */

import java.io.Serializable;

public class Solution {
    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static int stringCount;

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(String[] args) {

    }
}

