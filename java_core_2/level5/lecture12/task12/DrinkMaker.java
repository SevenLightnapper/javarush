package javarush.java_core_2.level5.lecture12.task12;

/*
package com.javarush.task.task15.task1530;
*/

/*
1. В отдельном файле создать класс DrinkMaker с тремя абстрактными методами:
        - void getRightCup() - выбрать подходящую чашку
        - void putIngredient() - положить ингредиенты
        - void pour() - залить жидкостью
        2. В классе DrinkMaker создать и реализовать метод void makeDrink(), который готовит напиток в такой последовательности: выбирает чашку, кладет ингредиенты, заливает жидкостью.
*/

public abstract class DrinkMaker {
    abstract void getRightCup();

    abstract void putIngredient();

    abstract void pour();

    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
