package javarush.java_syntax_1.level4.lecture10.task3;
import java.io.*;
public class GoodDoesNotHappenMuch {
/*
    package com.javarush.Task.task04.task0432;
*/
/*
Хорошего много не бывает
*/
/*
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String name = reader.readLine();
        String sAge = reader.readLine();
        int age = Integer.parseInt(sAge);

        while (0 < age) {
            System.out.println(name);
            age--;
        }
    }
}
