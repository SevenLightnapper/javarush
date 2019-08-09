package javarush.java_syntax_1.level5.lecture7.task6;
/*
package com.javarush.Task.task05.task0514;
*/
/*
Программист создает человека
*/
/*
Создать class Person. У человека должно быть имя String name, возраст int age.
Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
В методе main создай объект Person, занеси его ссылку в переменную person.
Вызови метод initialize с любыми значениями.
*/
public class Solution {

    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Mark", 15);//напишите тут ваш код
    }

    static class Person {
        String name = null;
        int age;
        //напишите тут ваш код
        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
