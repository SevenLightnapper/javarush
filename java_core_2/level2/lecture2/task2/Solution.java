package javarush.java_core_2.level2.lecture2.task2;
/*
package com.javarush.Task.task12.task1202;
*/
/*
Кит, коровий потомок
*/
/*
Переопределить метод getName в классе Whale(Кит), чтобы программа ничего не выводила на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "";
        }
    }
}

