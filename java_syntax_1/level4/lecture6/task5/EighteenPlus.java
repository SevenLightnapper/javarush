package javarush.java_syntax_1.level4.lecture6.task5;
import java.io.*;
public class EighteenPlus {
/*
    package com.javarush.Task.task04.task0422;
*/
/*
18+
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String number = reader.readLine();
        int age = Integer.parseInt(number);

        if (age < 18)
            System.out.println("Подрасти еще");
        else{}
    }
}
