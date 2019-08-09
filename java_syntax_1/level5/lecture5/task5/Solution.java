package javarush.java_syntax_1.level5.lecture5.task5;
/*
package com.javarush.Task.task05.task0505;
*/
/*
Кошачья бойня
*/
/*
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.
*/
public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jack", 4, 7, 9);
        Cat cat2 = new Cat("Kim", 7, 3, 10);
        Cat cat3 = new Cat("Max", 1, 2, 5);//напишите тут ваш код

        System.out.println(cat1.fight(cat2)+ "\n" +
                cat3.fight(cat1) + "\n" +
                cat2.fight(cat3));

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}

