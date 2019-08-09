package javarush.java_syntax_1.level4.lecture6.task6;
import java.io.*;
public class FaceControl {
/*
    package com.javarush.Task.task04.task0423;
*/
/*
Фейс-контроль
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String name = reader.readLine();
        String sAge = reader.readLine();
        int age = Integer.parseInt(sAge);

        if (age > 20)
            System.out.println("И 18-ти достаточно");
        }
}
