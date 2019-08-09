package javarush.java_collections_4.level8.lecture4.task1;
/*
package com.javarush.task.task38.task3802;
*/
/*
Проверяемые исключения (checked exception)
*/
/*
Напиши реализацию метода veryComplexMethod().
Он должен всегда кидать какое-нибудь проверяемое исключение.
Кинуть исключение (throw) явно нельзя.
Требования:

    •
    Метод veryComplexMethod класса veryComplexClass не должен использовать ключевое слово throw.
    •
    Метод veryComplexMethod класса veryComplexClass должен бросать исключение.
    •
    Брошенное исключение НЕ должно быть исключением времени выполнения(RuntimeException).
    •
    Метод veryComplexMethod не должен быть приватным.
    */
import java.io.FileReader;

public class VeryComplexClass {
    public void veryComplexMethod() throws Exception {
        //напишите тут ваш код
        FileReader reader = new FileReader("unknown.file.txt");

    }

    public static void main(String[] args) {

    }
}

