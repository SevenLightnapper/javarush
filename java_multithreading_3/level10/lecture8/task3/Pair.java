package javarush.java_multithreading_3.level10.lecture8.task3;
/*
package com.javarush.task.task30.task3006;
*/
/*
В классе Pair реализуй метод swap, который должен для x, y менять местами их значения.
Можно использовать только операции:
1) Исключающее или.
2) Присваивание.
3) Исключающее или с присваиванием.
Не оставляй комментарии, не меняй остальной код.
Требования:

    •
    В классе Pair должен присутствовать метод swap().
    •
    В классе Pair в методе swap() используй только разрешенные операции.
    •
    Вызов метода swap() должен поменять значения полей x и y.
    •
    Не изменяй никакой код, кроме метода swap().
    */

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
    }
}

