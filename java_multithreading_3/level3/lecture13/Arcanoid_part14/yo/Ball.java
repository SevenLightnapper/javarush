package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part14.yo;
/*
package com.javarush.task.task24.task2413;
*/
/*
Чего-то не хватает в классе Ball:

Во-первых надо реализовать метод move(), унаследованный от BaseObject:
а) x должен увеличиваться на dx каждый ход
б) y должен увеличиваться на dy каждый ход
если шарик "заморожен", то x и y меняться не должны

Во-вторых надо реализовать метод draw(Canvas canvas):
на объекте canvas необходимо вызвать метод setPoint с параметрами (x, y, 'O')

В-третьих надо реализовать метод start()
Именно его вызов "размораживает" шарик.
Что для этого надо сделать - это ты уже сам реши.

P.S. Чуть не забыл! Поля x, y и radius объявлены в классе BaseObject с модификатором доступа private,
что не очень-то удобно. Измени его на protected, чтобы все потомки класса BaseObject имели контроль над своими
координатами и размерами, без необходимости пользоваться "чужими" геттерами и сеттерами.
Требования:

    •
    Метод move() в классе Ball должен увеличивать значение x на dx, если значение поля isFrozen равно false.
    •
    Метод move() в классе Ball должен увеличивать значение y на dy, если значение поля isFrozen равно false.
    •
    Метод move() в классе Ball не должен менять значения полей x и y, если значение поля isFrozen равно true.
    •
    В классе Ball должен быть реализован метод draw(Canvas canvas) в соответствии с условием задачи.
    •
    В классе Ball должен быть реализован метод start() устанавливающий значение поля isFrozen в false.
    •
    Модификатор доступа поля x в классе BaseObject должен быть изменен на protected.
    •
    Модификатор доступа поля y в классе BaseObject должен быть изменен на protected.
    •
    Модификатор доступа поля radius в классе BaseObject должен быть изменен на protected.
    */

import javarush.java_multithreading_3.level3.lecture13.Arcanoid_part14.Canvas;

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
        canvas.setPoint(x, y, 'O');
    }

    @Override
    public void move() {
        if(!isFrozen) {
            x += dx;
            y += dy;
        }
    }

    public void start() {
        isFrozen = false;
    }
}

