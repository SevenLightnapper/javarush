package javarush.java_multithreading_3.level7.lecture9.task2;

import java.util.concurrent.atomic.AtomicInteger;

public class ProducerTask implements Runnable {
    private TransferObject transferObject;
    protected volatile boolean stopped;
    static volatile AtomicInteger i = new AtomicInteger(0);

    public ProducerTask(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ProducerTask").start();
    }

    public void run() {
        while (!stopped) {
            synchronized (transferObject){
                transferObject.put(i.incrementAndGet());
            }
        }
    }

    public void stop() {
        stopped = true;
    }
}

