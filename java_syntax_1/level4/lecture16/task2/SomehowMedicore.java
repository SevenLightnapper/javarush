package javarush.java_syntax_1.level4.lecture16.task2;
import java.io.*;
public class SomehowMedicore {
/*
    package com.javarush.Task.task04.task0441;
*/
/*
Как-то средненько
*/
/*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String q = reader.readLine();
        String e = reader.readLine();
        String w = reader.readLine();
        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);
        int c = Integer.parseInt(e);

        if (a < b && b < c)
            System.out.println(b);
        if (c < b && b < a)
            System.out.println(b);

        else if (b > a && a > c)
            System.out.println(a);
        else if (c > a && a > b)
            System.out.println(a);

        else if (a > c && c > b)
            System.out.println(c);
        else if (b > c && c > a)
            System.out.println(c);

        else if (a == b && b == c)
            System.out.println(a);

        else if (a == b && a < c)
            System.out.println(a);
        else if (a == b && a > c)
            System.out.println(a);

        else if (a == c && a < b)
            System.out.println(c);
        else if (a == c && a > b)
            System.out.println(c);

        else if (b == c && a < c)
            System.out.println(b);
        else if (b == c && a > c)
            System.out.println(b);
    }
}
