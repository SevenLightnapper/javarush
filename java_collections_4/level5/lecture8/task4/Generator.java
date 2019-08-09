package javarush.java_collections_4.level5.lecture8.task4;
/*
package com.javarush.task.task35.task3512;
*/
/*
Разберись с текущими классами.
Метод newInstance класса Generator должен создавать Event для каждого нового вызова, однако сейчас компилятор ругается на синтаксис.
Переделай класс Generator так, что бы конструкция стала рабочей.

Подсказка: Для создания объекта потребуется использовать метод Class<T>.newInstance().
Требования:

    •
    Класс Generator должен быть параметризован типом Т.
    •
    Класс Generator должен иметь поле типа Class, которое параметризовано типом Т.
    •
    Класс Generator должен иметь конструктор, который инициализирует поле типа Class.
    •
    Метод newInstance в классе Generator должен создавать и возвращать объект типа Т.
    */

public class Generator<T> {
    Class<T> clazz;

    public Generator(Class<T> clazz) {
        this.clazz = clazz;
    }

    T newInstance() throws IllegalAccessException, InstantiationException {
        return (T) clazz.newInstance();
    }
}