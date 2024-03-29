package javarush.java_multithreading_3.level5.lecture5.task3;
/*
package com.javarush.task.task25.task2506;
*/
/*
Cоздай класс нити LoggingStateThread, которая будет выводить в консоль все состояния (State) переданной в конструктор нити.
Нить LoggingStateThread должна сама завершаться после остановки переданной в конструктор нити.
Метод main не участвует в тестировании.
Требования:

    •
    Создай класс LoggingStateThread в отдельном файле. Он должен наследовать класс Thread.
    •
    Класс LoggingStateThread должен содержать поле нити, за которой он будет следить. Это поле должно инициализироваться через конструктор.
    •
    Переопредели метод run в классе LoggingStateThread.
    •
    После запуска класс LoggingStateThread должен выводить в консоль изменения состояния переданной нити.
    •
    После завершения работы наблюдаемой нити, LoggingStateThread так же должен завершить работу.
    */

public class LoggingStateThread extends Thread
{
    private Thread target;
    public LoggingStateThread(Thread target)
    {
        setDaemon(true);
        this.target = target;
    }
    @Override
    public void run()
    {
        State state = target.getState();
        System.out.println(state);
        while(state != State.TERMINATED)
        {
            if (state != target.getState())
            {
                state = target.getState();
                System.out.println(state);
            }
        }
    }
}