package javarush.java_syntax_1.level4.lecture7.task3;
import java.io.*;
public class PositiveNumber {
/*
    Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

            Примеры:
    а) при вводе чисел
-4
        6
        6
    получим вывод
2
    б) при вводе чисел
-6
        -6
        -3
    получим вывод
0

    в) при вводе чисел
0
        1
        2
    получим вывод
2
*/
/*
package com.javarush.Task.task04.task0428;
*/
/*
Положительное число
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        if (a > 0 && b > 0 && c > 0) // a,b,c
            System.out.println(3);

        else if (a > 0 && b > 0 && c <= 0) // a,b
            System.out.println(2);
        else if (a > 0 && b <= 0 && c > 0) // a,c
            System.out.println(2);
        else if (a <= 0 && b > 0 && c > 0) // b,c
            System.out.println(2);

        else if (a > 0 && b <= 0 && c <= 0) // a
            System.out.println(1);
        else if (a <= 0 && b > 0 && c <= 0) // b
            System.out.println(1);
        else if (a <= 0 && b <= 0 && c > 0) // c
            System.out.println(1);

        else if (a <= 0 && b <= 0 && c <= 0)
            System.out.println(0);
    }
}
