package javarush.java_syntax_1.level4.lecture2.task1;

public class Cat {
/*
    package com.javarush.Task.task04.task0403;
*/
/*
    Как зовут кота?
*/
        private String name = "безымянный кот";

        public void setName(String name) {
            this.name = name;//напишите тут ваш код
        }

        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.setName("Жужик");
            System.out.println(cat.name);
        }
}
