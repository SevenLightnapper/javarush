package javarush.java_syntax_1.level8.lecture3.task6;
/*
package com.javarush.Task.task08.task0806;
*/
import java.util.HashMap;
import java.util.Map;

/*
Коллекция HashMap из Object
*/
/*
Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
Sim - 5
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        for(Map.Entry<String, Object> pair : map.entrySet()){
            String key = pair.getKey();
            Object value = pair.getValue();//напишите тут ваш код
            System.out.println(key + " - " + value);
        }

    }
}
