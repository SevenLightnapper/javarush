package javarush.java_syntax_1.level7.lecture6.task2;
/*
package com.javarush.Task.task07.task0708;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Самая длинная строка
*/
/*
Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько,
выведи каждую с новой строки.
*/

public class Solution {
    private static List<String> strings;
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();//напишите тут ваш код

        for(int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        for (int a=0; a<strings.size(); a++){
            int yes=0;
            for (int b=0; b<strings.size(); b++) {
                if (strings.get(a).length() >= strings.get(b).length())
                    yes++;
            }
            if (yes == 5)
                System.out.println(strings.get(a));

        }
    }
}

