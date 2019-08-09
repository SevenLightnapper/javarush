package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part4;
/*
package com.javarush.task.task24.task2413;
*/
/*
Также классу Arkanoid нужно будет хранить ссылку на шарик (Ball),
"подставку" Stand и список "кирпичей".

Надо:
а) создать в классе Arkanoid два private поля: ball типа Ball
и stand типа Stand
б) добавить private поле bricks типа List<Brick>
в) добавь для них публичные геттеры и сеттеры
Требования:

    •
    В классе Arkanoid должно быть создано приватное поле ball типа Ball.
    •
    В классе Arkanoid должно быть создано приватное поле stand типа Stand.
    •
    В классе Arkanoid должно быть создано приватное поле bricks типа List<Brick>.
    •
    В классе Arkanoid должен быть создан корректный геттер для поля ball.
    •
    В классе Arkanoid должен быть создан корректный геттер для поля stand.
    •
    В классе Arkanoid должен быть создан корректный геттер для поля bricks.
    •
    В классе Arkanoid должен быть создан корректный сеттер для поля ball.
    •
    В классе Arkanoid должен быть создан корректный сеттер для поля stand.
    •
    В классе Arkanoid должен быть создан корректный сеттер для поля bricks.
    */
import java.util.List;

public class Arkanoid {
    private int width;
    private int height;
    private Ball ball;
    private Stand stand;
    private List<Brick> bricks;

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
}

