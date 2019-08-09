package javarush.java_multithreading_3.level5.lecture9.task3;
/*
package com.javarush.task.task25.task2512;
*/
/*
Живем своим умом
*/
/*
В классе Solution реализуй интерфейс UncaughtExceptionHandler, который должен:
1. прервать нить, которая бросила исключение.
2. вывести в консоль стек исключений, начиная с самого вложенного.

Пример исключения:
new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")))

Пример вывода:
java.lang.IllegalAccessException: GHI
java.lang.RuntimeException: DEF
java.lang.Exception: ABC
Требования:

    •
    Класс Solution должен реализовывать интерфейс Thread.UncaughtExceptionHandler.
    •
    После вызова uncaughtException нужно прервать нить, которая бросила исключение.
    •
    Затем, вывести в консоль стек исключений, начиная с самого вложенного исключения.
    •
    Сообщения должны выводиться в формате "exception class: exception message".
    */

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        method(e);
    }

    public static void method(Throwable cause) {
        if (cause == null) return;
        method(cause.getCause());
        System.out.println(cause.toString());
    }

    public static void main(String[] args) {

    }
}

