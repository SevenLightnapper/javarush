package javarush.java_syntax_1.level5.lecture9.task5;
/*
package com.javarush.Task.task05.task0520;
*/
/*
Создать класс прямоугольник (Rectangle)
*/
/*
Создать класс прямоугольник (Rectangle).
Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
*/
public class Rectangle {
    int left;
    int top;
    int width;
    int height;//напишите тут ваш код

    public Rectangle(int left){
        this.left = left;
    }
    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
    }
    public Rectangle(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = left;
    }
    public static void main(String[] args) {

    }
}

