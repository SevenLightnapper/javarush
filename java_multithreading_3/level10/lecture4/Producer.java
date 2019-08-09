package javarush.java_multithreading_3.level10.lecture4;

import java.util.concurrent.TransferQueue;

public class Producer implements Runnable {
    private TransferQueue<ShareItem> queue;

    public Producer(TransferQueue<ShareItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Thread.currentThread().setDaemon(true);
        for (int i = 1; i <= 9; i++) {
            System.out.format("Элемент 'ShareItem-%d' добавлен", i);
            queue.offer(new ShareItem(String.format("ShareItem-%d", i), i));
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
        if (queue.hasWaitingConsumer()) {
            System.out.format("Consumer в ожидании!");
        }
    }
}
