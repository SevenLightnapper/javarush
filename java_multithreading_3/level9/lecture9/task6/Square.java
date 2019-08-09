package javarush.java_multithreading_3.level9.lecture9.task6;

public class Square implements Computable<Integer, Integer> {
    @Override
    public Integer compute(Integer integer) throws InterruptedException {
        int val = integer.intValue();
        return val * val;
    }
}

