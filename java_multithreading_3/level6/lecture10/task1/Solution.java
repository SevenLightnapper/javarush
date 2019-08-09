package javarush.java_multithreading_3.level6.lecture10.task1;
/*
package com.javarush.task.task26.task2612;
*/
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* Весь мир играет комедию.
Почитать про java.util.concurrent.locks.Lock на http://docs.oracle.com/  (там все есть в джавадоках!)
Написать реализацию метода someMethod:
1. попытаться захватить лок
1.1. если лок занят, то вызвать метод ifLockIsBusy
1.2. если лок свободен, то:
1.2.1 вызвать метод ifLockIsFree
1.2.2 отпустить лок при любых условиях, даже если ifLockIsFree будет кидать исключение
*/
class Solution {

    private Lock lock = new ReentrantLock();

    public void someMethod() {
        if (lock.tryLock()) {
            try {
                actionIfLockIsFree();
            } finally {
                lock.unlock();
            }
        } else {
            actionIfLockIsBusy();
        }
    }

    @SuppressWarnings("EmptyMethod")
    public void actionIfLockIsFree() {
    }

    @SuppressWarnings("EmptyMethod")
    public void actionIfLockIsBusy() {
    }
}
