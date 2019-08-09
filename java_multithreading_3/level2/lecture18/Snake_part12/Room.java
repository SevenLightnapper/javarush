package javarush.java_multithreading_3.level2.lecture18.Snake_part12;
/*
package com.javarush.task.task23.task2312;
*/
/*
Змея у нас есть, пусть и мышь будет.

Добавить в метод main:
a) вызов метода createMouse().
б) вызов метода run().
Без него ничего работать не будет. В нем вся основная логика.
Неплохо получилось, но я все-таки внесу пару правок.
Кстати, как насчет написать метод sleep?
Ты уже понял из предыдущих задач, что в методе run нужна пауза.
Но насколько я помню, скорость в змейке должна расти при росте ее длины.
Значит чем длиннее змея, тем выше скорость и меньше пауза.
Требования:

    •
    В методе main классе Room должен быть вызван метод createMouse на объекте типа Room.
    •
    В методе main классе Room должен быть вызван метод run на объекте типа Room.
    •
    В классе Room должен быть создан метод sleep без параметров.
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
        game.createMouse();
        game.run();
    }

    public void run() {

    }

    public void print() {

    }

    public void sleep() {

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

