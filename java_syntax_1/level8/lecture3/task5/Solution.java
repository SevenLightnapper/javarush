package javarush.java_syntax_1.level8.lecture3.task5;
/*
package com.javarush.Task.task08.task0805;
*/
import java.util.HashMap;
import java.util.Map;

/*
На экране — значения!
*/
/*
Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        for(Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getValue();
            System.out.println(value);//напишите тут ваш код
        }
    }
}

