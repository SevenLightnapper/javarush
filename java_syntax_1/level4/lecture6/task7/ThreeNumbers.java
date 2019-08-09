package javarush.java_syntax_1.level4.lecture6.task7;
import java.io.*;
public class ThreeNumbers {
/*
    Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

    Пример для чисел 4 6 6:
            1

    Пример для чисел 6 6 3:
            3
*/
/*
package com.javarush.Task.task04.task0424;
*/
/*
Три числа
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String Anumber = reader.readLine();
        String Bnumber = reader.readLine();
        String Cnumber = reader.readLine();
        int a = Integer.parseInt(Anumber);
        int b = Integer.parseInt(Bnumber);
        int c = Integer.parseInt(Cnumber);

        if (a < b && b == c)
            System.out.println(1);
        else if (a == b && a > c)
            System.out.println(3);
        else if (a == c && a > b)
            System.out.println(2);
    }

}

