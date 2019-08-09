package javarush.java_syntax_1.level9.lecture11.task8;
/*
package com.javarush.Task.task09.task0926;
*/
import java.util.ArrayList;

/*
Список из массивов чисел
*/
/*
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {6, 7};
        int[] list3 = {8, 9, 10, 11};//напишите тут ваш код
        int[] list4 = {12, 13, 14, 15, 16, 17, 18};
        int[] nothing = {};
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(nothing);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

