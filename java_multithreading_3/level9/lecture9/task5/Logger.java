package javarush.java_multithreading_3.level9.lecture9.task5;

public interface Logger {
    void inform(String message, int level);

    void setNext(Logger next);

    void info(String message);
}
