package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part17;
/*
package com.javarush.task.task24.task2413;
*/
/*
 Еще подставке нужны методы:
а) move - см. move в BaseObject
Движение доски осуществляется горизонтально, поэтому мы меняем только координату х.
Подумай, как координата х зависит от направления (direction) и скорости (speed). Реализуй зависимость.
б) draw - см. draw в BaseObject
Его кодом я займусь сам.
в) moveLeft() - задает постоянное движение "подставки" влево
Просто присвой правильное значение переменной direction.
г) moveRight() - задает постоянное движение "подставки" вправо
Просто присвой правильное значение переменной direction.
Требования:

    •
    В классе Stand должен быть реализован метод move увеличивающий координату x на произведение значений полей speed и direction.
    •
    В классе Stand должен быть реализован метод moveLeft, устанавливающий значение поля direction равным -1.
    •
    В классе Stand должен быть реализован метод moveRight, устанавливающий значение поля direction равным 1.
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
    public void move() { x+=speed*direction; }
    @Override
    public void draw(Canvas canvas) { }

    public void moveLeft(){ direction=-1; }
    public void moveRight(){ direction=1; }
}


