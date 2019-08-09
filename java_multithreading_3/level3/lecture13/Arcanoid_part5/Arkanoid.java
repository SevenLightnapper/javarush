package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part5;
/*
package com.javarush.task.task24.task2413;
*/
/*
Чего еще не хватает классу Arkanoid?
Во-первых ему нужен метод run(),
в котором будет описана основная логика программы.
Еще нужен метод move(),
который будет двигать на один шаг все объекты требующие движения.
Создай методы run() и move().

Еще нам понадобится НЕ приватная статическая переменная game типа Arkanoid,
которая будет хранить ссылку на созданный экземпляр класса Arkanoid.

Выглядеть это должно примерно так:
static Arkanoid game;
Требования:

    •
    В классе Arkanoid должен быть создан метод void run() без параметров.
    •
    В классе Arkanoid должен быть создан метод void move() без параметров.
    •
    Метод run должен быть доступен извне класса Arkanoid.
    •
    Метод move должен быть доступен извне класса Arkanoid.
    •
    В классе Arkanoid должно быть создано не приватное статическое
    поле game типа Arkanoid.
    */

import java.util.*;

public class Arkanoid {
    private int width;
    private int height;
    private Ball ball;
    private List<Brick> bricks;
    private Stand stand;
    static Arkanoid game;

    public Arkanoid(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public Ball getBall() {
        return ball;
    }
    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public List<Brick> getBricks() {
        return bricks;
    }
    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public Stand getStand() {
        return stand;
    }
    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public static void main(String[] args) {}

    public void run() {
    }

    public void move() {
    }
}

