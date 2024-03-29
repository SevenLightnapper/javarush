package javarush.java_collections_4.level6.lecture10.task3;
/*
package com.javarush.task.task36.task3613;
*/
/*
Найти класс по описанию
*/
/*
Описание класса:
1. Пакет этого класса java.util.concurrent.
2. Реализует интерфейс BlockingQueue.
3. Используется при работе с трэдами.
4. Является блокирующей очередью, в которой каждая операция добавления должна ждать соответствующей операции удаления в другом потоке и наоборот.
5. Не имеет никакой внутренней емкости, даже емкости в один элемент.

Метод getExpectedClass() должен вернуть класс в виде XXX.class, где
XXX - название класса.
Требования:

    •
    В методе getExpectedClass не должны вызываться никакие методы.
    •
    Метод getExpectedClass должен вернуть правильный тип.
    •
    Метод main должен вызывать метод getExpectedClass.
    •
    Метод main должен вывести полученный класс на экран.
    */

import java.util.concurrent.SynchronousQueue;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        return SynchronousQueue.class;
    }
}