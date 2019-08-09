package javarush.java_core_2.level2.lecture9.task4;
/*
package com.javarush.Task.task12.task1219;
*/
/*
Создаем человека
*/
/*
Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
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


    public class Human implements Run, Swim {
        public void run(){}
        public void swim(){}
    }

    public class Duck implements Run, Fly, Swim {
        public void fly(){}
        public void run(){}
        public void swim(){}
    }

    public class Penguin implements Run, Swim {
        public void run(){}
        public void swim(){}
    }

    public class Airplane implements Fly, Run {
        public void fly(){}
        public void run(){}
    }
}

