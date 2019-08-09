package javarush.java_syntax_1.level3.lecture8.task4;

    public class FullmetragePicture {
/*
    package com.javarush.Task.task01.task0131;
*/
/*
Полнометражная картина
*/

        public static void main(String[] args) {
            System.out.println(getMetreFromCentimetre(243));

        }

        public static int getMetreFromCentimetre(int centimetre) {
            int Metre = centimetre / 100;
            return Metre;//напишите тут ваш код
        }
    }
