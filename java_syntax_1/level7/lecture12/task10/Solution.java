package javarush.java_syntax_1.level7.lecture12.task10;
/*
package com.javarush.Task.task07.task0728;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
В убывающем порядке
*/
/*
Задача: Написать программу,
которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length - 1; k++) {
                if (array[k] < array[k + 1]) {
                    int a = array[k];
                    array[k] = array[k+1];//напишите тут ваш код
                    array[k+1] = a;
                }
            }
        }
    }
}

