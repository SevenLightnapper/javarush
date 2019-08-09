package javarush.java_syntax_1.level9.lecture11.task9;
/*
package com.javarush.Task.task09.task0927;
*/
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Десять котов
*/
/*
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();//напишите тут ваш код
        map.put("Kelly", new Cat("Bruster"));
        map.put("Bob", new Cat("Lime"));
        map.put("Kel", new Cat("Prand"));
        map.put("Kim", new Cat("Bruce"));
        map.put("Shreck", new Cat("Voul"));
        map.put("Lily", new Cat("Sham"));
        map.put("Swing", new Cat("Tyll"));
        map.put("Light", new Cat("Accel"));
        map.put("Sam", new Cat("Shvartsz"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> listCat = new HashSet<>();
        for (Map.Entry<String,Cat> m: map.entrySet()) {
            listCat.add(m.getValue());
        }
        return listCat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

