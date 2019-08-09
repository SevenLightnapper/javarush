package javarush.java_syntax_1.level7.lecture4.task3;
/*
package com.javarush.Task.task07.task0703;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Общение одиноких массивов
*/
/*
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[10];
        int[] nums = new int[10];


        for (int p = 0, i = 0; p < list.length; p++, i++) {
            list[p] = reader.readLine();
            nums[i] = list[p].length();
            System.out.println(nums[i]);
        }
    }
}
