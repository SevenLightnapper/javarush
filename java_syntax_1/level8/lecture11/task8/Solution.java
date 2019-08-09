package javarush.java_syntax_1.level8.lecture11.task8;
/*
package com.javarush.Task.task08.task0826;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Пять победителей
*/
/*
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
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
        /*for(int i = 0; i < array.length - 1; i++){
            if(array[i] < array[i + 1]){
                int y = array[i];//напишите тут ваш код
                array[i + 1] = array[i];
                array[i] = y;
            }
        }*/
    }
}

