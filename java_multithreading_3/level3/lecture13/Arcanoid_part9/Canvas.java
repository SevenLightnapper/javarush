package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part9;
/*
package com.javarush.task.task24.task2413;
*/
/*
Теперь займемся классом Canvas.
Он у нас будет содержать матрицу (двумерный массив), куда мы будем "рисовать".
У матрицы есть ширина и высота.
А еще будем в ней хранить не числа (int), а символы (char).

Надо:
а) Добавить в класс два приватных поля width и height.
б) Добавить в класс приватное поле matrix (char[][]).
в) Добавить конструктор с двумя параметрами типа int (width и height),
поле matrix должно быть инициализировано пустым массивом размерностью [height+2][width+2].
г) Добавить геттеры и сеттеры для всех приватных полей класса.
Требования:

    •
    В классе Canvas должно быть создано приватное поле width типа int.
    •
    В классе Canvas должно быть создано приватное поле height типа int.
    •
    В классе Canvas должно быть создано приватное поле matrix типа char[][].
    •
    В классе Canvas должен быть создан публичный геттер для поля width.
    •
    В классе Canvas должен быть создан публичный геттер для поля height.
    •
    В классе Canvas должен быть создан публичный геттер для поля matrix.
    •
    В классе Canvas должен быть создан публичный сеттер для поля width.
    •
    В классе Canvas должен быть создан публичный сеттер для поля height.
    •
    В классе Canvas должен быть создан публичный сеттер для поля matrix.
    •
    В классе Canvas должен быть создан корректный публичный конструктор с двумя параметрами типа int (width и height).
    */

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.height = height;
        this.width = width;
        this.matrix = new char[height+2][width+2];
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }
}
