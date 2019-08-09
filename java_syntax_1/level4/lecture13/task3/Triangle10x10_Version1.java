package javarush.java_syntax_1.level4.lecture13.task3;


public class Triangle10x10_Version1 {
/*
    Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

    Пример вывода на экран:
            8
            88
            888
            8888
            88888
            888888
            8888888
            88888888
            888888888
            8888888888
*/
/*
package com.javarush.Task.task04.task0437;
*/
/*
Треугольник из восьмерок
*/
    public static void main(String[] args) throws Exception {

        int n = -1, d = n++;
        for(int m = 0; m < 10; m++) {

        for (; n < 1; n++) {

                System.out.print(8);

        }
        System.out.println();
        n = d--;
        }
    }
}


