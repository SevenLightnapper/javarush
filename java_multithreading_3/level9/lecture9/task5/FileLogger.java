package javarush.java_multithreading_3.level9.lecture9.task5;

public class FileLogger extends AbstractLogger implements Logger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        System.out.println("Logging to file: " + message);
    }
}
