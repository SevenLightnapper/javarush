package javarush.java_syntax_1.level9.lecture2.task1;
/*
package com.javarush.Task.task09.task0901;
*/
/*
Возвращаем StackTrace
*/
/*
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;//напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;//напишите тут ваш код
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;//напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;//напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;//напишите тут ваш код
    }
}

