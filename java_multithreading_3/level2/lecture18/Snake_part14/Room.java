package javarush.java_multithreading_3.level2.lecture18.Snake_part14;
/*
package com.javarush.task.task23.task2312;
*/
/*
Теперь поработаем над методом print().

Надо:
а) вывести на экран прямоугольник из точек размером width x height.
б) тело змеи отметить символом "x"-английское
в) голову змеи нарисовать символом "X"-английское.

Подсказка:
а) удобно сначала создать матрицу типа int[][] с размером (height x width)
б) затем пройтись по всем объектам и отрисовать их в матрицу.
Например, тело змеи - 1, голова змеи - 2, мышь - 3.
Требования:

    •
    Метод print должен выводить данные на экран.
    •
    Метод print должен выводить на экран количество строк равное height.
    •
    Количество символов в каждой строке выведенной на экран должно быть равно width.
    •
    Голова змеи должна быть отмечена символом X.
    •
    Тело змеи должно быть отмечено символами x.
    •
    Мышь должна быть отмечена символом ^.
    */

import java.awt.event.KeyEvent;
import java.util.*;

public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public static Room game;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
        game = this;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
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

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Основной цикл программы.
     * Тут происходят все важные действия
     */
    public void run() {
        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //пока змея жива
        while (snake.isAlive()) {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                //Если равно символу 'q' - выйти из игры.
                if (event.getKeyChar() == 'q') return;

                //Если "стрелка влево" - сдвинуть фигурку влево
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    snake.setDirection(SnakeDirection.LEFT);
                    //Если "стрелка вправо" - сдвинуть фигурку вправо
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    snake.setDirection(SnakeDirection.RIGHT);
                    //Если "стрелка вверх" - сдвинуть фигурку вверх
                else if (event.getKeyCode() == KeyEvent.VK_UP)
                    snake.setDirection(SnakeDirection.UP);
                    //Если "стрелка вниз" - сдвинуть фигурку вниз
                else if (event.getKeyCode() == KeyEvent.VK_DOWN)
                    snake.setDirection(SnakeDirection.DOWN);
            }

            snake.move();   //двигаем змею
            print();        //отображаем текущее состояние игры
            sleep();        //пауза между ходами
        }

        System.out.println("Game Over!");
    }

    public void print() {
        int[][] frame = new int[height][width];
        List<SnakeSection> sect = game.snake.getSections();

        for(int i = 1; i < sect.size(); i++) {
            frame[sect.get(i).getY()][sect.get(i).getX()] = 1; //Создаем массив, куда будем "рисовать" текущее состояние игры
        }
        frame[game.snake.getY()][game.snake.getX()] = 2;

        frame[game.mouse.getY()][game.mouse.getX()] = 3;
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if(frame[i][j] == 1) System.out.print("x");
                else if(frame[i][j] == 2) System.out.print("X");
                else if(frame[i][j] == 3) System.out.print("^");
                else System.out.print(" ");
            }
            System.out.println();
        }

        //Рисуем все кусочки змеи
        //Рисуем мышь
        //Выводим все это на экран
    }

    public void eatMouse() {
        createMouse();
    }

    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    }

    public static void main(String[] args) {
        game = new Room(20, 20, new Snake(10, 10));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }

    public void sleep() {
        // делаем паузу, длинна которой зависит от длинны змеи
        try {
            int pause = 500 - ((snake.getSections().size() - 1) * (200 / 9));
            if (pause < 200) pause = 200;
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

