package javarush.java_syntax_1.level8.lecture11.task3;
/*
package com.javarush.Task.task08.task0821;
*/
import java.util.HashMap;
import java.util.Map;

/*
Однофамильцы и тёзки
*/
/*
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<String, String>();//напишите тут ваш код
        map.put("black", "Olivia");
        map.put("harris", "Calvin");
        map.put("johanson", "Scarlet");
        map.put("pitt", "Bred");
        map.put("black", "Thomas");
        map.put("robinson", "Julia");
        map.put("diesel", "Vin");
        map.put("edison", "Thomas");
        map.put("peterson", "Bob");
        map.put("clark", "Emilia");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

