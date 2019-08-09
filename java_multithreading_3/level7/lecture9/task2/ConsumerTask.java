package javarush.java_multithreading_3.level7.lecture9.task2;

public class ConsumerTask implements Runnable {
    private TransferObject transferObject;
    protected volatile boolean stopped;

    public ConsumerTask(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ConsumerTask").start();
    }

    public void run() {
        while (!stopped) {
            synchronized (transferObject) {
                transferObject.get();
            }
        }
    }

    public void stop() {
        stopped = true;
    }
}
