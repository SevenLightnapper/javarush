package javarush.java_syntax_1.level4.lecture7.task4;

import java.io.*;


public class PositiveAndNegativeNumbers {
 /*
    Пример:
    а) при вводе чисел
        2
        5
        6
    получим вывод
    количество отрицательных чисел: 0
    количество положительных чисел: 3

    Пример:
    б) при вводе чисел
        -2
        -5
        6
    получим вывод
    количество отрицательных чисел: 2
    количество положительных чисел: 1

    Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить количество отрицательных чисел в исходном наборе.
4. Программа должна выводить количество положительных чисел в исходном наборе.
5. Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
6. Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
7. Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
*/
/*
package com.javarush.Task.task04.task0429;
*/
/*
Положительные и отрицательные числа
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 3 ; i++){
            int a = Integer.parseInt(reader.readLine());
            if(a<0){
                count1++;
            } else if(a>0) {
                count2++;
            }
        }
        System.out.println("количество отрицательных чисел: " + count1 );
        System.out.println("количество положительных чисел: " + count2);
    }
}
