package javarush.java_collections_4.level8.lecture4.task2;
/*
package com.javarush.task.task38.task3803;
*/
/*
Runtime исключения (unchecked exception)
*/
/*
Напиши реализацию метода methodThrowsClassCastException(). Он должен всегда кидать Runtime исключение ClassCastException.

Напиши реализацию метода methodThrowsNullPointerException(). Он должен всегда кидать Runtime исключение NullPointerException.

Кинуть исключение (throw) явно нельзя.
Требования:

    •
    Метод methodThrowsClassCastException класса veryComplexClass не должен использовать ключевое слово throw.
    •
    Метод methodThrowsNullPointerException класса veryComplexClass не должен использовать ключевое слово throw.
    •
    Метод methodThrowsClassCastException класса veryComplexClass должен бросать исключение ClassCastException.
    •
    Метод methodThrowsNullPointerException класса veryComplexClass должен бросать исключение NullPointerException.
    */


public class VeryComplexClass {
    public void methodThrowsClassCastException() throws ClassCastException {
        Object ch = new Character('*');
        System.out.println((Byte)ch);
    }

    public void methodThrowsNullPointerException() throws NullPointerException {
        int[] array = null;
        System.out.println(array.length);

    }

    public static void main(String[] args) {
        VeryComplexClass o = new VeryComplexClass();
        o.methodThrowsNullPointerException ();

    }
}

