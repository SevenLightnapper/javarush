package javarush.java_core_2.level3.lecture2.task4;
/*
package com.javarush.Task.task13.task1304;
*/
/*
Selectable и Updatable
*/
/*
Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable.
Не забудь реализовать методы!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //напишите тут ваш класс
    public static class Screen implements Selectable, Updatable {
        public void onSelect(){}
        public void refresh(){}
    }
}

