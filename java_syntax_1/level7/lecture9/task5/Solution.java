package javarush.java_syntax_1.level7.lecture9.task5;
/*
package com.javarush.Task.task07.task0717;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удваиваем слова
*/
/*
1. Введи с клавиатуры 10 слов в список строк.

2. Метод doubleValues должен удваивать слова по принципу:
альфа,бета,гамма -> альфа,альфа,бета,бета,гамма,гамма

3. Выведи результат на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));// Считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);
        for (int i = 0; i < result.size(); i++) {// Вывести на экран result
            System.out.println(list.get(i));
        }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++){//напишите тут ваш код
            list.add(i, list.get(i));
            i++;
        }
        return list;
    }

}

