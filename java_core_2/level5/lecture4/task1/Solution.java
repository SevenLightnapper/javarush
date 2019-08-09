package javarush.java_core_2.level5.lecture4.task1;
/*
package com.javarush.task.task15.task1506;
*/
/*
Что-то лишнее
*/
/*
1. Программа должна выводить следующее:
Это double
Это Object
Это double
Это Integer
Это double
*/

public class Solution {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("Это Integer");
    }

    public static void print(Object i) {
        System.out.println("Это Object");
    }

    public static void print(double i) {
        System.out.println("Это double");
    }
}

