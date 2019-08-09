package javarush.java_syntax_1.level5.lecture9.task4;
/*
package com.javarush.Task.task05.task0519;
*/
/*
Ходим по кругу
*/
/*
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color

3. У класса должен быть конструктор, принимающий в качестве параметров
centerX, centerY, radius, width и инициализирующий соответствующие переменные класса.
4. У класса должен быть конструктор, принимающий в качестве параметров
centerX, centerY, radius, width, color и инициализирующий соответствующие переменные класса.
*/
public class Circle {
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;
    public Circle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public Circle(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public Circle(int centerX, int centerY, int radius, int width, int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }//напишите тут ваш код

    public static void main(String[] args) {

    }
}