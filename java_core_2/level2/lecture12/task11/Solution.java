package javarush.java_core_2.level2.lecture12.task11;
/*
package com.javarush.Task.task12.task1231;
*/
/*
Ненужные абстракции
*/
/*
Необходимо расставить правильно ключевые слова abstract, чтобы программа компилировалась.
Добавь там где надо и удали там, где они не нужны.
*/

public class Solution {

    public static void main(String[] args) {
        Horse horse = new Pegas();
        horse.run();
    }

    public static interface Fly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegas extends Horse implements Fly {
        public void fly() {

        }
    }

    public abstract static class SwimPegas extends Pegas {
        public abstract void swim();
    }

}

