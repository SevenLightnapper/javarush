package javarush.java_multithreading_3.level2.lecture18.Snake_part6;
/*
package com.javarush.task.task23.task2312;
*/
/*
Теперь займемся классом SnakeSection.
Он будет описывать один кусочек змеи.

А у каждого кусочка что есть?
Правильно! Координаты.

Добавь два поля в класс SnakeSection: x и y типа int.
Добавь для них getter'ы и конструктор с двумя параметрами типа int.
Требования:

    •
    В классе SnakeSection должно существовать поле x типа int, доступ к которому разрешен только в пределах этого класса.
    •
    В классе SnakeSection должно существовать поле y типа int, доступ к которому разрешен только в пределах этого класса.
    •
    В классе SnakeSection должен быть создан корректный геттер для поля x.
    •
    В классе SnakeSection должен быть создан корректный геттер для поля y.
    •
    В классе SnakeSection должен быть создан корректно работающий публичный конструктор с двумя параметрами типа int.
    */

public class SnakeSection {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public SnakeSection(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
