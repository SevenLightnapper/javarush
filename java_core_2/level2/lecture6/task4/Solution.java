package javarush.java_core_2.level2.lecture6.task4;
/*
package com.javarush.Task.task12.task1214;
*/
/*
Корова — тоже животное
*/
/*
Унаследуй класс Cow от Animal.
Реализуй все недостающие методы в классе Cow.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        public String getName(){
            return "null";
        }
    }

}

