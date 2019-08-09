package javarush.java_core_2.level2.lecture12.task7;
/*
package com.javarush.Task.task12.task1227;
*/
/*
Fly, Run, Swim для классов Duck, Penguin, Toad
*/
/*
Есть интерфейсы Fly(летать), Swim(плавать), Run(бегать).
Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба)
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }

    public abstract class Duck implements Fly, Run, Swim {

    }

    public abstract class Penguin implements Run, Swim {

    }

    public abstract class Toad implements Swim {

    }
}
