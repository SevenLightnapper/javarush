package javarush.java_core_2.level10.lecture10.task3;
/*
package com.javarush.task.task20.task2018;
*/
/*
Найти ошибки
*/
/*
Почему-то при сериализации/десериализации объекта класса B возникают ошибки.

Найди проблему и исправь ее.

Класс A не должен реализовывать интерфейсы Serializable и Externalizable.

В сигнатуре класса В ошибки нет :).

В методе main ошибок нет.
Требования:

    •
    Класс B должен быть потомком класса A.
    •
    Класс B должен поддерживать интерфейс Serializable.
    •
    Класс A не должен поддерживать интерфейс Serializable.
    •
    Класс A не должен поддерживать интерфейс Externalizable.
    •
    Программа должна выполняться без ошибок.
    •
    При десериализации должны корректно восстанавливаться значение полей nameA и nameB.
    */
import java.io.*;


public class Solution implements Serializable {
    public static class A {

        protected String nameA = "A";

        public A() {}

        public A(String nameA) {
            this.nameA += nameA;
        }
    }

    public class B extends A implements Serializable {

        private String nameB;

        public B(String nameA, String nameB) {
            super(nameA);
            this.nameA = nameA;
            this.nameB = nameB;
        }

        private void writeObject(ObjectOutputStream oos) throws IOException {
            oos.defaultWriteObject();
            oos.writeObject(nameB);
            oos.writeObject(nameA);
        }

        private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
            ois.defaultReadObject();
            nameB = (String) ois.readObject();
            nameA = (String) ois.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        Solution solution = new Solution();
        B b = solution.new B("B2", "C33");
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        oos.writeObject(b);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        B b1 = (B)ois.readObject();
        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
    }
}

