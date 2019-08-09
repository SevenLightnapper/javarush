package javarush.java_multithreading_3.level5.lecture16_refactoring.car;

public class Truck extends Car {
    private int numberOfPassengers;
    static public final int MAX_TRUCK_SPEED = 80;

    public Truck(int numberOfPassengers) {
        super(0, numberOfPassengers);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return MAX_TRUCK_SPEED;
    }
}

