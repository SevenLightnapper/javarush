package javarush.java_multithreading_3.level7.lecture4.task1;
/*
package com.javarush.task.task27.task2703;
*/
/*
Создаем deadlock
*/
/*
Расставь модификаторы так, чтобы при работе с этим кодом появился deadlock.
Метод main порождает deadlock, поэтому не участвует в тестировании.
Требования:
    •
    Класс Solution.Friend НЕ должен быть приватным.
    •
    Класс Solution.Friend должен быть статическим.
    •
    Метод bow должен быть объявлен с модификатором synchronized.
    •
    Метод bowBack должен быть объявлен с модификатором synchronized.
    */

public class Solution {
    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                            + " bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                            + " bowed back to me!%n",
                    this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse =
                new Friend("Alphonse");
        final Friend gaston =
                new Friend("Gaston");
        new Thread(new Runnable() {
            public void run() {
                alphonse.bow(gaston);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                gaston.bow(alphonse);
            }
        }).start();
    }
}
