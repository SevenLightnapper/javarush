package javarush.java_core_2.level3.lecture11.task6;
/*
package com.javarush.Task.task13.task1321;
*/
/*
Исправление ошибок
*/
/*
1. Переделай наследование в классах и интерфейсах так,
   чтобы программа компилировалась и продолжала делать то же самое.
2. Класс Hobbie должен наследоваться от интерфейсов Desire, Dream.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream extends Desire {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}

