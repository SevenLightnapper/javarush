package javarush.java_syntax_1.level7.lecture12.task2;
/*
package com.javarush.Task.task07.task0720;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Перестановочка подоспела
*/
/*
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int M = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < N; i++){
            String s = reader.readLine();
            list.add(s);
        }
        for(int i = M; i > 0; i--){
            list.add(list.get(0));
            list.remove(0);
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

