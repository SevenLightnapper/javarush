package javarush.java_syntax_1.level4.lecture6.task2;
import java.io.*;
public class MaximumOfFourNumbers {
/*
    package com.javarush.Task.task04.task0419;
*/
/*
Максимум четырех чисел
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String q = reader.readLine();//напишите тут ваш код
        String r = reader.readLine();
        String e = reader.readLine();
        String w = reader.readLine();

        int a = Integer.parseInt(q);
        int b = Integer.parseInt(r);
        int c = Integer.parseInt(e);
        int d = Integer.parseInt(w);

        if (a >= b && a >= c && a >= d)
            System.out.println(a);
        else if (b > a && b > c && b > d)
            System.out.println(b);
        else if (c > b && c > a && c > d)
            System.out.println(c);
        else
            System.out.println(d);
    }
}
