package javarush.java_syntax_1.level9.lecture2.task2;
/*
package com.javarush.Task.task09.task0902;
*/
/*
И снова StackTrace
*/
/*
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();

    }

    public static String method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}

