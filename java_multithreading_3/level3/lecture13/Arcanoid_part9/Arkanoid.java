package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part9;

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


