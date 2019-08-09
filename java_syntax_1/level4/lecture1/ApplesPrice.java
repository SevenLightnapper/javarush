package javarush.java_syntax_1.level4.lecture1;

public class ApplesPrice {
    /*
    package com.javarush.Task.task04.task0402;
    */
    /*
    Цена яблок
    */

    public static void main(String[] args) {
            Apple apple = new Apple();
            apple.addPrice(50);
            Apple apple2 = new Apple();
            apple2.addPrice(100);
            System.out.println("Стоимость яблок " + Apple.applesPrice);
        }

        public static class Apple {
            public static int applesPrice = 0;

            public static void addPrice(int applesPrice) {
                Apple.applesPrice = Apple.applesPrice + applesPrice;
                //напишите тут ваш код
            }
        }
}
