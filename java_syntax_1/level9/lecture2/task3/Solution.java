package javarush.java_syntax_1.level9.lecture2.task3;
/*
package com.javarush.Task.task09.task0903;
*/
/*
Кто меня вызывал?
*/
/*
Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().
*/



public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();

        return  element[2].getLineNumber()/*напишите тут ваш код*/ ;
    }

    public static int method2() {
        method3();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return  element[2].getLineNumber()/*напишите тут ваш код*/ ;
    }

    public static int method3() {
        method4();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return  element[2].getLineNumber()/*напишите тут ваш код*/ ;
    }

    public static int method4() {
        method5();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return  element[2].getLineNumber()/*напишите тут ваш код*/ ;
    }

    public static int method5() {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return  element[2].getLineNumber()/*напишите тут ваш код*/ ;
    }
}

