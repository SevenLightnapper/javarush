package javarush.java_multithreading_3.level6.lecture2.task1;
/*
package com.javarush.task.task26.task2601;
*/
/*
Почитать в инете про медиану выборки
*/
/*
Реализуй логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы.
Верни отсортированный массив от минимального расстояния до максимального.
Если удаленность одинаковая у нескольких чисел, то сортируй их в порядке возрастания.

Пример входящего массива:
13, 8, 15, 5, 17
медиана - 13

Отсортированный масив:
13, 15, 17, 8, 5
Требования:

    •
    Программа не должна выводить текст в консоль.
    •
    Программа не должна считывать данные с консоли.
    •
    Класс Solution должен содержать публичный статический метод Integer[] sort(Integer[] array).
    •
    Метод sort(Integer[] array) класса Solution должен сортировать данные в массиве по удаленности от его медианы.
    */

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {
        Integer[] arr = {13, 8, 15, 5, 17};

        //System.out.println(Arrays.toString(sort(arr)));
    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        final double median;
        if (array.length % 2 == 0)
            median = ((double)array[array.length/2-1]+(double)array[array.length/2])/2;
        else
            median = array[array.length/2];
        Comparator<Integer> compareByMedian = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double value = Math.abs(o1-median) - Math.abs(o2-median);
                if (value == 0)
                    value = o1 - o2;
                return (int)value;
            }
        };
        Arrays.sort(array, compareByMedian);
        //System.out.println(median);
        return array;
    }
}
