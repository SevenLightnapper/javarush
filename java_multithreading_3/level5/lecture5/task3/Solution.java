package javarush.java_multithreading_3.level5.lecture5.task3;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread target = new Thread();
        LoggingStateThread loggingStateThread = new LoggingStateThread(target);

        loggingStateThread.start(); //NEW
        Thread.sleep(100);
        target.start();  //RUNNABLE
        Thread.sleep(100);
        //TERMINATED
    }
}

