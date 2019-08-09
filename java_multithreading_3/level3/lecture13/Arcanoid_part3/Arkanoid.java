package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part3;
/*
package com.javarush.task.task24.task2413;
*/
/*
Пожалуй, пора добавить конструктор в класс Arkanoid.
Конструктор должен принимать два параметра типа int (width и height)
и корректно устанавливать значения соответствующих полей класса.
Требования:

    •
    В классе Arkanoid должен быть создан публичный конструктор
    с двумя параметрами типа int.
    •
    Конструктор класса Arkanoid должен корректно устанавливать
    значения соответствующих полей класса.
    */
public class Arkanoid {
    private int width;
    private int height;

    public Arkanoid(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {}
}

