package javarush.java_core_2.level2.lecture9.task5;
/*
package com.javarush.Task.task12.task1220;
*/
/*
Класс Human и интерфейсы Run, Swim
*/
/*
Напиши public класс Human(человек) и public интерфейсы Run(бежать/ездить), Swim(плавать).
Добавь в каждый интерфейс по oдному методу.
Добавь эти интерфейсы классу Human, но не реализуй методы.
Объяви класс Human абстрактным.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Swim {
        public void swim();
    }

    public interface Run {
        public void run();
    }

    public abstract class Human implements Run, Swim {

    }

    //add public interfaces and public class here - добавь public интерфейсы и public класс тут
}

