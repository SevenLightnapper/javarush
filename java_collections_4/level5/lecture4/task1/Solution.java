package javarush.java_collections_4.level5.lecture4.task1;
/*
package com.javarush.task.task35.task3502;
*/
import java.util.List;
/*
Знакомство с дженериками
*/
/*
Параметризируй классы SomeClass и Solution следующим образом:
1. SomeClass должен работать с типами, которые наследуются от Number;
2. Solution должен работать с типами, которые наследуются от List, который в свою очередь параметризируется типом SomeClass.
Требования:

    •
    Класс SomeClass должен работать с типами которые наследуются от Number.
    •
    Класс Solution должен работать с типами, которые наследуются от List, который в свою очередь параметризируется типом SomeClass.
    •
    Класс SomeClass должен быть публичным.
    •
    Класс SomeClass должен быть статическим.
    •
    Класс SomeClass должен находиться внутри класса Solution.
    */

public class Solution <T1 extends List<Solution.SomeClass>> {
    public static class SomeClass <T3 extends Number> {
    }

    public static void main(String[] args) {

    }
}

