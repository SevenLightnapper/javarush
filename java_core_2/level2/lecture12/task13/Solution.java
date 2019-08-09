package javarush.java_core_2.level2.lecture12.task13;
/*
package com.javarush.Task.task12.task1233;
*/
/*
Изоморфы наступают
*/
/*
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        int x = array[0];
        int y = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < x)
                x = array[i];
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] == x)
                y = i;
        }
        return new Pair<Integer, Integer>(x, y);

    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}

