package javarush.java_multithreading_3.level9.lecture15_restaurant;

import javarush.java_multithreading_3.level9.lecture15_restaurant.kitchen.Cook;
import javarush.java_multithreading_3.level9.lecture15_restaurant.kitchen.Order;
import javarush.java_multithreading_3.level9.lecture15_restaurant.kitchen.Waiter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class Restaurant {
    private static final int ORDER_CREATING_INTERVAL = 100;
    private static final LinkedBlockingQueue<Order> queue = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws IOException {
        Cook alf = new Cook("Alf");
        alf.setQueue(queue);
        Cook randy = new Cook("Randy");
        randy.setQueue(queue);

        Waiter waiter = new Waiter();
        waiter.setReadyOrders(queue);
        randy.setQueue(queue);

        List<Tablet> tablets = new ArrayList<>(5);
        for (int i = 1; i <= 5; i++)
        {
            Tablet tablet = new Tablet(i);
            tablet.setQueue(queue);
            tablets.add(tablet);
        }

        RandomOrderGeneratorTask task = new RandomOrderGeneratorTask(tablets, ORDER_CREATING_INTERVAL);
        Thread orderThread = new Thread(task);
        orderThread.start();

        Thread amigoThread = new Thread(alf);
        amigoThread.start();
        Thread makarevichThread = new Thread(randy);
        makarevichThread.start();

        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
        }

        orderThread.interrupt();

        boolean isNotDone = true;
        while (isNotDone)
        {
            if (queue.isEmpty())
            {
                amigoThread.interrupt();
                makarevichThread.interrupt();
                isNotDone = false;
            }
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }

        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printCookWorkloading();
        directorTablet.printActiveVideoSet();
        directorTablet.printArchivedVideoSet();
    }
}