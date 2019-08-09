package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part10;
/*
package com.javarush.task.task24.task2413;
*/
/*
Что мы будем делать с Canvas?
Мы будем рисовать на нем (в его матрице).
Поэтому нам понадобятся два метода:
void setPoint(double x, double y, char c)
void drawMatrix(double x, double y, int[][] matrix, char c)

Первый метод - setPoint будет "ставить точку в координатах x,y цветом c".

В методе надо:
а) округлить x и y до целых чисел
б) занести в matrix[y][x] значение с
в) ничего не делать, если x < 0 или y < 0 или y >= matrix.length или x >= matrix[0].length

Второй метод - drawMatrix копирует переданную ему картинку (матрицу) в матрицу Canvas.
И не просто копирует, а начиная с координат x, y

В методе надо:
а) с помощью двух вложенных циклов пройтись по всем ячейкам переданной картинки
б) если значение ячейки элемента [i][j] полученной матрицы не равно 0,
то покрасить в матрице объекта Canvas точку (x+j, y+i) в цвет c:
setPoint(x+j, y+i, c)
Требования:

    •
    В классе Canvas должен быть создан метод void setPoint(double x, double y, char c).
    •
    В классе Canvas должен быть создан метод void drawMatrix(double x, double y, int[][] matrix, char c).
    •
    Поведение метода setPoint должно соответствовать условию задачи.
    •
    Поведение метода drawMatrix должно соответствовать условию задачи.
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

    public void setPoint(double x, double y, char c){
        if (!(x < 0 || y < 0 || y >= matrix.length || x >= matrix.length)) {
            matrix[(int) Math.round(y)][(int) Math.round(x)] = c;
        }
    }
    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    setPoint(x+j, y+i, c);
            }
        }
    }
}



