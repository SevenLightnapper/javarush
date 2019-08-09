package javarush.java_multithreading_3.level9.lecture15_restaurant.kitchen;


import javarush.java_multithreading_3.level9.lecture15_restaurant.ConsoleHelper;
import javarush.java_multithreading_3.level9.lecture15_restaurant.statistic.StatisticManager;
import javarush.java_multithreading_3.level9.lecture15_restaurant.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.concurrent.LinkedBlockingQueue;

public class Cook extends Observable implements Runnable {
    private String name;
    private boolean busy;
    private LinkedBlockingQueue<Order> queue = new LinkedBlockingQueue<>();

    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    public boolean isBusy() {
        return busy;
    }

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public void run()
    {
        while (!Thread.currentThread().isInterrupted())
        {
            if (!queue.isEmpty())
            {
                Order order = queue.poll();
                if (order != null)
                {
                    this.startCookingOrder(order);
                }
                try
                {
                    Thread.sleep(10);
                }
                catch (InterruptedException e)
                {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public void startCookingOrder(Order order)
    {
        busy = true;

        ConsoleHelper.writeMessage("Start cooking - " + order +
                ", cooking time " + order.getTotalCookingTime() + "min");

        CookedOrderEventDataRow eventDataRow = new CookedOrderEventDataRow(
                order.getTablet().toString(),
                name,
                order.getTotalCookingTime() * 60,
                order.getDishes());
        StatisticManager.getInstance().register(eventDataRow);

        try
        {
            Thread.sleep(10 * order.getTotalCookingTime());
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        setChanged();
        notifyObservers(order);

        busy = false;
    }

    @Override
    public String toString() {
        return name;
    }
}