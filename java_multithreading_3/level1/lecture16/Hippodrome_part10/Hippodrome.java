package javarush.java_multithreading_3.level1.lecture16.Hippodrome_part10;
/*
package com.javarush.task.task21.task2113;
*/
/*
Ипподром(10)
*/
/*
Еще нужно написать метод print класса Hippodrome.
В нем тоже все просто: в цикле для каждой лошади вызываем ее метод print.
Ну, и еще выведи после цикла 10 пустых строк: System.out.println() - чтобы было красивее.
Требования:

    •
    В методе print класса Hippodrome должен быть вызван метод print по одному разу для каждой лошади(каждого элемента списка horses).
    •
    В методе print должны быть выведены на экран 10 пустых строк.
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
