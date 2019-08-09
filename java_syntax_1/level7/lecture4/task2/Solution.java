package javarush.java_syntax_1.level7.lecture4.task2;
/*
package com.javarush.Task.task07.task0702;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из строчек в обратном порядке
*/
/*
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
Каждый элемент - с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] mass = new String[10];
        for(int i = 2; i < mass.length; i++){
            mass[i] = reader.readLine();
        }
        System.out.println(mass[9]);//напишите тут ваш код
        System.out.println(mass[8]);//напишите тут ваш код
        System.out.println(mass[7]);//напишите тут ваш код
        System.out.println(mass[6]);//напишите тут ваш код
        System.out.println(mass[5]);//напишите тут ваш код
        System.out.println(mass[4]);//напишите тут ваш код
        System.out.println(mass[3]);//напишите тут ваш код
        System.out.println(mass[2]);//напишите тут ваш код
        System.out.println(mass[1]);//напишите тут ваш код
        System.out.println(mass[0]);//напишите тут ваш код
    }
}
