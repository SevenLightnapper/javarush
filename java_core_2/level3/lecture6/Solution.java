package javarush.java_core_2.level3.lecture6;
/*
package com.javarush.Task.task13.task1315;
*/
/*
Том, Джерри и Спайк
*/
/*
1. Создай классы Dog, Cat и Mouse.
2. Реализуй интерфейсы в добавленных классах, учитывая что:
- Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
- Мышь(Mouse) может передвигаться и может быть съедена.
- Собака(Dog) может передвигаться и съесть кого-то.
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    class Cat implements Eat, Eatable, Movable {
        public void move(){}
        public void eaten(){}
        public void eat(){}
    }
    class Dog implements Eat, Movable {
        public void move(){}
        public void eat(){}
    }
    class Mouse implements Eatable, Movable {
        public void move(){}
        public void eaten(){}
    }
}
