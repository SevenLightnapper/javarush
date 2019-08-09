package javarush.java_syntax_1.level5.lecture7.task1;


/*
    package com.javarush.Task.task05.task0509;
*/
/*
Создать класс Friend
*/
/*
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол

Примечание:
Имя(String), возраст(int), пол(char).
*/
    public class Friend {
    String name = null;//напишите тут ваш код
    int age;
    char sex;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void initialize(String name, int age, char sex) {
        this.sex = sex;
        this.age = age;
        this.name = name;
    }

        public static void main(String[] args) {

        }
    }


