package javarush.java_syntax_1.level4.lecture13.task4;

public class DrawLines {
/*
package com.javarush.Task.task04.task0438;
*/
/*
Рисуем линии
*/
/*
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/
    public static void main(String[] args) throws Exception {

        int q = 10;
        for (int b = 8, a = 1; a <= q; a++, b = b - b) {
            if (b == 8) {
                System.out.println("8" + "8" + "8" + "8" + "8" + "8" + "8" + "8" + "8" + "8");
            }
            System.out.println(8);
        }
    }
}
