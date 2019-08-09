package javarush.java_syntax_1.level5.lecture5.task2;

public class Cat {
/*
package com.javarush.Task.task05.task0502;

Реализовать метод fight
------------------------------------------------------------------------------------------------------------------------
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.

Должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false
*/
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        return ((strength + weight) * age) > ((anotherCat.strength + anotherCat.weight) * anotherCat.age);//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
