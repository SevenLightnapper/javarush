package javarush.java_syntax_1.level7.lecture6.task6;
/*
package com.javarush.Task.task07.task0712;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/
/*
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int min = 0;
        for(int i = 0; i < 10; i++){
            list.add(reader.readLine());
            if(i > 0){
                max = list.get(i).length() > list.get(max).length() ? i : max;
                min = list.get(i).length() < list.get(min).length() ? i : min;
            }
        }
        String s = min < max ? list.get(min) : list.get(max);
        System.out.println(s);
    }
}
