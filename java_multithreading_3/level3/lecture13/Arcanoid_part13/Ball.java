package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part13;
/*
package com.javarush.task.task24.task2413;
*/
/*
Класс Ball уже посложнее - шарик же двигается.

Нам понадобятся приватные поля:
а) speed (скорость шарика) типа double;
б) direction (направление движения в градусах: от 0 до 360) типа double;
в) dx (расстояние по x, которое проходит шарик за один шаг. вычисляется на основе speed и direction) типа double;
г) dy (расстояние по y, которое проходит шарик за один шаг. вычисляется на основе speed и direction) типа double;
д) isFrozen ("истина" если шарик "заморожен" - не двигается) типа boolean.

Не забудь добавить геттеры для всех полей этого класса, кроме isFrozen (его мы будем использовать только внутри класса Ball).

А еще сделай-ка конструктор:
а) параметры - x, y, speed, direction;
б) радиус (для вызова родительского класса) всегда равен 1;
в) не забудь установить isFrozen в true - в начале игры шарик никуда не летит.
Требования:

    •
    Приватное поле speed типа double должно быть создано в классе Ball.
    •
    Приватное поле direction типа double должно быть создано в классе Ball.
    •
    Приватное поле dx типа double должно быть создано в классе Ball.
    •
    Приватное поле dy типа double должно быть создано в классе Ball.
    •
    Приватное поле isFrozen типа boolean должно быть создано в классе Ball.
    •
    В классе Ball должен быть создан публичный конструктор (поведение и параметры описаны в условии).
    •
    В классе Ball должен существовать корректный публичный геттер для поля speed.
    •
    В классе Ball должен существовать корректный публичный геттер для поля direction.
    •
    В классе Ball должен существовать корректный публичный геттер для поля dx.
    •
    В классе Ball должен существовать корректный публичный геттер для поля dy.
    */

public class Ball extends BaseObject {
    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen;

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);

        this.direction = direction;
        this.speed = speed;

        this.isFrozen = true;
    }

    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    public double getDx() {
        return dx;
    }
    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
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
