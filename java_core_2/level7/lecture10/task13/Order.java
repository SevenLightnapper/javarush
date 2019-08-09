package javarush.java_core_2.level7.lecture10.task13;
/*
package com.javarush.task.task17.task1712;
*/
public class Order {
    private long time;
    private byte tableNumber;

    public Order(byte tableNumber) {
        time = (long) (Math.random() * 200);
        this.tableNumber = tableNumber;
    }

    public long getTime() {
        return time;
    }

    public byte getTableNumber() {
        return tableNumber;
    }
}

