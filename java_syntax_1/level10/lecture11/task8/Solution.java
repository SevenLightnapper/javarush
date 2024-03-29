package javarush.java_syntax_1.level10.lecture11.task8;
/*
package com.javarush.Task.task10.task1015;
*/
import java.util.ArrayList;

/*
Массив списков строк
*/
/*
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] allList = new ArrayList[3];
        for(int i = 0; i < allList.length; i++) {
            allList[i] = new ArrayList<String>();
            allList[i].add("ххх" + i);
        }

        return allList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
