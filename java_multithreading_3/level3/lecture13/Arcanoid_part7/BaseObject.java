package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part7;
/*
package com.javarush.task.task24.task2413;
*/
/*
Теперь перейдем к классу BaseObject.
Я хочу сделать несколько предложений.

Во-первых для простоты считать все объекты у нас будут круглыми.
Нет, отрисовывать их мы будем фигурными, как и раньше.
А вот при расчетах из взаимодействия исходить из того, что они круглые.
Так - гораздо проще.

Во-вторых. Пусть координаты объектов и радиус будут вещественными числами.
Это придаст плавность движениям и точность всем вычислениям.
А при отрисовке мы будем их округлять.

Итак:
а) Добавь в класс BaseObject приватные поля x (double), y (double), radius (double).
б) Добавь геттеры и сеттеры.
в) Добавь конструктор BaseObject(double x, double y, double radius).
г) Пройдись по все классам-наследникам и поправь у них конструкторы.

Если вы пользуйтесь Intellij IDEA - Alt+Insert вам в помощь.
Требования:

    •
    В классе BaseObject должно быть создано приватное поле x типа double.
    •
    В классе BaseObject должно быть создано приватное поле y типа double.
    •
    В классе BaseObject должно быть создано приватное поле radius типа double.
    •
    В классе BaseObject должен быть создан корректно работающий конструктор с тремя параметрами типа double (x, y, radius).
    •
    В классе Ball должен быть создан корректно работающий конструктор с тремя параметрами типа double (x, y, radius).
    •
    В классе Brick должен быть создан корректно работающий конструктор с тремя параметрами типа double (x, y, radius).
    •
    В классе Stand должен быть создан корректно работающий конструктор с тремя параметрами типа double (x, y, radius).
    •
    В классе BaseObject должен быть создан публичный геттер для поля x.
    •
    В классе BaseObject должен быть создан публичный геттер для поля y.
    •
    В классе BaseObject должен быть создан публичный геттер для поля radius.
    •
    В классе BaseObject должен быть создан публичный сеттер для поля x.
    •
    В классе BaseObject должен быть создан публичный сеттер для поля y.
    •
    В классе BaseObject должен быть создан публичный сеттер для поля radius.
    */

public class BaseObject {
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
}
