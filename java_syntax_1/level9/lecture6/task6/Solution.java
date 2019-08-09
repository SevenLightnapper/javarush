package javarush.java_syntax_1.level9.lecture6.task6;
/*
package com.javarush.Task.task09.task0912;
*/
/*
Исключение при работе с числами
*/
/*
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int num=Integer.parseInt("XYZ");
System.out.println(num);
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException e) {
            String s = e.getClass().getName();
            System.out.println(s);
        }

        //напишите тут ваш код
    }
}

