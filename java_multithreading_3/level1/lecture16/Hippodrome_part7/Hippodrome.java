package javarush.java_multithreading_3.level1.lecture16.Hippodrome_part7;
/*
package com.javarush.task.task21.task2113;
*/
/*
Ипподром(7)
*/
/*
Но и это еще не все - надо чтобы лошади бежали.
Добавь в класс Hippodrome методы run, move и print. Без параметров.
Метод move будет управлять движением всех лошадей.
Метод print отрисовывать их на экран.
А метод run - управлять всем этим.
Требования:

    •
    В классе Hippodrome должен быть создан метод run без параметров.
    •
    В классе Hippodrome должен быть создан метод move без параметров.
    •
    В классе Hippodrome должен быть создан метод print без параметров.
    */

import java.util.*;

public class Hippodrome {
    public static Hippodrome game;
    private static List<Horse> horses = new ArrayList<>();

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {

    }

    public void move() {

    }

    public void print() {

    }

    public static void main(String[] args) {
        game = new Hippodrome(horses);

        Horse horse1 = new Horse("Light", 3, 0);
        Horse horse2 = new Horse("Red", 3, 0);
        Horse horse3 = new Horse("Madelin", 3, 0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
    }
}
