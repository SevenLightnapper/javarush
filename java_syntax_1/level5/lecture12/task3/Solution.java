package javarush.java_syntax_1.level5.lecture12.task3;
/*
package com.javarush.Task.task05.task0527;
*/
/*
Том и Джерри
*/
/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog americanBulldog = new Dog("Spike", 50, "grey");
        Dog americanBulldogSon = new Dog("Tyke", 25, "grey");
        Cat tomCat = new Cat("Jasper/Tom", 38, "grey-white");//напишите тут ваш код
        Cat alleyCat = new Cat("Butch", 45, "black");
    }

    public static class Mouse {
        String name;
        int height;
        int tail;
        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog{
        String name;
        int weight;
        String color;
        public Dog(String name, int weight, String color){
            this.name = name;
            this.weight = weight;
            this.color = color;
        }
    }//напишите тут ваш код

    public static class Cat{
        String name;
        int weight;
        String color;
        public Cat(String name, int weight, String color){
            this.name = name;
            this.weight = weight;
            this.color = color;
        }
    }
}
