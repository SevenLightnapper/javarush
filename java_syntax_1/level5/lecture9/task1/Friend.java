package javarush.java_syntax_1.level5.lecture9.task1;

/*
    package com.javarush.Task.task05.task0516;
*/
/*
Друзей не купишь
*/
/*
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

    public class Friend {
        private String name = null;
        private int age;
        private char sex;
        public Friend(String name){
            this.name = name;
        }
        public Friend(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Friend(String name, int age, char sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }//напишите тут ваш код

        public static void main(String[] args) {

        }
    }

