package javarush.java_syntax_1.level4.lecture6.task1;
import java.io.*;
public class MinimumOfTwoNumbers {
/*
    package com.javarush.Task.task04.task0418;
*/
/*
Минимум двух чисел
*/
/*
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String q = reader.readLine();
        String w = reader.readLine();
        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);

        if (a < b)
            System.out.println(a);
        else if (a == b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}
