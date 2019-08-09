package javarush.java_syntax_1.level5.lecture7.task4;

public class Cirlce {
    /*
    package com.javarush.Task.task05.task0512;

/*
Создать класс Circle
*/
/*
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/
    int color;
    int centerX;
    int centerY;
    int radius;
    int width;//напишите тут ваш код

    public void initialize(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.width = width;
        this.radius = radius;
    }
    public void initialize(int centerX, int centerY, int radius, int width, int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.width = width;
        this.radius = radius;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}
