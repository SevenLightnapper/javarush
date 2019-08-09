package javarush.java_multithreading_3.level9.lecture9.task6;

/* Argument and Value are generic types*/
public interface Computable<Argument, Value> {
    Value compute(Argument argument) throws InterruptedException;
}

