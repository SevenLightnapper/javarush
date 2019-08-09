package javarush.java_core_2.level3.lecture2.task3;
/*
package com.javarush.Task.task13.task1303;
*/
/*
Пиво с колой не мешать
*/
/*
Реализуй интерфейс Drink в классах Beer и Cola.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink {
        public boolean isAlcoholic(){
            return true;
        }
    }

    public static class Cola implements Drink {
        public boolean isAlcoholic(){
            return false;
        }
    }
}

