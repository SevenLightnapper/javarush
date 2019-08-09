package javarush.java_syntax_1.level8.lecture6.task3;
/*
package com.javarush.Task.task08.task0809;
*/
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Время для 10 тысяч вставок
*/
/*
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время своего исполнения в миллисекундах.
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        Date startTime = new Date();//напишите тут ваш код

        insert10000(list);

        Date endTime = new Date();//напишите тут ваш код
        long msTimeDistance = endTime.getTime() - startTime.getTime();
        return msTimeDistance;

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}

