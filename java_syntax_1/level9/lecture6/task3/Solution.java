package javarush.java_syntax_1.level9.lecture6.task3;
/*
package com.javarush.Task.task09.task0909;
*/
/*
Исключение при работе с массивами
*/
/*
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try //напишите тут ваш код
        {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);//напишите тут ваш код
        }
    }
}

