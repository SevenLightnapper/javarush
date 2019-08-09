package javarush.java_syntax_1.level5.lecture5.task4;

public class Solution {
    /*
        package com.javarush.Task.task05.task0504;
    */
/*
Трикотаж
*/
    public static void main(String[] args) {
        Cat jack = new Cat("Jack", 4, 7, 9);
        Cat kim = new Cat("Kim", 7, 3, 2);
        Cat max = new Cat("Max", 1, 2, 10);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}

