package javarush.java_core_2.level2.lecture4.task4;
/*
package com.javarush.Task.task12.task1209;
*/
/*
Три метода и минимум
*/
/*
Написать public static методы: int min(int, int), long min(long, long),
double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int a, int b) {//Напишите тут ваши методы
        if (a < b){
            return a;
        }
        else
            return b;
    }
    public static long min(long l, long k) {
        if (l < k){
            return l;
        }
        else
            return k;
    }
    public static double min(double d, double s) {
        if (d < s){
            return d;
        }
        else
            return s;
    }
}

