package javarush.java_syntax_1.level4.lecture6.task8;
import java.io.*;
public class TargetIsTargeted {
/*
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

Пример для чисел 4 6:
1

Пример для чисел -6 -6:
3
*/
/*
package com.javarush.Task.task04.task0425;
*/
/*
Цель установлена!
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String q = reader.readLine();
        String w = reader.readLine();
        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);

        if (a > 0 && b > 0)
            System.out.println(1);
        else if (a < 0 && b > 0)
            System.out.println(2);
        else if (a < 0 && b < 0)
            System.out.println(3);
        else if (a > 0 && b < 0)
            System.out.println(4);
    }
}
