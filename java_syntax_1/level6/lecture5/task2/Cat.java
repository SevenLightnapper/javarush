package javarush.java_syntax_1.level6.lecture5.task2;
/*
package com.javarush.Task.task06.task0602;
*/
/*
Пустые кошки, пустые псы
*/
/*
В каждом классе Cat и Dog написать метод finalize,
который выводит на экран текст о том, что такой-то объект уничтожен.
*/

public class Cat {
    public static void main(String[] args) {

    }

    protected void finalize() throws Throwable{
        System.out.println("Cat was destroyed");
    }//напишите тут ваш код

}

class Dog {
    protected void finalize() throws Throwable{
        System.out.println("Dog was destroyed");
    }//напишите тут ваш код
}

