package javarush.java_syntax_1.level4.lecture7.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LablesAndNumbers {
/*
    Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
            "отрицательное четное число" - если число отрицательное и четное,
            "отрицательное нечетное число" - если число отрицательное и нечетное,
            "ноль" - если число равно 0,
            "положительное четное число" - если число положительное и четное,
            "положительное нечетное число" - если число положительное и нечетное.

    Пример для числа 100:
    положительное четное число

    Пример для числа -51:
    отрицательное нечетное число
*/
/*
package com.javarush.Task.task04.task0426;
*/
/*
Ярлыки и числа
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String sNumber = reader.readLine();
        int a = Integer.parseInt(sNumber);

        // if ( a % 2 == 0 )
        //        System.out.println("Число четное");
        //     else
        //        System.out.println("Число нечетное");

        if ((a % 2 == 0) && (a > 0))
            System.out.println("положительное четное число");
        else if (((a + 1) % 2 == 0) && (a > 0))
            System.out.println("положительное нечетное число");
        else if ((-a % 2 == 0) && (a < 0))
            System.out.println("отрицательное четное число");
        else if (((-a - 1) % 2 == 0) && (a < 0))
            System.out.println("отрицательное нечетное число");
        else if (a == 0)
            System.out.println("ноль");
    }
}
