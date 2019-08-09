package javarush.java_multithreading_3.level5.lecture16_refactoring.car;

public class Sedan extends Car {
    private int numberOfPassengers;
    static public final int MAX_SEDAN_SPEED = 120;
    public Sedan (int numberOfPassengers) {
        super(1, numberOfPassengers);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SEDAN_SPEED;
    }
}
