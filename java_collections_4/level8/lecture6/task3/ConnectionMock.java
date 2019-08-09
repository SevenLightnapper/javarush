package javarush.java_collections_4.level8.lecture6.task3;
/*
package com.javarush.task.task38.task3805;
*/
public class ConnectionMock implements Connection {
    @Override
    public void connect() throws WrongDataException, ConnectionException {
    }

    @Override
    public void write(Object data) throws WrongDataException, ConnectionException {
    }

    @Override
    public Object read() throws WrongDataException, ConnectionException {
        return null;
    }

    @Override
    public void disconnect() throws WrongDataException, ConnectionException {

    }
}

