package javarush.java_core_2.level5.lecture4.task2;
/*
package com.javarush.task.task15.task1507;
*/
/*
ООП - Перегрузка
*/
/*
Перегрузите метод printMatrix 8 различными способами.
В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(String value, int m, int n) {
        System.out.println("Method number " + 3 + "paramters: " + value + " " +  m + " " + n);
    }
    public static void printMatrix(int n, byte value, String m) {
        System.out.println("Method number " + 4 + "parameters: " + n + " " + value + " " + m);
    }
    public static void printMatrix(byte b, Integer sh, Object d) {
        System.out.println("Method number " + 5 + "parameters: " + b + " " + sh + " " + d);
    }
    public static void printMatrix(short sh, byte b, String d) {
        System.out.println("Method number " + 6 + "parameters: " + sh + " " + b + " " + d);
    }
    public static void printMatrix(double d, short sh, Object b) {
        System.out.println("Method number " + 7 + "parameters: " + d + " " + sh + " " + b);
    }
    public static void printMatrix(short sh, double d, String b) {
        System.out.println("Method number " + 8 + "parameters: " + b + " " + sh + " " + d);
    }
    public static void printMatrix(Integer i, short sh, Object d) {
        System.out.println("Method number " + 9 + "parameters: " + i + " " + sh + " " + d);
    }
    public static void printMatrix(byte b, short sh, String d) {
        System.out.println("Method number " + 10 + "parameters: " + b + " " + sh + " " + d);
    }

}
