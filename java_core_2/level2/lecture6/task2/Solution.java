package javarush.java_core_2.level2.lecture6.task2;
/*
package com.javarush.Task.task12.task1212;
*/
/*
«Исправь код», часть 1
*/
/*
Исправь код, чтобы программа компилировалась.

Подсказка:
метод getChild должен остаться абстрактным.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}

