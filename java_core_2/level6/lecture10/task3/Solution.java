package javarush.java_core_2.level6.lecture10.task3;
/*
package com.javarush.task.task16.task1618;
*/
/*
Снова interrupt
*/
/*
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
Требования:

    •
    Класс TestThread должен быть унаследован от Thread.
    •
    Класс TestThread должен иметь public void метод run.
    •
    Метод main должен создавать объект типа TestThread.
    •
    Метод main должен вызывать метод start у объекта типа TestThread.
    •
    Метод main должен вызывать метод interrupt у объекта типа TestThread.
    */

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread thread = new TestThread(); //Add your code here - добавь код тут
        thread.start();
        thread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {

        public void run() {

        }
    }
}
