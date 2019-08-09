package javarush.java_multithreading_3.level7.lecture9.task3;

public class Person implements Runnable {
    private final Mail mail;

    public Person(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        synchronized (mail) {
            try {
                String name = Thread.currentThread().getName();
                Thread.sleep(1000);
                mail.setText("Person [" + name + "] wrote an email 'AAA'");
                mail.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

