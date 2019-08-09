package javarush.java_syntax_1.level8.lecture8.task6;
/*
package com.javarush.Task.task08.task0818;
*/

import java.util.HashMap;

/*
Только для богачей
*/
/*
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();//напишите тут ваш код
        map.put("a", 120);
        map.put("s", 1200);
        map.put("Solution", 500);
        map.put("f", 350);
        map.put("g", 660);
        map.put("h", 449);
        map.put("j", 499);
        map.put("k", 765);
        map.put("l", 1410);
        map.put("m", 50);
        //removeItemFromMap(map); <- needed to check whether the program is working
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> c = new HashMap<String, Integer>(map);//создаю копию
        for (HashMap.Entry<String, Integer> p : c.entrySet()){ //p - цикл итератор, перебирает ту самую копию коллекции
            if (p.getValue()<500){ //если значение оказалось меньше 500, удаляем текущий ключ
                map.remove(p.getKey()); //собственно само действие, если условие выше верно, удаляю текущий ключ, значение от которого подошло условию.
            }
        }

    }

    public static void main(String[] args) {
        //System.out.println(createMap()); <- needed to check whether the program is working
    }
}
