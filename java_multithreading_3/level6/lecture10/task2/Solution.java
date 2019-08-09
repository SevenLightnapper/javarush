package javarush.java_multithreading_3.level6.lecture10.task2;
/*
package com.javarush.task.task26.task2610;
*/
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Мир скучен для скучных людей
*/
/*
Разберись с BlockingQueue.
По образу и подобию класса Producer создай класс Consumer, который будет выводить данные из BlockingQueue в консоль.
Требования:

    •
    Класс Consumer должен быть создан в отдельном файле.
    •
    Класс Consumer должен реализовывать интерфейс Runnable.
    •
    Класс Consumer должен содержать приватное поле BlockingQueue queue.
    •
    Класс Consumer должен содержать конструктор с одним параметром, инициализирующий поле queue.
    •
    Метод run() класса Consumer должен постоянно выводить на экран значения из очереди.
    */

public class Solution {

    public static void main(String[] args) throws Exception {

        BlockingQueue queue = new ArrayBlockingQueue(32);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(producer);
        executorService.submit(consumer);

        Thread.sleep(2000);

        executorService.shutdownNow();

    }
}

