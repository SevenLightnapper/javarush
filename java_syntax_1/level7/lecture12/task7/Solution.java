package javarush.java_syntax_1.level7.lecture12.task7;
/*
package com.javarush.Task.task07.task0725;
*/
/*
Переставь один модификатор static
*/
/*
Переставь один модификатор static, чтобы пример скомпилировался.
*/

public class Solution {
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {
    }

    public int getValue() {
        return C;
    }
}

