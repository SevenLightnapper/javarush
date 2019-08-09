package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part15;
/*
package com.javarush.task.task24.task2413;
*/
/*
Не поверишь, но и это еще не все.

Во-первых нужен метод setDirection,
который не только устанавливает значение переменной direction,
но и вычисляет новые значения переменных dx и dy.

Код должен выглядеть примерно так:
this.direction = direction;
double angle = Math.toRadians(direction);
dx = Math.cos(angle) * speed;
dy = -Math.sin(angle) * speed.

Во-вторых шарик может удариться о стенку.
При этом он должен от нее отскочить.

Для этого нам понадобится еще один метод:
void checkRebound(int minx, int maxx, int miny, int maxy)

Создай его, а кодом я займусь сам.
Требования:

    •
    В классе Ball должен быть создан метод setDirection() c одним параметром типа double (реализацию смотри в условии).
    •
    В классе Ball должен быть создан метод checkRebound c четырьмя параметрами типа int.
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
        double angle = Math.toRadians(direction);
        dx = Math.cos(angle) * speed;
        dy = -Math.sin(angle) * speed;
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
    public void checkRebound(int minx, int maxx, int miny, int maxy) {

    }
}

