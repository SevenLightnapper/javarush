package javarush.java_multithreading_3.level4.lecture2.task2;
/*
package com.javarush.task.task24.task2403;
*/
import java.io.Serializable;
import java.rmi.Remote;
import java.util.ArrayDeque;
import java.util.EventListener;

/*
Так-с... сопоставим
*/
/*
 Исправь ошибки: перемести методы clone в те классы, в которых они должны быть реализованы.
Лишние методы удали.
Не удаляй метод main.
Требования:

    •
    В классе C должен быть реализован метод clone без параметров.
    •
    В классе Solution должен существовать метод main.
    •
    В классе Solution должны существовать 4 вложенных класса.
    •
    В классе Solution должен существовать 1 метод.
    •
    Метод clone в классе C должен возвращать объект типа C.
    */

public class Solution {
    public static class A implements Serializable {
        protected A clone() throws CloneNotSupportedException {
            return (A) super.clone();
        }
    }

    public static class B implements Remote {
        protected final B clone() throws CloneNotSupportedException {
            return (B) super.clone();
        }
    }

    public static class C extends ArrayDeque {
        public C clone() {
            return (C) super.clone();
        }
    }

    public static class D implements EventListener {
        protected D clone() throws CloneNotSupportedException {
            return (D) super.clone();
        }
    }

    public static void main(String[] args) {

    }
}

