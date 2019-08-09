package javarush.java_syntax_1.level10.lecture11.task12;
/*
package com.javarush.Task.task10.task1019;
*/
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/
/*
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.
Каждую пару с новой строки.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (true) {

            String id = reader.readLine();
            if (id.isEmpty())break;

            String name = reader.readLine();
            map.put(name, Integer.parseInt(id));
            if (name.isEmpty())break;

        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}

