package javarush.java_syntax_1.level6.lecture11.task1;
/*
package com.javarush.Task.task06.task0613;
*/
/*
Кот и статика
*/
/*
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()].
Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount увеличивается на 1.
Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

public class Solution {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            Cat cat = new Cat();

        }//создай 10 котов

        System.out.println(Cat.catCount);//выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount;//создай статическую переменную catCount

        public Cat(){
            Cat.catCount++;
        }//создай конструктор
    }
}

