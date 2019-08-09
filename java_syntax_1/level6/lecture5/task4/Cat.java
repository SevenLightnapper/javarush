package javarush.java_syntax_1.level6.lecture5.task4;
/*
package com.javarush.Task.task06.task0604;
*/
/*
Ставим котов на счётчик
*/
/*
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
*/

public class Cat {
    public static int catCount = 0;

    public Cat() {
        catCount++;
    }//напишите тут ваш код
    protected void finalize(){
        catCount--;
    }
    public static void main(String[] args) {

    }
}