package javarush.java_multithreading_3.level8.lecture10.task3;
/*
package com.javarush.task.task28.task2813;
*/
/*
Класс FactorialCalculator предназначен для вычисления факториала числа переданного в его конструктор в качестве параметра.
К сожалению, он реализован некорректно и тебе необходимо это исправить.

Внимательно разбери метод main класса Solution.
Требования:

    •
    Класс FactorialCalculator должен поддерживать интерфейс Callable.
    •
    Метод call класса FactorialCalculator должен возвращать результат выполнения метода factorial.
    •
    Метод call класса FactorialCalculator должен быть публичным.
    •
    Поле number класса FactorialCalculator должно быть приватным.
    */

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable {
    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws InterruptedException {
        return factorial(number);
    }

    public long factorial(int number) throws InterruptedException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be greater than zero");
        }
        long result = 1;
        while (number > 1) {
            Thread.sleep(1);
            result = result * number;
            number--;
        }
        return result;
    }
}

