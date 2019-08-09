package javarush.java_syntax_1.level9.lecture2.task6;
/*
package com.javarush.Task.task09.task0906;
*/
/*
Логирование стек трейса
*/
/*
Реализовать метод log.
Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
Имя класса, имя метода и сообщение разделить двоеточием с пробелом.

Пример вывода:
com.javarush.Task.task09.task0906.Solution: main: In main method
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName() + ": " + Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + s);
    }
}

