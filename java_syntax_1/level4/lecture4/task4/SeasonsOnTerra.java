package javarush.java_syntax_1.level4.lecture4.task4;

public class SeasonsOnTerra {
/*
    package com.javarush.Task.task04.task0411;
*/
/*
    Времена года на Терре
*/


    public static void main(String[] args) {
            checkSeason(12);
            checkSeason(4);
            checkSeason(7);
            checkSeason(10);
        }

        public static void checkSeason(int month) {
            if (!(!(month < 12) || !(month > 8)))//напишите тут ваш код
                System.out.println("осень");

            else if (!(!(month > 2) || !(month < 6)))
                System.out.println("весна");

            else if (!(!(month < 9) || !(month > 5)))
                System.out.println("лето");

            else
                System.out.println("зима");

    }
}

