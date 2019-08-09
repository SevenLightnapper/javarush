package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part8;
/*
package com.javarush.task.task24.task2413;
*/
/*
Но и это еще не все.
Классу BaseObject нужны еще методы.
Пока это будут пустые методы draw(Canvas canvas) и move().
Классы-наследники должны будут переопределить их у себя и
реализовать необходимую функциональность (пока можешь оставить их пустыми,
просто чтобы код компилировался).
Объяви эти методы, но сделай их абстрактными.
Также сделай абстрактным сам класс BaseObject.

А еще нам нужно будет определять попал ли шарик в кирпич или в подставку.
Это будем делать так:
В этом же классе, создадим специальный метод: boolean isIntersec(BaseObject o)
Он будет определять - "пересеклись" объекты или нет.
Если пересеклись - возвращать true, если нет - false.

Т.к. объекты мы условно считаем кругами,
то предлагаю такую формулу взаимодействия:
если центр круга одного объекта попал в круг другого,
то будем считать, что они столкнулись.

Или еще проще:
дистанция_между_объектами <= max
(радиус_первого_объекта, радиус_второго_объекта)
Требования:

    •
    Класс BaseObject должен быть абстрактным.
    •
    В классе BaseObject должен быть объявлен абстрактный метод draw()
    c одним параметром типа Canvas.
    •
    В классе BaseObject должен быть объявлен абстрактный метод move()
    без параметров.
    •
    В классе BaseObject должен быть реализован метод isIntersec()
    с одним параметром типа BaseObject, возвращающий true в случае, если текущий объект пересекается с анализируемым.
    */
import static java.lang.Math.*;

public abstract class BaseObject {
    private double x;
    private double y;
    private double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    boolean isIntersec(BaseObject o) {
        return hypot(this.x - o.x, this.y - o.y) <= max(this.radius, o.radius);
    }

    public abstract void draw(Canvas canvas);

    public abstract void move();
}



