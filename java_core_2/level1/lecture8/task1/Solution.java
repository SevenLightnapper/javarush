package javarush.java_core_2.level1.lecture8.task1;
/*
package com.javarush.Task.task11.task1106;
*/
/*
Скрытный инкапсулированный кот
*/
/*
Скрыть все внутренние переменные класса Cat.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}

