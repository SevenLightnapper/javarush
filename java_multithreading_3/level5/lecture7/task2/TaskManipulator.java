package javarush.java_multithreading_3.level5.lecture7.task2;

/*
Восстанови логику класса TaskManipulator.
Требования:

    •
    Класс TaskManipulator должен реализовывать интерфейсы Runnable и CustomThreadManipulator.
    •
    Метод run должен каждые 100 миллисекунд выводить имя исполняемой нити в консоль.
    •
    Класс TaskManipulator должен иметь внутреннее поле типа Thread.
    •
    Метод start должен создавать, сохранять во внутреннее поле и запускать нить с именем, которое передано через аргумент метода.
    •
    Метод stop должен прерывать последнюю созданную классом TaskManipulator нить.
    */

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    private Thread thread;

    @Override
    public void run() {

        while (!thread.isInterrupted()) {
            System.out.println(thread.getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void start(String threadName) {
        thread = new Thread(this);
        thread.start();
        thread.setName(threadName);
    }

    @Override
    public void stop() {
        thread.interrupt();
    }
}

