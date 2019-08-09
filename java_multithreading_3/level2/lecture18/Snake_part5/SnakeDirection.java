package javarush.java_multithreading_3.level2.lecture18.Snake_part5;
/*
package com.javarush.task.task23.task2312;
*/
/*
Теперь доделаем enum SnakeDirection так, чтобы он содержал возможные направления движения змейки.

Добавь 4 значения UP, DOWN, LEFT, RIGHT.

Должно получиться примерно так:
public enum SnakeDirection
{
 UP,
 RIGHT,
 DOWN,
 LEFT
}
Требования:

    SnakeDirection должен содержать элемент UP.
    SnakeDirection должен содержать элемент DOWN.
    SnakeDirection должен содержать элемент RIGHT.
    SnakeDirection должен содержать элемент LEFT.
    */

public enum SnakeDirection {
    LEFT,
    RIGHT,
    UP,
    DOWN
}
