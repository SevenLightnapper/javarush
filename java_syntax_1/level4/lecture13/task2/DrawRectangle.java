package javarush.java_syntax_1.level4.lecture13.task2;
import java.io.*;
public class DrawRectangle {
/*
    package com.javarush.Task.task04.task0436;
*/
/*
Рисуем прямоугольник
*/
/*
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String s = reader.readLine();
        String q = reader.readLine();
        int n = Integer.parseInt(q);
        int m = Integer.parseInt(s);


        for (int d = n; m > 0; m--) {
            for (; n > 0; n--) {
                System.out.print(8);
            }
            System.out.println();
            n = d;
        }
    }
}
