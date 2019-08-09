package javarush.java_core_2.level4.lecture8.task5;
/*
package com.javarush.Task.task14.task1413;
*/
/*
Computer
*/

public class Solution {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

}

