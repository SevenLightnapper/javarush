package javarush.java_multithreading_3.level9.lecture15_restaurant;

import java.util.List;

public class RandomOrderGeneratorTask implements Runnable {
    private int interval;
    private List<Tablet> tablets;

    public RandomOrderGeneratorTask(List<Tablet> tablets, int interval) {
        this.tablets = tablets;
        this.interval = interval;
    }

    @Override
    public void run() {
        try{
            while(!Thread.currentThread().isInterrupted()) {
                int indexOfTablet = (int) (Math.random() * tablets.size());
                Tablet tablet = tablets.get(indexOfTablet);
                tablet.createTestOrder();

                Thread.sleep(interval);
            }
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }
}

