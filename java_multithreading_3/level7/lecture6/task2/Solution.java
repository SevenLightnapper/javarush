package javarush.java_multithreading_3.level7.lecture6.task2;
/*
package com.javarush.task.task27.task2707;
*/
/*
Определяем порядок захвата монитора
*/
/*
Реализуй логику метода isLockOrderNormal, который должен определять:
соответствует ли порядок synchronized блоков в методе someMethodWithSynchronizedBlocks - порядку передаваемых в него аргументов.
В случае, если сначала происходит синхронизация по o1, а потом по o2, метод должен вернуть true.
Если наоборот - false.
Требования:

    •
    Метод isLockOrderNormal должен возвращать true в случае, если синхронизация в методе someMethodWithSynchronizedBlocks происходит сначала по объекту o1, а потом по o2.
    •
    Метод isLockOrderNormal должен возвращать false в случае, если синхронизация в методе someMethodWithSynchronizedBlocks происходит сначала по объекту o2, а потом по o1.
    •
    Метод isLockOrderNormal НЕ должен быть приватным.
    •
    Класс Solution НЕ должен быть объявлен с модификатором final.
    */

public class Solution {
    public void someMethodWithSynchronizedBlocks(Object obj1, Object obj2) {
        synchronized (obj1) {
            synchronized (obj2) {
                System.out.println(obj1 + " " + obj2);
            }
        }
    }

    public static boolean isLockOrderNormal(final Solution solution, final Object o1, final Object o2) throws Exception {
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                synchronized (o1){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignore) {
                    }
                    synchronized (o2){

                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                solution.someMethodWithSynchronizedBlocks(o1, o2);
            }
        };

        thread1.start();
        thread2.start();
        Thread.sleep(2000);
        return (thread2.getState() != Thread.State.BLOCKED);
    }

    public static void main(String[] args) throws Exception {
        final Solution solution = new Solution();
        final Object o1 = new Object();
        final Object o2 = new Object();

        System.out.println(isLockOrderNormal(solution, o1, o2));
    }
}
