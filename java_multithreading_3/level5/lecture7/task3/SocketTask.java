package javarush.java_multithreading_3.level5.lecture7.task3;
/*
package com.javarush.task.task25.task2509;
*/
/*
1. Почитать в инете про Socket, ThreadPoolExecutor, RunnableFuture, Callable.
2. Реализуй логику метода cancel в классе SocketTask.
3. Реализуй логику метода cancel для локального класса внутри метода newTask в классе SocketTask.
Требования:

    •
    Определение класса SocketTask, его поля и сигнатуры методов менять нельзя.
    •
    Метод cancel в классе SocketTask должен закрывать используемые классом ресурсы.
    •
    Метод cancel для локального класса внутри метода newTask должен закрывать ресурсы SocketTask и вызвать cancel у родительского класса.
    •
    Метод у родительского класса должен быть вызван, даже если во время закрытия ресурсов было выкинуто исключение.
    */

import java.net.Socket;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public abstract class SocketTask<T> implements CancellableTask<T> {
    private Socket socket;

    protected synchronized void setSocket(Socket socket) {
        this.socket = socket;
    }

    public synchronized void cancel() {
        try {
            socket.close();//close all resources here
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public RunnableFuture<T> newTask() {
        return new FutureTask<T>(this) {
            public boolean cancel(boolean mayInterruptIfRunning) {
                try { //close all resources here by using proper SocketTask method
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally { super.cancel(mayInterruptIfRunning); } //call super-class method in finally block
                return false;
            }
        };
    }
}
