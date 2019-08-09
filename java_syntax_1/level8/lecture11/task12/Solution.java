package javarush.java_syntax_1.level8.lecture11.task12;
/*
package com.javarush.Task.task08.task0830;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Задача по алгоритмам
*/
/*
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
Каждое слово - с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];

        //System.out.println(isGreaterThan(n,nn));
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }





        sort(array);
        //System.out.println(Arrays.toString(array));
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        Arrays.sort(array);
        String s="b";
        String a="s";
        isGreaterThan(s,a);
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b)>0;
    }



}

