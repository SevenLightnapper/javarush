package javarush.java_syntax_1.level8.lecture6.task5;
/*
package com.javarush.Task.task08.task0811;
*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Квартет «Методы»
*/
/*
Реализовать 4 метода.
Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.
*/

public class Solution {
    public static List getListForGet() {
        ArrayList list1 = new ArrayList();//напишите тут ваш код
        return list1;
    }

    public static List getListForSet() {
        ArrayList list2 = new ArrayList();//напишите тут ваш код
        return list2;
    }

    public static List getListForAddOrInsert() {
        LinkedList list3 = new LinkedList();//напишите тут ваш код
        return list3;
    }

    public static List getListForRemove() {
        LinkedList list4 = new LinkedList();//напишите тут ваш код
        return list4;
    }

    public static void main(String[] args) {

    }
}
