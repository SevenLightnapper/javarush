package javarush.java_multithreading_3.level6.lecture10.task3;
/*
package com.javarush.task.task26.task2611;
*/
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Мир не меняется, меняемся мы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        Producer producer = new Producer(map);
        Consumer consumer = new Consumer(map);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(producer);
        executorService.submit(consumer);

        Thread.sleep(2000);

        executorService.shutdownNow();
        //finally 5 lines have to be printed
    }
}

