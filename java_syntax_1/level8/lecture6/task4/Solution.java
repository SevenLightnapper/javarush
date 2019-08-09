package javarush.java_syntax_1.level8.lecture6.task4;
/*
package com.javarush.Task.task08.task0810;
*/
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Время для 10 тысяч вызовов get
*/
/*
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet должен вернуть время своего исполнения в миллисекундах.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimeMsOfGet(List list) {
        Date start = new Date();//напишите тут ваш код

        get10000(list);

        Date end = new Date();//напишите тут ваш код
        long difference = end.getTime()- start.getTime();
        return difference;
    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}

