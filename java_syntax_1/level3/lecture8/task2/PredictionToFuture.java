package javarush.java_syntax_1.level3.lecture8.task2;

import java.io.*;

public class PredictionToFuture {
/*
    package com.javarush.Task.task03.task0319;
*/
/*
Предсказание на будущее
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String name = reader.readLine();
        String sAge = reader.readLine();
        String kAge = reader.readLine();

        System.out.println(name + " получает " + sAge + " через " + kAge + " лет.");

    }
}
