package javarush.java_core_2.level1.lecture8.task3;
/*
package com.javarush.Task.task11.task1108;
*/
/*
Неприступный кот
*/
/*
Скрыть все внутренние переменные класса Cat,
а также методы,
позволяющие менять внутреннее состояние объектов класса Cat.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }
    }
}