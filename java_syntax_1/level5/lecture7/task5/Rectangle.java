package javarush.java_syntax_1.level5.lecture7.task5;

/*
package com.javarush.Task.task05.task0513;
*/
/*
Собираем прямоугольник
*/
/*
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height
(верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(...)

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
        int height;
        public void initialize(int left){
            this.left = left;
        }//напишите тут ваш код
        public void initialize(int left, int top){
            this.left = left;
            this.top = top;
        }
        public void initialize(int left, int top, int width){
            this.left = left;
            this.top = top;
            this.width = width;
        }
        public void initialize(int left, int top, int width, int height){
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
        }

        public static void main(String[] args) {

        }
    }


