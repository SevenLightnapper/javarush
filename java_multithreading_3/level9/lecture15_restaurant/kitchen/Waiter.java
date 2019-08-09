package javarush.java_multithreading_3.level9.lecture15_restaurant.kitchen;

import javarush.java_multithreading_3.level9.lecture15_restaurant.ConsoleHelper;

import java.util.concurrent.LinkedBlockingQueue;

public class Waiter implements Runnable {
    private boolean busy;
    private LinkedBlockingQueue<Order> readyOrders;

    public boolean isBusy() {
        return busy;
    }

    public void setReadyOrders(LinkedBlockingQueue<Order> readyOrders) {
        this.readyOrders = readyOrders;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            busy = true;
            try {
                Order order = readyOrders.take();
                if (order != null)
                    ConsoleHelper.writeMessage(order + " was cooked by " + order.getCook());
                busy = false;
            }
            catch (InterruptedException e) {
                System.out.println("waiter end working");
                Thread.currentThread().interrupt();
            }
        }
    }
}