package javarush.java_syntax_1.level8.lecture8.task3;
/*
package com.javarush.Task.task08.task0815;
*/
import java.util.HashMap;

/*
Перепись населения
*/
/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();//напишите тут ваш код
        map.put("black", "Olivia");
        map.put("harris", "Calvin");
        map.put("johanson", "Scarlet");
        map.put("pitt", "Bred");
        map.put("stein", "Eric");
        map.put("robinson", "Julia");
        map.put("diesel", "Vin");
        map.put("edison", "Thomas");
        map.put("peterson", "Bob");
        map.put("clark", "Emilia");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int sameName = 0;
        for( String i : map.values()){
            if(i.equals(name)){
                sameName++;
            }
        }
        return sameName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int sameSurname = 0;
        for( String i : map.keySet()){
            if(i.equals(lastName)){
                sameSurname++;
            }
        }
        return sameSurname;//напишите тут ваш код

    }

    public static void main(String[] args) {
        //System.out.println(getCountTheSameFirstName(createMap(), "Julia") + getCountTheSameLastName(createMap(), "diesel")); <- doesn't exist in the Task. I added it in order to check if the program is working.
    }
}

