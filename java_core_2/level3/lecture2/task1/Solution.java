package javarush.java_core_2.level3.lecture2.task1;
/*
package com.javarush.Task.task13.task1301;
*/
/*
Пиво
*/
/*
1. Подумай, какой из двух интерфейсов нужно реализовать в классе Beer.
2. Добавь к классу Beer этот интерфейс и реализуй все его методы.
3. Подумай, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drink {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol {
        public void sleepOnTheFloor(){}

        public void askMore(String message){}

        public void sayThankYou(){}

        public boolean isReadyToGoHome(){
            return READY_TO_GO_HOME;
        }
    }
}
