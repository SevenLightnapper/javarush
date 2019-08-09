package javarush.java_syntax_1.level9.lecture2.task5;
/*
package com.javarush.Task.task09.task0905;
*/
/*
Там, в синих глубинах стек-трейса…
*/
/*
Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {

        StackTraceElement a[] = Thread.currentThread().getStackTrace();
        int b = a.length;
        System.out.println(b);



        return b;
    }
}

