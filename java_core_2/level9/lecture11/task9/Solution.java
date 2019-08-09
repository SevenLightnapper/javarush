package javarush.java_core_2.level9.lecture11.task9;
/*
package com.javarush.task.task19.task1927;
*/
/*
Контекстная реклама
*/
/*
В методе main подмени объект System.out написанной тобой реадер-оберткой.
Твоя реадер-обертка должна выводить на консоль контекстную рекламу после каждого второго println-а.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.

Рекламный текст: "JavaRush - курсы Java онлайн"

Пример вывода:
first
second
JavaRush - курсы Java онлайн
third
fourth
JavaRush - курсы Java онлайн
fifth
Требования:

    •
    Класс Solution должен содержать класс TestString.
    •
    Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
    •
    Класс TestString должен содержать публичный void метод printSomething().
    •
    Метод printSomething() класса TestString должен выводить на экран строки: "first","second","third","fourth","fifth".
    •
    Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c конструктором принимающим ByteArrayOutputStream).
    •
    Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
    •
    Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
    •
    Метод main(String[] args) класса Solution должен модифицировать строки(вставлять контекстную рекламу) выведенные методом printSomething() согласно заданию, и выводить её в консоль.
    */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);

        //String reg = String.valueOf((char)13)+String.valueOf((char)10);
        String[] lines = result.split("\n");

        for (int i = 0 ; i < lines.length; i++) {
            System.out.println(lines[i]);
            if ((i+1) % 2 == 0) System.out.println("JavaRush - курсы Java онлайн");
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
            System.out.println("sixth");
            System.out.println("seventh");
        }
    }
}

