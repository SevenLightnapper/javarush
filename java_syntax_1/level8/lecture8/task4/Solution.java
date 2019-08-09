package javarush.java_syntax_1.level8.lecture8.task4;
/*
package com.javarush.Task.task08.task0816;
*/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/
/*
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM Solution yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Black", df.parse("JUNE 20 1980"));
        map.put("Pitt", df.parse("AUGUST 1 1990"));
        map.put("Nielson", df.parse("MARCH 17 1994"));
        map.put("Rayan", df.parse("JANUARY 1 2000"));
        map.put("Jackson", df.parse("SEPTEMBER 19 1999"));
        map.put("Delevingne", df.parse("AUGUST 12 1992"));
        map.put("Lightnapper", df.parse("AUGUST 11 2003"));
        map.put("Lightnapper Jr.", df.parse("AUGUST 28 2015"));
        map.put("Lightnapper Bicks", df.parse("SEPTEMBER 11 2014"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Calendar cal = Calendar.getInstance();
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            cal.setTime(iterator.next().getValue());
            if (cal.get(Calendar.MONTH) >= 5 && cal.get(Calendar.MONTH) <= 7) iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}

