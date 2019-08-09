package javarush.java_core_2.level4.lecture8.task9;
/*
package com.javarush.Task.task14.task1417;
*/
public abstract class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount(){
        return this.amount;
    }

    public abstract String getCurrencyName();
}


