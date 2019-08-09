package javarush.java_core_2.level4.lecture8.task1;
/*
package com.javarush.Task.task14.task1409;
*/
/*
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge) { //add println method here

        System.out.println(bridge.getCarsCount());
    }
}

