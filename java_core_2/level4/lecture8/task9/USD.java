package javarush.java_core_2.level4.lecture8.task9;
/*
package com.javarush.Task.task14.task1417;
*/

public class USD extends Money {

    public String getCurrencyName() {
        return "USD";
    }

    public USD(double amount) {
        super(amount);
    }
}
