package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part12;
/*
package com.javarush.task.task24.task2413;
*/
/*
Теперь напишем класс Brick.

Во-первых займемся конструктором и в нем точно зададим "радиус" всех кирпичей.
Пусть он выглядит так:
public Brick(double x, double y) {
  super(x, y, 3);
}

Еще нам нужно переопределить два метода move() и draw(Canvas canvas).
Метод move() не делает ничего (не содержит кода), т.к. кирпич никуда не двигается.

Напиши еще метод draw(Canvas canvas).
Его кодом я займусь сам.
Требования:

    •
    Конструктор класса Brick должен принимать два параметра типа double и вызывать конструктор класса родителя с фиксированным третьим параметром (радиусом) равным 3.
    •
    В классе Brick должен существовать метод move без параметров.
    •
    В классе Brick должен существовать метод draw с одним параметром типа Сanvas.
    */

public class Brick extends BaseObject {

    public Brick(double x, double y, double radius) {
        super(x, y, radius);
    }

    public Brick(double x, double y) {
        super(x, y, 3);
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {

    }
}
