package javarush.java_multithreading_3.level3.lecture4.task1;
/*
package com.javarush.task.task23.task2305;
*/
/*
Inner
*/
/*
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
Требования:

    •
    В классе Solution должен быть реализован метод getTwoSolutions.
    •
    Метод getTwoSolutions должен быть статическим.
    •
    Метод getTwoSolutions должен быть публичным.
    •
    Метод getTwoSolutions должен возвращать массив типа Solution заполненный согласно заданию.
    */

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] solutions = new Solution[2];

        for (int i = 0; i < solutions.length; i++) {
            Solution solution = new Solution();

            for (int j = 0; j < solution.innerClasses.length; j++) {
                solution.innerClasses[j] = solution.new InnerClass();
            }
            solutions[i] = solution;
        }

        return solutions;
    }

    public static void main(String[] args) {

    }
}

