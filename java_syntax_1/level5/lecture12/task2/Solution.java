package javarush.java_syntax_1.level5.lecture12.task2;
/*
package com.javarush.Task.task05.task0526;
*/
/*
Мужчина и женщина
*/
/*
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
*/

public class Solution {
    public static void main(String[] args) {
        Woman woman1 = new Woman("Kim", 11, "San Francisco");
        Woman woman2 = new Woman("Kelly", 25, "New York");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);//напишите тут ваш код
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

        Man man1 = new Man("Mark", 30, "Rome");
        Man man2 = new Man("Jhon", 27, "London");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
    }

    public static class Man{
        String name = null;
        int age;
        String address = null;
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }//напишите тут ваш код

    public static class Woman{
        String name = null;
        int age;
        String address = null;
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}

