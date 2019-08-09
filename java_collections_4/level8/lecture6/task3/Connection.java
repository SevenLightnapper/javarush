package javarush.java_collections_4.level8.lecture6.task3;
/*
package com.javarush.task.task38.task3805;
*/
public interface Connection {
    void connect() throws WrongDataException, ConnectionException;
    void write(Object data) throws WrongDataException, ConnectionException;
    Object read() throws WrongDataException, ConnectionException;
    void disconnect() throws WrongDataException, ConnectionException;
}

