package javarush.java_multithreading_3.level5.lecture16_refactoring.car;

public class Cabriolet extends Car {
    private int numberOfPassengers;
    static public final int MAX_CABRIOLET_SPEED = 90;

    public Cabriolet(int numberOfPassengers) {
        super(2, numberOfPassengers);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return MAX_CABRIOLET_SPEED;
    }
}
