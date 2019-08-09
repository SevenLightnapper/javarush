package javarush.java_core_2.level10.lecture4.task4;
/*
package com.javarush.task.task20.task2009;
*/
/*
Как сериализовать static?
*/
/*
Сделай так, чтобы сериализация класса ClassWithStatic была возможной.
Требования:

    •
    Класс ClassWithStatic должен существовать внутри класса Solution.
    •
    Класс ClassWithStatic должен быть статическим.
    •
    Класс ClassWithStatic должен быть публичным.
    •
    Класс ClassWithStatic должен поддерживать интерфейс Serializable.
    */
import java.io.*;

public class Solution {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }

    public static void main(String[] args) {

    }
}

