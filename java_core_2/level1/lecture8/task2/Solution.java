package javarush.java_core_2.level1.lecture8.task2;
/*
package com.javarush.Task.task11.task1107;
*/
/*
Наш кот слишком публичен!
*/
/*
Скрыть внутренние переменные класса Cat, к которым есть доступ с помощью методов.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
