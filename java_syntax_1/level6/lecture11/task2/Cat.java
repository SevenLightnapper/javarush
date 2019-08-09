package javarush.java_syntax_1.level6.lecture11.task2;
/*
package com.javarush.Task.task06.task0614;
*/
import java.util.ArrayList;

/*
Статические коты
*/
/*
1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat)
в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public static ArrayList<Cat> cats; //напишите тут ваш код

    public Cat() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        cats.forEach(System.out::println);
    }
}
