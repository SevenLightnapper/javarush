package javarush.java_syntax_1.level7.lecture6.task5;
/*
package com.javarush.Task.task07.task0711;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить
*/
/*
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            list.add(read.readLine());
        }
        for (int i = 0; i < 13 ; i++) {
            list.add(0, list.get(list.size()-1));
            list.remove(list.size()-1);
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

