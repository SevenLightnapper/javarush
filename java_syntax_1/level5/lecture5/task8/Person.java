package javarush.java_syntax_1.level5.lecture5.task8;

public class Person {
/*
    package com.javarush.Task.task05.task0508;
*/
/*
Геттеры и сеттеры для класса Person
*/
/*
Cоздать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
Создайте геттеры и сеттеры для всех переменных класса Person.
*/
    String name;
    int age;
    char sex;

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
    }//напишите тут ваш код

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
