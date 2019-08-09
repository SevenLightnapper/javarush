package javarush.java_syntax_1.level5.lecture7.task2;
/*
package com.javarush.Task.task05.task0510;
*/
/*
Кошкоинициация
*/
/*
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста.
А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat {
    String name = null;
    String address = null;
    String color = null;
    int age;
    int weight;//напишите тут ваш код

    public void initialize(String name){
        this.name = name;
        this.color = "blue";
        this.age = 2;
        this.weight = 13;
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "purple";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.color = "red";
        this.weight = 10;
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.age = 12;
        this.color = color;
    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 9;
    }


    public static void main(String[] args) {

    }
}

