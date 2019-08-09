package javarush.java_collections_4.level9.lecture9.task7;
/*
package com.javarush.task.task39.task3910;
*/
/*
isPowerOfThree
*/
/*
Исправь ошибку в методе isPowerOfThree(int n), он должен возвращать true, если n является целочисленной степенью числа 3. Иначе - false.
Требования:

    •
    Метод isPowerOfThree должен возвращать true, если n является целочисленной степенью числа 3.
    •
    Метод isPowerOfThree должен возвращать false, если n не является целочисленной степенью числа 3.
    •
    Метод isPowerOfThree должен быть публичным.
    •
    Метод isPowerOfThree должен быть статическим.
    */

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(3));
        System.out.println(isPowerOfThree(9));
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(12));
        System.out.println(isPowerOfThree(1));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 0) return
                false;

        while ((n % 3) == 0) {
            n = n / 3;
        }

        if (n == 1)
            return true;


        return false;
    }
}

