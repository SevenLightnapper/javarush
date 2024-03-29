package javarush.java_core_2.level3.lecture2.task9;
/*
package com.javarush.Task.task13.task1309;
*/
/*
Всё, что движется
*/
/*
1. Создай интерфейс Movable с методом speed.
2. Метод speed должен возвращать значение типа Double и не должен ничего принимать в качестве аргументов.
3. Создай и унаследуй интерфейс Flyable от интерфейса Movable.
4. Добавь в интерфейс Flyable метод speed.
5. Метод speed должен возвращать значение типа Double и принимать один параметр типа Flyable.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }
    interface Movable {
        Double speed();
    }
    interface Flyable extends Movable {
        Double speed(Flyable speed);
    }
}
