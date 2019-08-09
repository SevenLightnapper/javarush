package javarush.java_multithreading_3.level10.lecture4;

import java.util.concurrent.TransferQueue;

public class Consumer implements Runnable {
    private TransferQueue<ShareItem> queue;

    public Consumer(TransferQueue<ShareItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Thread.currentThread().setDaemon(true);
        try {
            Thread.sleep(450);
            while (true) {
                queue.take();
                System.out.format("Processing item.toString()");
            }
        } catch (InterruptedException e) {}
    }
}
