package javarush.java_core_2.level10.lecture10.task11;
/*
package com.javarush.task.task20.task2026;
*/
/*
Алгоритмы-прямоугольники
*/
/*
1. Дан двумерный массив N*N, который содержит несколько прямоугольников.
        2. Различные прямоугольники не соприкасаются и не накладываются.
        3. Внутри прямоугольник весь заполнен 1.
        4. В массиве:
        4.1) a[i, j] = 1, если элемент (i, j) принадлежит какому-либо прямоугольнику
        4.2) a[i, j] = 0, в противном случае
        5. getRectangleCount должен возвращать количество прямоугольников.
        6. Метод main не участвует в тестировании
        Требования:
        •
        В классе Solution должен существовать метод getRectangleCount с одним параметром типа byte[][].
        •
        Метод getRectangleCount должен быть публичным.
        •
        Метод getRectangleCount должен быть статическим.
        •
        Метод getRectangleCount должен возвращать количество прямоугольников (в соответствии с заданием) найденное в полученном массиве.
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {

        int rectCount = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    rectCount++;
                    for (int k = i; k < a.length; k++) {
                        if (a[k][j] == 0) break;
                        for (int l = j; l < a.length; l++) {
                            if (a[k][l] == 1) a[k][l] = 0;
                            else break;
                        }
                    }
                }
            }
            System.out.println();
        }
        return rectCount;
    }
}