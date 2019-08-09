package javarush.java_syntax_1.level4.lecture4.task8;

import java.io.*;

public class TriangleRule {
/*
    Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
    Определить возможность существования треугольника по сторонам.
    Результат вывести на экран в следующем виде:
            "Треугольник существует." - если треугольник с такими сторонами существует.
            "Треугольник не существует." - если треугольник с такими сторонами не существует.

         Подсказка:
1.   Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
2.   Требуется сравнить каждую сторону с суммой двух других.
3.   Если хотя бы в одном случае сторона окажется больше или равна сумме двух других, то треугольника с такими сторонами не существует.
*/
/*
package com.javarush.Task.task04.task0415;
*/
/*
Правило треугольника
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String ax = reader.readLine(); //напишите тут ваш код
        String bx = reader.readLine();
        String cx = reader.readLine();
        int a = Integer.parseInt(ax);
        int b = Integer.parseInt(bx);
        int c = Integer.parseInt(cx);

        if ((a < b + c) && (b < a + c) && (c < a + b))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}
