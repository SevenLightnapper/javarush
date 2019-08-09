package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part2;
/*
package com.javarush.task.task24.task2413;
*/
/*
Главному классу (Arkanoid) нужно будет хранить информацию о размерах поля, где будут происходить все действия.

Поэтому:
а) добавь в класс Arkanoid два приватных поля width(ширина) и height(высота) типа int
б) создай для них публичные геттеры и сеттеры
Требования:

    •
    В классе Arkanoid должно быть создано приватное поле width типа int.
    •
    В классе Arkanoid должно быть создано приватное поле height типа int.
    •
    В классе Arkanoid должен быть создан корректный геттер для поля height.
    •
    В классе Arkanoid должен быть создан корректный геттер для поля width.
    •
    В классе Arkanoid должен быть создан корректный сеттер для поля height.
    •
    В классе Arkanoid должен быть создан корректный сеттер для поля width.
    */
public class Arkanoid {
    private int width;
    private int height;

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
