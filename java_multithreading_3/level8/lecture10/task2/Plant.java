package javarush.java_multithreading_3.level8.lecture10.task2;

import java.util.concurrent.atomic.AtomicInteger;

public class Plant extends Character {
    private final static AtomicInteger idSequence = new AtomicInteger();
    private final int id = idSequence.incrementAndGet();

    protected int getId() {
        return id;
    }
}
