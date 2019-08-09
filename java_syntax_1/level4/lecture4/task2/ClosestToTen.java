package javarush.java_syntax_1.level4.lecture4.task2;

public class ClosestToTen {
/*
    package com.javarush.Task.task04.task0409;
*/
/*
Ближайшее к 10
*/


    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);
    }

    public static void closeToTen(int a, int b) {

        if (abs(a-10) < abs(b-10))
            System.out.println(a);
        else
            System.out.println(b); //напишите тут ваш код

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
