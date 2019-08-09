package javarush.java_core_2.level5.lecture9.task4;
/*
package com.javarush.task.task15.task1517;
*/
/*
Статики и исключения
*/
/*
В статическом блоке выбросьте Exception
В результате класс не загрузится, и вы увидите сообщение об ошибке вместо значения переменной B

Exception in thread "main" java.lang.ExceptionInInitializerError
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
Caused by: java.lang.RuntimeException:
at com.javarush.task.task15.task1517.Solution.<clinit>(TxtInputStream.java:22)

Hint: Нужно погуглить причину, если получилось следующее:
java: initializer must be able to complete normally
java: unreachable statement
*/

public class Solution {
    public static int A = 0;

    static {
        int h = 5 / Solution.A;//throw an exception here - выбросьте эксепшн тут
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}

