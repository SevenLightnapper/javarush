package javarush.java_core_2.level2.lecture9.task3;
/*
package com.javarush.Task.task12.task1218;
*/
/*
Есть, летать и двигаться
*/
/*
Есть public интерфейсы Fly(летать), Move(передвигаться), Eat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public abstract class Dog implements Move, Eat {
        public void eat(){}
        public void move(){}
    }

    public abstract class Duck implements Fly, Eat, Move {
        public void fly(){}
        public void eat(){}
        public void move(){}
    }

    public abstract class Car implements Move {
        public void move(){}
    }

    public abstract class Airplane implements Fly, Move {
        public void fly(){}

        public void Move(){}
    }
}

