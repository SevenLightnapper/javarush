package javarush.java_syntax_1.level5.lecture9.task7;
/*
package com.javarush.Task.task05.task0522;
*/
/*
Максимум конструкторов
*/
/*
Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.

Подсказка:
не забудь про конструктор по умолчанию.
*/

public class Circle {
    public double x;
    public double y;
    public double radius;
    public double width;
    public double height;

    public Circle(double y, double radius){
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }//напишите тут ваш код

    public Circle(double y, double width, double x, double radius){
        this.x = x;
        this.y = y;
        this.width = width;
        this.radius = radius;
    }

    public Circle (double x, double y, double radius, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.width = width;
        this.height = height;
    }

    public Circle(double x){
        this(x,4,15);
    }

    public Circle(){
        this(1,5,9);
    }

    public static void main(String[] args) {

    }
}