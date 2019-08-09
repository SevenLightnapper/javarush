package javarush.java_syntax_1.level8.lecture8.task5;
/*
package com.javarush.Task.task08.task0817;
*/
import java.util.*;

/*
Нам повторы не нужны
*/
/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> q = new HashMap<>();
        for(int i = 0; i < 10; i++ )
            q.put("fam" + i, "" + i);
        return q;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String,String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String,String>> iterator = copy.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String,String> elem = iterator.next();
            int curSize = map.size();
            removeItemFromMapByValue(map, elem.getValue());
            if (curSize - map.size()  == 1)
                map.put(elem.getKey(),elem.getValue());
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
