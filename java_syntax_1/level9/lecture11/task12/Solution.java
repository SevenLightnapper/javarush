package javarush.java_syntax_1.level9.lecture11.task12;
/*
package com.javarush.Task.task09.task0930;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Задача по алгоритмам
*/
/*
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.

Пример ввода:
Вишня
1
Боб
3
Яблоко
22
0
Арбуз

Пример вывода:
Арбуз
22
Боб
3
Вишня
1
0
Яблоко
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> number=new ArrayList<Integer>();
        ArrayList<String> names=new ArrayList<String>();
        for(int i=0;i<array.length;i++){
            if(isNumber(array[i])){number.add(Integer.parseInt(array[i]));}
            else
                names.add(array[i]);
        }
        for(int j=0;j<names.size();j++) {
            for (int i = 0; i < names.size() - 1; i++) {
                if (isGreaterThan(names.get(i), names.get(i + 1))) {
                    String n = names.get(i);
                    names.set(i, names.get(i + 1));
                    names.set(i + 1, n);
                }
            }
        }

        for(int j=0;j<number.size();j++){
            for(int i=0;i<number.size()-1;i++){
                if(number.get(i)<number.get(i+1)){
                    Integer m=number.get(i);
                    number.set(i,number.get(i+1));
                    number.set(i+1,m);
                }}
        }

        for (int i=0;i<array.length;i++){
            if(isNumber(array[i])) {
                array[i]=number.get(0).toString();
                number.remove(0);
            }
        }

        for (int i=0;i<array.length;i++){
            if(!isNumber(array[i])) {
                array[i]=names.get(0);
                names.remove(0);
            }
        }
          /*
        for (Integer x:number) {
            System.out.println(x);
        }

        for (String o:names) {
            System.out.println(o);}*/
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}

