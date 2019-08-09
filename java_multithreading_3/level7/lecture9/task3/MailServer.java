package javarush.java_multithreading_3.level7.lecture9.task3;
/*
package com.javarush.task.task27.task2710;
*/
public class MailServer implements Runnable {
    private Mail mail;

    public MailServer(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        synchronized (mail) {
            try {
                long startTime = System.currentTimeMillis();
                String name = Thread.currentThread().getName();
                mail.wait();
                long endTime = System.currentTimeMillis();
                System.out.format("%s MailServer received: [%s] in %d ms after start", name, mail.getText(), (endTime - startTime));
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

