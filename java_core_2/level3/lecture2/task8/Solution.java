package javarush.java_core_2.level3.lecture2.task8;
/*
package com.javarush.Task.task13.task1308;
*/
/*
Эй, ты там живой?
*/
/*
1. Создай интерфейс Person.
2. Добавь в него метод isAlive(), который проверяет, жив человек или нет.
3. Подумай, какой тип должен возвращать этот метод.
4. Создай интерфейс Presentable.
5. Унаследуй интерфейс Presentable от интерфейса Person.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        boolean isAlive();
    }
    interface Presentable extends Person {}
}
