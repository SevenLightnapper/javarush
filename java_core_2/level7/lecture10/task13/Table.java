package javarush.java_core_2.level7.lecture10.task13;
/*
package com.javarush.task.task17.task1712;
*/
public class Table {
    private static byte tableNumber;
    private byte number = ++tableNumber;

    public Order getOrder () {
        return new Order(number);
    }
}

