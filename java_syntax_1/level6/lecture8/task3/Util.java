package javarush.java_syntax_1.level6.lecture8.task3;
/*
package com.javarush.Task.task06.task0609;
*/
/*
Расстояние между двумя точками
*/
/*
Реализовать статический метод double getDistance(x1, y1, x2, y2).
Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a),
который вычисляет квадратный корень переданного параметра.
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}


