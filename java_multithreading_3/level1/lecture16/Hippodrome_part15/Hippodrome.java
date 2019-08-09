package javarush.java_multithreading_3.level1.lecture16.Hippodrome_part15;
/*
package com.javarush.task.task21.task2113;
*/
/*
Ипподром(15)
*/
/*
Добавим определение победителя.
В классе Hippodrome сделаем два метода:
public Horse getWinner() и public void printWinner()

Метод getWinner должен возвращать лошадь пробежавшую самую большую дистанцию.
Метод printWinner выводит на экран имя победителя в виде: Winner is <name>!

Пример:
Winner is Lucky!
Требования:

    •
    В классе Hippodrome должен быть создан метод getWinner без параметров.
    •
    В классе Hippodrome должен быть создан метод printWinner без параметров.
    •
    Метод getWinner должен возвращать лошадь пробежавшую наибольшую дистанцию.
    •
    Метод printWinner должен выводить на экран имя победителя на экран в формате заданном в условии задачи.
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

    public Horse getWinner() {
        Horse winner  = new Horse("",-1,-1);
        for (Horse h : horses) {
            if (h.getDistance() > winner.getDistance())
                winner = h;
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
