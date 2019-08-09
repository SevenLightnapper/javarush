package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part19;
/*
package com.javarush.task.task24.task2413;
  */
/*
Осталось совсем чуть-чуть.

В классе Arkanoid создай поле приватное isGameOver типа boolean.

Реализуй метод checkBricksBump.
В этом методе надо проверить - не столкнулся ли шарик с каким-нибудь из "кирпичей".
Для проверки столкновения используй метод isIntersec.
Если шарик все-таки попал в кирпич, то:
а) шарик отлетает в случайном направлении:
double angle = Math.RANDOM() * 360;
ball.setDirection(angle);
б) кирпич умирает - надо удалить его из списка всех кирпичей.

Реализуй метод checkStandBump.
В этом методе надо проверить - не ударился ли шарик о подставку.
Для проверки столкновения используй метод isIntersec.
Если шарик все-таки ударился о подставку, то:
шарик отлетает в случайным направлении вверх:
double angle = 90 + 20 * (Math.RANDOM() - 0.5);
ball.setDirection(angle);

Реализуй метод checkEndGame.
Если координата y шарика больше чем высота поля игры (height), значит шарик улетел вниз за границу экрана.
В этом случае надо переменную isGameOver установить в true.
Требования:

    •
    В классе Arkanoid должен быть реализован метод checkBricksBump() в соответствии с условием задачи.
    •
    В классе Arkanoid должен быть реализован метод checkStandBump() в соответствии с условием задачи.
    •
    В классе Arkanoid должно быть создано приватное поле isGameOver типа boolean.
    •
    В классе Arkanoid должен быть реализован метод checkEndGame() в соответствии с условием задачи.
    */

import java.util.*;

public class Arkanoid {
    private int width;
    private int height;
    private Ball ball;
    private List<Brick> bricks;
    private Stand stand;
    static Arkanoid game;
    private boolean isGameOver;

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
    public void checkBricksBump() {
        for (int i = 0; i < bricks.size(); i++) {
            if (ball.isIntersec(bricks.get(i))) {
                double angle = Math.random() * 360;
                ball.setDirection(angle);
                bricks.remove(i);
            }
        }
    }
    public void checkStandBump() {
        if (ball.isIntersec(stand)) {
            double angle = 90 + 20 * (Math.random() - 0.5);
            ball.setDirection(angle);
        }
    }
    public void checkEndGame() {
        if (ball.y > height) {
            isGameOver = true;
        }
    }
}


