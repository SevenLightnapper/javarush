package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part18;
/*
package com.javarush.task.task24.task2413;
*/
/*
Теперь вернемся к классу Arkanoid.

Реализуй методы:
а) move()
В этом методе нужно двигать все движимые объекты (stand, ball).
б) draw(Canvas canvas)
В этом методе надо вызвать метод draw всех существующих объектов, которые его имеют.
Требования:

    •
    В классе Arkanoid должен быть реализован метод move() без параметров, вызывающий методы move() у шарика и подставки.
    •
    В классе Arkanoid должен быть реализован метод draw(Canvas canvas), вызывающий методы draw у шарика, подставки и всех кирпичей.
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
        ball.move();
        stand.move();
    }
    public void draw(Canvas canvas) {
        ball.draw(canvas);
        stand.draw(canvas);
        for (int i = 0; i < bricks.size(); i++) {
            bricks.get(i).draw(canvas);
        }
    }
}


