package javarush.java_core_2.level2.lecture4.task5;
/*
package com.javarush.Task.task12.task1210;
*/
/*
Три метода и максимум
*/
/*
Написать public static методы: int max(int, int), long max(long, long),
double max(double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int a, int b) {//Напишите тут ваши методы
        if (a < b){
            return b;
        }
        else
            return a;
    }
    public static long max(long l, long k) {
        if (l < k){
            return k;
        }
        else
            return l;
    }
    public static double max(double d, double s) {
        if (d < s){
            return s;
        }
        else
            return d;
    }
}

