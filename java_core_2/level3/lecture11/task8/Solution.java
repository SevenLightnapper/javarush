package javarush.java_core_2.level3.lecture11.task8;
/*
package com.javarush.Task.task13.task1323;
*/
/*
Интерфейс Updatable в классе Screen
*/
/*
Реализовать интерфейс Updatable в классе Screen.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {
        public void onSelect(){}
        public void refresh(){}
    }
}

