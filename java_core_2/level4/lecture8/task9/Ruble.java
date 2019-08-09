package javarush.java_core_2.level4.lecture8.task9;
/*
package com.javarush.Task.task14.task1417;
*/

public class Ruble extends Money {

    public String getCurrencyName() {
        return "RUB";
    }

    public Ruble(double amount) {
        super(amount);
    }
}
