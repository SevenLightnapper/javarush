package javarush.java_multithreading_3.level1.lecture16.Hippodrome_part11;
/*
package com.javarush.task.task21.task2113;
*/
/*
Ипподром(11)
*/
/*
С классом Hippodrome почти закончили.
Добавь в конец метода main вызов run().

Подсказка:
run() - это нестатический метод, поэтому вызвать его можно только у объекта.
А где взять объект?

Подсказка 2:
game.run();
Требования:

    •
    В методе main должен быть вызван метод run у объекта типа Hippodrome.
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

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    public void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(horses);

        Horse horse1 = new Horse("Light", 3, 0);
        Horse horse2 = new Horse("Red", 3, 0);
        Horse horse3 = new Horse("Madelin", 3, 0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game.run();
    }
}
