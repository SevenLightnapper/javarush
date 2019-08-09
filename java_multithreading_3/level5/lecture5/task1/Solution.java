package javarush.java_multithreading_3.level5.lecture5.task1;
/*
package com.javarush.task.task25.task2504;
*/
/*
Switch для нитей
*/
/*
Oбработай список нитей в зависимости от состояния:
1. Если нить еще не запущена, то запусти ее.
2. Если нить в ожидании, то прерви ее.
3. Если нить работает, то проверь маркер isInterrupted.
4. Если нить прекратила работу, то выведи в консоль ее приоритет.
Используй switch.
Требования:

    •
    Метод processThreads принимает аргументом массив нитей.
    •
    Если переданная нить не запущена, нужно ее запустить.
    •
    Если переданная нить находится в ожидании, нужно ее прервать.
    •
    Если переданная нить работает, то нужно проверить маркер isInterrupted.
    •
    Если переданная нить завершила работу, нужно вывести в консоль ее приоритет.
    •
    Метод processThreads должен использовать оператор switch.
    */

public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for(Thread thread: threads)  {
            switch (thread.getState()) {
                case NEW:
                    thread.start();
                    break;
                case  WAITING:
                    thread.interrupt();
                    break;
                case TIMED_WAITING:
                    thread.interrupt();
                    break;
                case BLOCKED:
                    thread.interrupt();
                    break;
                case  RUNNABLE:
                    thread.isInterrupted();
                    break;
                case  TERMINATED:
                    System.out.print(thread.getPriority());
//                    break;
            }
        }
    }

    public static void main(String[] args) {
    }
}
