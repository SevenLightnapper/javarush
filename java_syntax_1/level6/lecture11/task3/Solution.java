package javarush.java_syntax_1.level6.lecture11.task3;
/*
package com.javarush.Task.task06.task0615;
*/
/*
Феншуй и статики
*/
/*
Переставь один модификатор static, чтобы пример скомпилировался.
*/

public class Solution {

    public static int A = 5;
    public  int B = 2;
    public int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}

