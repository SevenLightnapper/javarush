package javarush.java_multithreading_3.level5.lecture5.task2;
/*
package com.javarush.task.task25.task2505;
*/
/*
Без дураков
*/
/*
1. Создай private class MyUncaughtExceptionHandler, который на перехват исключения должен подождать половину секунды, а затем вывести на экран secretKey, имя трэда и сообщение возникшего исключения.
Используй String.format(...).

Пример:
super secret key, Thread-0, it's an example

2. Разберись в последовательности выполняемого кода и обеспечь логирование возникновения исключения в п.1.
3. Метод main в тестировании не участвует.
Требования:

    •
    Создай private class MyUncaughtExceptionHandler с конструктором по-умолчанию в классе MyThread.
    •
    Во время перехвата исключения, MyUncaughtExceptionHandler должен вызвать Thread.sleep(500).
    •
    Затем, MyUncaughtExceptionHandler должен выводить в консоль secretKey, имя трэда и сообщение возникшего исключения.
    •
    Для вывода сообщения используй String.format(...).
    •
    Нужно обеспечить логирование возникновения исключения.
    */

public class Solution {

    public static void main(String[] args) {
        MyThread myThread = new Solution().new MyThread("super secret key");
        myThread.start();
    }

    public class MyThread extends Thread {
        private String secretKey;

        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
            setDaemon(false);
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }

        private class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                try {
                    Thread.sleep(500);
                }catch (InterruptedException ie){}

                System.out.println(String.format("%s, %s, %s", secretKey, getName(), e.getMessage()));
            }
        }
    }

}


