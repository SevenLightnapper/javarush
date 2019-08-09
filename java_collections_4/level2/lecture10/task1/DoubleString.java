package javarush.java_collections_4.level2.lecture10.task1;
/*
package com.javarush.task.task32.task3207;
*/
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DoubleString extends Remote {
    String doubleString(String str) throws RemoteException;
}
