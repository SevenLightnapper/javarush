package javarush.java_syntax_1.level5.lecture7.task7;

/*
    package com.javarush.Task.task05.task0515;
*/
/*
Инициализация объектов
*/
/*
Изучи внимательно класс Person.
Исправь класс так,
чтобы только один метод initialize инициализировал все переменные класса Person.
*/
    public class Person {
        String name;
        char sex;
        int money;
        int weight;
        double size;

        public void initialize(String name, int money, char sex, int weight, double size) {
            this.name = name;
            this.money = money;
            this.sex = sex;
            this.weight = weight;
            this.size = size;
        }

        public static void main(String[] args) {

        }
    }

