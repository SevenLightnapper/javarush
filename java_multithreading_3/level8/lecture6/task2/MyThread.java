package javarush.java_multithreading_3.level8.lecture6.task2;

/*
В отдельном файле создай класс MyThread унаследовавшись от Thread. MyThread должен:
1. Иметь возможность быть созданным используя любой конструктор супер-класса (Alt+Insert).
2. Приоритет у трэдов должен проставляться циклично от минимального значения до максимального значения.
3. если у трэда установлена трэд-группа(ThreadGroup), то приоритет трэда не может быть больше максимального приоритета его трэд-группы.
Требования:

    •
    Создай класс MyThread в отдельном файле. Унаследуй его от Thread.
    •
    В классе MyThread должны присутствовать конструкторы, аналогичные конструкторам супер-класса.
    •
    Приоритет у объектов MyThread должен проставляться циклично, от MIN_PRIORITY до MAX_PRIORITY.
    •
    Если у объекта MyThread установлена ThreadGroup, приоритет MyThread не должен быть выше максимального приоритета ThreadGroup.
    */

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    public static AtomicInteger counter = new AtomicInteger(1);

    public MyThread() {
        if (counter.get() < 10) setPriority(counter.getAndIncrement());
        else {
            setPriority(counter.get());
            counter.set(1);
        }
    }

    public MyThread(Runnable target) {
        super(target);
        if (counter.get() < 10) setPriority(counter.getAndIncrement());
        else {
            setPriority(counter.get());
            counter.set(1);
        }

    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        if (counter.get() < 10) setPriority(counter.getAndIncrement());
        else {
            setPriority(counter.get());
            counter.set(1);
        }
    }

    public MyThread(String name) {
        super(name);
        if (counter.get() < 10) setPriority(counter.getAndIncrement());
        else {
            setPriority(counter.get());
            counter.set(1);
        }
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        if (counter.get() < 10) setPriority(counter.getAndIncrement());
        else {
            setPriority(counter.get());
            counter.set(1);
        }
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        if (counter.get() < 10) setPriority(counter.getAndIncrement());
        else {
            setPriority(counter.get());
            counter.set(1);
        }
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        if (counter.get() < 10) setPriority(counter.getAndIncrement());
        else {
            setPriority(counter.get());
            counter.set(1);
        }
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        if (counter.get() < 10) setPriority(counter.getAndIncrement());
        else {
            setPriority(counter.get());
            counter.set(1);
        }
    }


}
