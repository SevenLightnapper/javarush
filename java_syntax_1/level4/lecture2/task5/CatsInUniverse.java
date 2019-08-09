package javarush.java_syntax_1.level4.lecture2.task5;

public class CatsInUniverse {
    /*
        package com.javarush.Task.task04.task0407;
    */
/*
Кошки во Вселенной
*/
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat.count++;//напишите тут ваш код

        Cat cat2 = new Cat();
        Cat.count++;

        System.out.println("Cats count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
