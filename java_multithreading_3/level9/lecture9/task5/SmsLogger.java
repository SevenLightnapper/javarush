package javarush.java_multithreading_3.level9.lecture9.task5;

public class SmsLogger extends AbstractLogger implements Logger {

    public SmsLogger(int level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Send SMS to CEO: " + message);
    }
}
