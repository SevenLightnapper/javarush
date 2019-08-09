package javarush.java_syntax_1.level7.lecture4.task1;
/*
package com.javarush.Task.task07.task0701;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Массивный максимум
*/
/*
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution {


    private static int[] list;

    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        list = new int[20];
        for(int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        // создай и заполни массив
        return list;
    }

    public static int max(int[] array) {
        Arrays.sort(array);
        return array[19];
        /*
        another way of finding max element:

        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
        */
    }
}

