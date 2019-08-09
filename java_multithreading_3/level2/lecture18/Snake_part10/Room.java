package javarush.java_multithreading_3.level2.lecture18.Snake_part10;
/*
package com.javarush.task.task23.task2312;
*/
/*
Займемся методом main.

Для начала надо создать в классе Room статическое поле game типа Room. Доступ к переменной должен быть из всех классов.

Затем в методе main:
а) Создать змею - объект типа Snake.
б) Создать комнату - объект типа Room и передать в него ширину, высоту и змею.
в) Установить змее direction равным SnakeDirection.DOWN

Чего еще не хватает? Собственно метода, в котором будет идти вся игровая логика.
И еще нужен метод, который бы отрисовывал все это на экране:
а) создать метод void run()
б) создать метод void print()
Требования:

    •
    В методе main класса Room должна быть создана новая змея(объект типа Snake).
    •
    В методе main класса Room должно быть инициализировано поле game.
    •
    В методе main класса Room направление движения змеи должно быть установлено равным SnakeDirection.DOWN.
    •
    В классе Room должен быть создан метод run(), тип возвращаемого значения void.
    •
    В классе Room должен быть создан метод print(), тип возвращаемого значения void.
    •
    В классе Room должно быть создано статическое неприватное поле game типа Room.
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
}
