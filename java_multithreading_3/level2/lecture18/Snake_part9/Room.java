package javarush.java_multithreading_3.level2.lecture18.Snake_part9;
/*
package com.javarush.task.task23.task2312;
*/
/*
Еще остался самый главный класс - Room.
Что нам нужно для его описания?
Размеры комнаты (width и height) - раз.
Змея - два
Мышь - три.

Надо:
а) создать в классе Room переменные width и height типа int.
б) создать в классе Room переменную snake типа Snake.
в) создать в классе Room переменную mouse типа Snake. Шучу. Типа Mouse, конечно же :).
г) создать для них всех геттеры и сеттеры.
д) создать конструктор. Конструктор должен принимать три параметра: width, height и ... snake!
Требования:

    •
    В классе Room должна быть создана приватная переменная width типа int.
    •
    В классе Room должна быть создана приватная переменная height типа int.
    •
    В классе Room должна быть создана приватная переменная snake типа Snake.
    •
    В классе Room должна быть создана приватная переменная mouse типа Mouse.
    •
    В классе Room должен быть создан корректный публичный геттер для поля width.
    •
    В классе Room должен быть создан корректный публичный геттер для поля height.
    •
    В классе Room должен быть создан корректный публичный геттер для поля snake.
    •
    В классе Room должен быть создан корректный публичный геттер для поля mouse.
    •
    В классе Room должен быть создан корректный публичный сеттер для поля width.
    •
    В классе Room должен быть создан корректный публичный сеттер для поля height.
    •
    В классе Room должен быть создан корректный публичный сеттер для поля snake.
    •
    В классе Room должен быть создан корректный публичный сеттер для поля mouse.
    •
    В классе Room должен быть создан корректный публичный конструктор с параметрами int, int и Snake(width, height и snake).
    */

public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public static void main(String[] args) {

    }
}
