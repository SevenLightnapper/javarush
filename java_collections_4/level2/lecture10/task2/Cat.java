package javarush.java_collections_4.level2.lecture10.task2;
/*
package com.javarush.task.task32.task3208;
*/
import java.rmi.RemoteException;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void speak() throws RemoteException {
        System.out.println("meow");
    }

    @Override
    public void printName() throws RemoteException {
        System.out.print("Cat " + name + " ");
    }
}

