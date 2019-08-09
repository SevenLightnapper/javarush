package javarush.java_syntax_1.level9.lecture6.task2;
/*
package com.javarush.Task.task09.task0908;
*/
/*
Исключение при работе со строками
*/
/*
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try { //напишите тут ваш код
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e) { //напишите тут ваш код
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

