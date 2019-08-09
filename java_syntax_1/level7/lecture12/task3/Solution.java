package javarush.java_syntax_1.level7.lecture12.task3;
/*
package com.javarush.Task.task07.task0721;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Минимаксы в массивах
*/
/*
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] list = new int[20];//напишите тут ваш код
        for(int i =0; i < list.length; i++){
            int a = Integer.parseInt(reader.readLine());
            list[i] = a;
        }
        Arrays.sort(list);
        maximum = list[19];
        minimum = list[0];

        System.out.print(maximum + " " + minimum);
    }
}

