package javarush.java_core_2.level9.lecture8.task3;
/*
package com.javarush.task.task19.task1913;
*/
/*
Выводим только цифры
*/
/*
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить только цифры.
Вызови готовый метод printSomething(), воспользуйтесь testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.

Пример вывода:
12345678
Требования:

    •
    Класс Solution должен содержать класс TestString.
    •
    Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
    •
    Класс TestString должен содержать публичный void метод printSomething().
    •
    Метод printSomething() класса TestString должен выводить на экран строку "it's 1 a 23 text 4 f5-6or7 tes8ting".
    •
    Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
    •
    Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
    •
    Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
    •
    Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
    */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        // create a dynamic array
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // create an adapter to the PrintStream array
        PrintStream stream = new PrintStream(outputStream);
        // make it the current System.out
        System.setOut(stream);

        // call a function that doesn't know anything about our manipulations
        testString.printSomething();

        //return everything to the way it was in the beginning
        System.setOut(consoleStream);

        // turn the data, saved in our ByteArray, into a string
        // delete all signs except for numbers from the line
        String result = outputStream.toString().replaceAll("[^0-9]", "");

        // print the new line into console
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}

