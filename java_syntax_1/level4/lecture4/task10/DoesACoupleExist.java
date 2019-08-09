package javarush.java_syntax_1.level4.lecture4.task10;
import java.io.*;
public class DoesACoupleExist {
/*
    Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
    Если такая пара существует, вывести на экран числа через пробел.
    Если все три числа равны между собой, то вывести все три.

    Примеры:
    а) при вводе чисел
1
        2
        2
    получим вывод
2 2
*/
/*
package com.javarush.Task.task04.task0417;
*/
/*
Существует ли пара?
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String q = reader.readLine();
        String w = reader.readLine();
        String e = reader.readLine();
        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);
        int c = Integer.parseInt(e);

        if ((a == b) && (a == c))
            System.out.println(a + " " + b + " " + c);
        else if ((a == b) && (a != c))
            System.out.println(a + " " + b);
        else{}


    }
}
