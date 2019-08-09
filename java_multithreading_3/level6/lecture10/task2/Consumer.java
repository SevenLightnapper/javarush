package javarush.java_multithreading_3.level6.lecture10.task2;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) { System.out.println(queue.take()); }
        } catch (InterruptedException e) { }
    }
}
