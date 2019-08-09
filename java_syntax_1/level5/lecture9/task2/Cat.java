package javarush.java_syntax_1.level5.lecture9.task2;
/*
    package com.javarush.Task.task05.task0517;
*/
/*
Конструируем котиков
*/
/*
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)
*/
    public class Cat {
        String name = null;
        String color = null;
        String address = null;
        int age;
        int weight;
        public Cat(String name){
            this.name = name;
            this.color = "black";
            this.age = 5;
            this.weight = 10;
        }
        public Cat(String name, int weight, int age){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = "white";
        }
        public Cat(String name, int age){
            this.name = name;
            this.age = age;
            this.color = "red";
            this.weight = 17;
        }
        public Cat(int weight, String color){
            this.weight =weight;
            this.age = 3;
            this.color = color;
        }
        public Cat(int weight, String color, String address){
            this.weight = weight;
            this.color = color;
            this.address = address;
            this.age = 11;
        }//напишите тут ваш код

        public static void main(String[] args) {

        }
    }


