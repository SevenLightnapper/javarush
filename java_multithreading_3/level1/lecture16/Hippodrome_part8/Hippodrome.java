package javarush.java_multithreading_3.level1.lecture16.Hippodrome_part8;
/*
package com.javarush.task.task21.task2113;
*/
/*
Ипподром(8)
*/
/*
В методе run сделай цикл от 1 до 100. Это и будет наш забег.
В теле цикла вызываем сначала move, затем print.
Чтобы весь цикл не отработал за долю секунды - добавь в него еще Thread.sleep(200);
Требования:

    •
    В методе run класса Hippodrome должен быть 100 раз вызван метод move.
    •
    В методе run класса Hippodrome должен быть 100 раз вызван метод print.
    •
    В методе run класса Hippodrome должен быть 100 раз вызван метод Thread.sleep(200).
    •
    Метод print должен быть вызван после метода move.
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
