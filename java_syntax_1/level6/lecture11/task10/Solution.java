package javarush.java_syntax_1.level6.lecture11.task10;
/*
package com.javarush.Task.task06.task0622;
*/
/*
Числа по возрастанию
*/
/*
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];

        for (int i = 0; i < 5; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

      /* Scanner in = new Scanner(System.in);

    int array[] = new int[5];
        for (int i=0; i<5;i++){
            array[i]=in.nextInt();
        }
        */

        Arrays.sort(array);
        for (int i : array){
            System.out.println(i);
        }
    }
}