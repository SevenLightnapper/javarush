package javarush.java_syntax_1.level10.lecture11.task6;
/*
package com.javarush.Task.task10.task1013;
*/
/*
Конструкторы класса Human
*/
/*
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/
public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String eyeColor; // напишите тут ваши переменные и конструкторы
        private int height;
        private double weight;
        private String country;
        private Human mother;
        private Human father;

        //1
        public Human(String eyeColor){
            this.eyeColor = eyeColor;
        }

        //2
        public Human (int height){
            this.height = height;
        }

        //3
        public Human(double weight){
            this.weight = weight;
        }

        //4
        public Human(String country, String eyeColor){
            this.country = country;
            this.eyeColor = eyeColor;
        }

        //5
        public Human(int height, int weight){
            this.height = height;
            this.weight = weight;
        }

        //6
        public Human(Human mother, Human father){
            this.mother = mother;
            this.father = father;
        }

        //7
        public Human(Human mother, Human father, String eyeColor){
            this.eyeColor = eyeColor;
            this.mother = mother;
            this.father = father;
        }

        //8
        public Human(int height, int weight, String country){
            this.height = height;
            this.weight = weight;
            this.country = country;
        }

        //9
        public Human(Human mother, Human father, String eyeColor, String country){
            this.mother = mother;
            this.father = father;
            this.eyeColor = eyeColor;
            this.country = country;
        }

        //10
        public Human(String eyeColor, int height, int weight, String country, Human mother, Human father){
            this.eyeColor = eyeColor;
            this.height = height;
            this.weight = weight;
            this.country = country;
            this.father = father;
            this.mother = mother;
        }
    }
}

