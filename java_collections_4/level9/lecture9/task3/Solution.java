package javarush.java_collections_4.level9.lecture9.task3;
/*
package com.javarush.task.task39.task3903;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Неравноценный обмен

/*
Продолжая разработку алгоритма, нам очень бы пригодился метод который бы менял указанные биты
в двоичном представлении числа типа long.

Реализуй метод long swapBits(long number, int i, int j), который будет в двоичном представлении числа number менять местами биты с индексами i и j и возвращать результат.

Наименее значимый бит имеет индекс 0.
Требования:

    •
    Метод swapBits должен быть реализован в соответствии с условием задачи.
    •
    Метод swapBits должен быть публичным.
    •
    Метод swapBits должен быть статическим.
    •
    Метод swapBits должен возвращать число типа long.
    */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter a number: ");

        long number = Long.parseLong(reader.readLine());
        System.out.println("Please enter the first index: ");
        int i = Integer.parseInt(reader.readLine());
        System.out.println("Please enter the second index: ");
        int j = Integer.parseInt(reader.readLine());

        System.out.println("The result of swapping bits is " + swapBits(number, i, j));
    }

    public static long swapBits(long number, int i, int j) {
        long a = number >> i & 1;
        long b = number >> j & 1;

        if (a != b)
            number = number & ~((1 << i) | (1 << j)) | (a << j) | (b << i);

        return number;
    }
}

