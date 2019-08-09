package javarush.java_syntax_1.level3.lecture5;

public class ConvertWater {
    /* package com.javarush.Task.task01.task0134; */

    /* набираем воду в бассейн */

    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        long s = a * b * c * 1000;
        return s;//напишите тут ваш код
    }
}
