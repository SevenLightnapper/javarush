package javarush.java_core_2.level2.lecture4.task2;
/*
package com.javarush.Task.task12.task1207;
*/
/*
Int и Integer
*/
/*
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution {
    public static void main(String[] args) {
        print((int) 2);
        print((Integer) 1000000000);

    }

    public static void print(int i){
        System.out.println(5 * i);
    }//Напишите тут ваши методы
    public static void print(Integer a){
        System.out.println(10 * a);
    }
}

