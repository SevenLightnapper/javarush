package javarush.java_core_2.level6.lecture13.task12;
/*
package com.javarush.task.task16.task1632;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить "Ура";
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.

Подсказка:
Нить 4 можно проверить методом isAlive()
Требования:

    •
    Статический блок класса Solution должен создавать и добавлять 5 нитей в список threads.
    •
    Нити из списка threads не должны стартовать автоматически.
    •
    Нить 1 из списка threads должна бесконечно выполняться.
    •
    Нить 2 из списка threads должна выводить "InterruptedException" при возникновении исключения InterruptedException.
    •
    Нить 3 из списка threads должна каждые полсекунды выводить "Ура".
    •
    Нить 4 из списка threads должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться.
    •
    Нить 5 из списка threads должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
    */

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new myThread());
        threads.add(new myThread2());
        threads.add(new myThread3());
        threads.add(new myThread4());
        threads.add(new myThread5());
    }

    static class myThread extends Thread{
        public void run() {
            while (true){

            }
        }
    }

    static class myThread2 extends Thread{
        public void run() {
            while (true){
                System.out.println("Beep!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }

    }

    static class myThread3 extends Thread{
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class myThread4 extends Thread implements Message {

        public void run() {
            while (!this.isInterrupted()){
            }
        }

        public void showWarning() {
            this.interrupt();
        }
    }

    static class myThread5 extends Thread {

        public void run() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            while (true){
                try {
                    String N = bufferedReader.readLine();
                    if (N.equals("N")){
                        break;
                    } else {
                        sum = sum + Integer.parseInt(N);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {
    }
}
