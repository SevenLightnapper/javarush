package javarush.java_syntax_1.level5.lecture7.task3;

/*
    package com.javarush.Task.task05.task0511;
*/
/*
Создать класс Dog
*/
/*
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/
    public class Dog {
        String name = null;
        int height;
        String color;//напишите тут ваш код

        public void initialize(String name){
            this.name = name;
        }
        public void initialize(String name, int height){
            this.name = name;
            this.height = height;
        }
        public void initialize(String name, int height, String color){
            this.name = name;
            this.height = height;
            this.color = color;
        }
        public static void main(String[] args) {

        }
    }


