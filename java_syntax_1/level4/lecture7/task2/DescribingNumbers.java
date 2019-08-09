package javarush.java_syntax_1.level4.lecture7.task2;
import java.io.*;
public class DescribingNumbers {
    /*
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

Пример для числа 100:
четное трехзначное число

Пример для числа 51:
нечетное двузначное число
*/
/*
package com.javarush.Task.task04.task0427;
*/
/*
Описываем числа
*/

    static int digits(int a) {
        return String.valueOf(Math.abs(a)).length();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String sNumber = reader.readLine();
        int a = Integer.parseInt(sNumber);


        if (((a % 2) == 0) && (digits(a) == 1) && (a >= 1 && a <= 999))
                System.out.println("четное однозначное число");
        else if (((a + 1) % 2 == 0) && (digits(a) == 1) && (a >= 1 && a <= 999))
        System.out.println("нечетное однозначное число");

        if (((a % 2) == 0) && (digits(a) == 2) && (a >= 1 && a <= 999))
            System.out.println("четное двузначное число");
        else if (((a + 1) % 2 == 0) && (digits(a) == 2))
            System.out.println("нечетное двузначное число");

        if (((a % 2) == 0) && (digits(a) == 3) && (a >= 1 && a <= 999))
            System.out.println("четное трехзначное число");
        else if (((a + 1) % 2 == 0) && (digits(a) == 3) && (a >= 1 && a <= 999))
            System.out.println("нечетное трехзначное число");
        else if (a < 1 && a > 999){}
    }
}
