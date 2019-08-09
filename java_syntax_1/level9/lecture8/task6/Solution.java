package javarush.java_syntax_1.level9.lecture8.task6;
/*
package com.javarush.Task.task09.task0918;
*/
/*
Все свои, даже исключения
*/
/*
Есть четыре класса MyException, MyException2, MyException3, MyException4.
Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.

Подсказка:
Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
*/

import java.io.FileNotFoundException;
import java.net.SocketException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends FileNotFoundException {
    }

    static class MyException2 extends SocketException {
    }

    static class MyException3 extends ArithmeticException {
    }

    static class MyException4 extends IndexOutOfBoundsException {
    }
}

