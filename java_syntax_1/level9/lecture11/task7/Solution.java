package javarush.java_syntax_1.level9.lecture11.task7;
/*
package com.javarush.Task.task09.task0925;
*/
/*
Статики не на своем месте
*/
/*
Расставь модификаторы static так, чтобы пример скомпилировался.
*/

public class Solution {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}

