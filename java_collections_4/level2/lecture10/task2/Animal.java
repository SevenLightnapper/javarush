package javarush.java_collections_4.level2.lecture10.task2;
/*
package com.javarush.task.task32.task3208;
*/
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Animal extends Remote {
    void speak() throws RemoteException;

    void printName() throws RemoteException;
}


