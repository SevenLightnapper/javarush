package javarush.java_syntax_1.level5.lecture12.task1;
/*
package com.javarush.Task.task05.task0525;
*/
/*
И целой утки мало
*/
/*
По аналогии с классом Duck (утка) создай классы Cat (кошка) и Dog (собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);//напишите тут ваш код
        System.out.println(cat2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);

    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString(){
            return "Cat";
        }
    }
    public static class Dog {
        public String toString(){
            return "Dog";
        }
    }
    //напишите тут ваш код
}

