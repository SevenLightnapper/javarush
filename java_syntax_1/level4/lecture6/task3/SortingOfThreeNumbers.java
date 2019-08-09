package javarush.java_syntax_1.level4.lecture6.task3;
import java.io.*;
public class SortingOfThreeNumbers {
/*
    package com.javarush.Task.task04.task0420;
*/
/*
Сортировка трех чисел
*/
/*
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
 */
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());

        int min = Math.min(Math.min(a,b),c);
        int mid = (a + b + c) - ((Math.min(Math.min(a,b),c))+(Math.max(Math.max(a,b),c)));
        int max = Math.max(Math.max(a,b),c);

        System.out.println(max + " " + mid + " " + min);
    }
}