package javarush.java_multithreading_3.level9.lecture9.task5;

public class PhoneLogger extends AbstractLogger implements Logger {

    public PhoneLogger(int level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Call to director: " + message);
    }
}
