package javarush.java_core_2.level6.lecture3.task3;
/*
package com.javarush.task.task16.task1603;
*/
import java.util.ArrayList;
import java.util.List;

/*
Список и нити
*/
/*
В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.
Требования:

    •
    В методе main создай 5 объектов типа SpecialThread.
    •
    В методе main создай 5 объектов типа Thread.
    •
    Добавь 5 разных нитей в список list.
    •
    Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
    •
    Метод run класса SpecialThread должен выводить "it's a run method inside SpecialThread".
    */

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread thread1 = new SpecialThread(); //Add your code here - добавьте свой код тут
        SpecialThread thread2 = new SpecialThread();
        SpecialThread thread3 = new SpecialThread();
        SpecialThread thread4 = new SpecialThread();
        SpecialThread thread5 = new SpecialThread();

        Solution.list.add(new Thread(thread1));
        Solution.list.add(new Thread(thread2));
        Solution.list.add(new Thread(thread3));
        Solution.list.add(new Thread(thread4));
        Solution.list.add(new Thread(thread5));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}

