package javarush.java_multithreading_3.level9.lecture15_restaurant;


import javarush.java_multithreading_3.level9.lecture15_restaurant.ad.AdvertisementManager;
import javarush.java_multithreading_3.level9.lecture15_restaurant.ad.NoVideoAvailableException;
import javarush.java_multithreading_3.level9.lecture15_restaurant.kitchen.Order;
import javarush.java_multithreading_3.level9.lecture15_restaurant.kitchen.TestOrder;

import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet {
    private LinkedBlockingQueue<Order> queue;
    final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder() {
        Order order = null;
        try
        {
            order = new Order(this);
            ConsoleHelper.writeMessage(order.toString());
            if(!order.isEmpty())
            {
                try {
                    new AdvertisementManager(order.getTotalCookingTime() * 60).processVideos();
                }
                catch (NoVideoAvailableException e) {
                    logger.log(Level.INFO, "No video is available for the order " + order);
                }
                queue.add(order);
            }
        }
        catch (IOException e)
        {
            logger.log(Level.SEVERE, "Console is unavailable.");
        }
        return order;
    }

    public void createTestOrder() {
        TestOrder testOrder = null;
        try {
            testOrder = new TestOrder(this);
            ConsoleHelper.writeMessage(testOrder.toString());
            if (!testOrder.isEmpty()) {
                queue.put(testOrder);
                AdvertisementManager advertisementManager = new AdvertisementManager(testOrder.getTotalCookingTime() * 60);
                advertisementManager.processVideos();
            }
        }
        catch (IOException e) { logger.log(Level.SEVERE, "Console is unavailable."); }
        catch (NoVideoAvailableException e) { logger.log(Level.INFO, "No video is available for the order " + testOrder); }
        catch (InterruptedException e) {}
    }


    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}

