package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part16;
/*
package com.javarush.task.task24.task2413;
*/
/*
И наконец "подставка"!
Ей понадобятся такие приватные поля:
а) speed (скорость шарика) типа double;
б) direction (направление движения по оси x: 1 - вправо, -1 - влево, 0 - начальное значение, стоим на месте) типа double.

Также создай для них геттеры.

А еще с тебя конструктор, примерно вот такой:
public Stand(double x, double y) {
super(x, y, 3);
speed = 1;
direction = 0;
}
Требования:

    •
    В классе Stand должно быть создано приватное поле speed типа double.
    •
    В классе Stand должно быть создано приватное поле direction типа double.
    •
    В классе Stand должен быть реализован публичный геттер для поля speed.
    •
    В классе Stand должен быть реализован публичный геттер для поля direction.
    •
    В классе Stand должен быть реализован конструктор с двумя параметрами типа double в соответствии с условием задачи.
    */

public class Stand extends BaseObject {
    private double speed;
    private double direction;

    public Stand(double x, double y, double radius) {
        super(x, y, radius);
    }
    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }
    public void setDirection(double direction) {
        this.direction = direction;
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {

    }
}

