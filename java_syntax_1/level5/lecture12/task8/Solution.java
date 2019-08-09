package javarush.java_syntax_1.level5.lecture12.task8;
/*
package com.javarush.Task.task05.task0532;
*/
import java.io.*;

/*
Задача по алгоритмам
*/
/*
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int n = Integer.parseInt(reader.readLine());
        for(int i = 0; i < n; i++){

            int a = Integer.parseInt(reader.readLine());

            if(i == 0) {
                maximum = a;
            }
            if (a<0 && a<maximum) {
                a = maximum;
            }
            else if (a>maximum){
                maximum=a;
            }

        }System.out.println(maximum);
    }
}
