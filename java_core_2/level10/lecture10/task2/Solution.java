package javarush.java_core_2.level10.lecture10.task2;
/*
package com.javarush.task.task20.task2017;
*/
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/*
Десериализация
*/
/*
На вход подается поток, в который записан сериализованный объект класса A либо класса B.
Десериализуй объект в методе getOriginalObject так, чтобы в случае возникновения исключения было выведено сообщение на экран и возвращен null.
Реализуй интерфейс Serializable где необходимо.
Требования:

    •
    Класс B должен быть потомком класса A.
    •
    Класс A должен поддерживать интерфейс Serializable.
    •
    Класс B не должен явно поддерживать интерфейс Serializable.
    •
    Метод getOriginalObject должен возвращать объект типа A полученный из потока ObjectInputStream.
    •
    Метод getOriginalObject должен возвращать null, если при попытке десериализации не был получен объект типа A.
    •
    Метод getOriginalObject должен возвращать null, если при попытке десериализации возникло исключение.
    */

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) throws IOException {
        try { A a = (A) objectStream.readObject();
        return a;
        } catch (Exception e) {
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}

