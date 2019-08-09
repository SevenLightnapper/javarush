package javarush.java_syntax_1.level7.lecture6.task3;
/*
package com.javarush.Task.task07.task0709;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Выражаемся покороче
*/
/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();//напишите тут ваш код

        for(int i = 0; i < 5; i++){
            String s = reader.readLine();
            list.add(s);
        }
        for (int a=0; a<list.size(); a++) {
            int yes = 0;
            for (int b = 0; b < list.size(); b++) {
                if (list.get(a).length() <= list.get(b).length())
                    yes++;
            }
            if (yes == 5)
                System.out.println(list.get(a));
        }
        }
}

