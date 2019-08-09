package javarush.java_syntax_1.level4.lecture16.task3;
import java.io.*;
public class Summing {
/*
    package com.javarush.Task.task04.task0442;
*/
/*
Суммирование
*/
/*
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.
*/
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int summ = 0;

        for ( ; true; ){
            String txt = r.readLine();

            if (!txt.equals("-1")){
                int a = Integer.parseInt(txt);
                summ += a;
            }
            else break;
        }
        System.out.println(summ + (-1));
    }
}
