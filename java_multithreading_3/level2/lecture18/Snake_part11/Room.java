package javarush.java_multithreading_3.level2.lecture18.Snake_part11;
/*
package com.javarush.task.task23.task2312;
*/
/*
Теперь логика управления мышью.

С мышью у нас будут происходить две вещи.

Первая - змея съедает мышь.

Вторая - появляется новая мышь в случайной точке комнаты.

Надо написать и реализовать метод createMouse() в классе Room.

В этом методе мы просто должны создавать новую мышь со случайными координатами в комнате.

Как получить случайные координаты?

Это ты уже должен был знать. На всякий случай даю подсказку:

int x = (int) (Math.RANDOM() * width);

Еще понадобится метод - eatMouse(), на случай, если мышь все-таки кто-то съест :)

Пока сложной логики в этом методе не будет - просто будем вызывать метод createMouse и все.
Требования:

    •
    В классе Room должен быть создан метод createMouse.
    •
    В методе createMouse должна быть создана новая мышь по правилам описанным в условии и сохранена в поле mouse.
    •
    В классе Room должен быть создан метод eatMouse.
    •
    В методе eatMouse должен содержаться вызов метода createMouse.
    */

public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;
    public static Room game;

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
        Snake snake = new Snake(5, 5);
        game = new Room(15, 15, snake);
        snake.setDirection(SnakeDirection.DOWN);
    }

    public void run() {

    }

    public void print() {

    }

    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);
        mouse = new Mouse(x, y);
    }

    public void eatMouse() {
        createMouse();
    }
}

