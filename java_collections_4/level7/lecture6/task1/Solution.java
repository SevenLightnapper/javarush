package javarush.java_collections_4.level7.lecture6.task1;
/*
package com.javarush.task.task37.task3703;
*/
/*
Найти класс по описанию
*/
/*
Метод getExpectedClass должен возвращать класс который:
1. Реализует интерфейс Map.
2. Используется при работе с трэдами.
3. Является неблокирующей версией списка с пропусками, который адаптирован для хеш-таблицы.
Про список с пропусками читать в дополнительном материале к этой лекции.
Требования:

    •
    Метод getExpectedClass должен возвращать класс описанный в условии задачи.
    •
    Класс возвращенный методом getExpectedClass должен быть потомком класса AbstractMap.
    •
    Класс возвращенный методом getExpectedClass должен поддерживать интерфейс ConcurrentNavigableMap.
    •
    Класс возвращенный методом getExpectedClass должен поддерживать интерфейс Serializable.
    •
    Класс возвращенный методом getExpectedClass должен поддерживать интерфейс Cloneable.
    */

import java.util.concurrent.ConcurrentSkipListMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        return ConcurrentSkipListMap.class;
    }
}
