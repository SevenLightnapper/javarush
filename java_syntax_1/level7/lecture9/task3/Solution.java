package javarush.java_syntax_1.level7.lecture9.task3;
/*
package com.javarush.Task.task07.task0715;
*/
import java.util.ArrayList;

/*
Продолжаем мыть раму
*/
/*
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for(int i = 1; i < list.size() + 1; i = i + 2){
            list.add(i, "именно");
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }//напишите тут ваш код
    }
}

