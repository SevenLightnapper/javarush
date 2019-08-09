package javarush.java_syntax_1.level7.lecture9.task2;
/*
package com.javarush.Task.task07.task0714;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Слова в обратном порядке
*/
/*
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка,
и выведи оставшиеся элементы в обратном порядке.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 5;  i++){
            String s = reader.readLine();
            list.add(s);
        }

        list.remove(2);

        for(int i = 0; i < list.size(); i++){
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}


