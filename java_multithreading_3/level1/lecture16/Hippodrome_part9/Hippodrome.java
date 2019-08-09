package javarush.java_multithreading_3.level1.lecture16.Hippodrome_part9;
/*
package com.javarush.task.task21.task2113;
*/
/*
Ипподром(9)
*/
/*
Теперь вернемся к методам move и print. Начнем с move.

В методе move класса Hippodrome в цикле у каждой лошади мы вызываем метод move.

Да ты прав, его еще нет у класса Horse.

Поэтому в класс Horse надо добавить свой метод move :)

И метод print, кстати тоже.

Если я не говорю ничего насчет параметров метода,
значит метод без параметров.

Делай все методы public, если явно не указано обратное.
Требования:

    •
    В классе Horse должен быть создан метод move.
    •
    В классе Horse должен быть создан метод print.
    •
    В методе move класса Hippodrome должен быть вызван метод move по одному
    разу для каждой лошади(каждого элемента списка horses).
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
