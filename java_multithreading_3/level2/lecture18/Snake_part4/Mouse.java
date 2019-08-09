package javarush.java_multithreading_3.level2.lecture18.Snake_part4;
/*
package com.javarush.task.task23.task2312;
*/
/*
Координаты x и y ты уже создал в классе Mouse, а как получить к ним доступ?
Создай корректные геттеры для этих полей и конструктор с двумя параметрами
типа int (x и y соответственно).
Требования:

    •
    В классе Mouse должен быть создан корректный геттер для поля x.
    •
    В классе Mouse должен быть создан корректный геттер для поля y.
    •
    В классе Mouse должен быть создан корректно работающий публичный
    конструктор с двумя параметрами типа int.
    */

public class Mouse {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Mouse(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
