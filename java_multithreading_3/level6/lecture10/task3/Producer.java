package javarush.java_multithreading_3.level6.lecture10.task3;

/*
Pазберись с ConcurrentHashMap.
        В отдельном файле создайте класс Producer, который будет:
        1. каждые полсекунды добавлять в ConcurrentHashMap ключ и значение, где ключ - счетчик начиная с 1,
         значение - фраза: "Some text for i" , пример "Some text for 1".
        2. при возникновении исключения выводить в консоль: "[THREAD_NAME] thread was terminated",
         пример "[thread-1] thread was terminated".
        Требования:

        •
        Класс Producer должен быть создан в отдельном файле.
        •
        Класс Producer должен реализовывать интерфейс Runnable.
        •
        Класс Producer должен содержать приватное поле ConcurrentHashMap<String, String> map.
        •
        Класс Producer должен содержать конструктор с одним параметром, инициализирующий поле map.
        •
        Метод run() класса Producer должен каждые полсекунды добавлять в ConcurrentHashMap ключ и значение
         согласно заданию.
        •
        Метод run() класса Producer должен при возникновении исключения выводить в консоль
        "[THREAD_NAME] thread was terminated".
*/

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            int i = 0;
            while (true) {
                map.put(String.valueOf(++i), "Some text for " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }
}
