package javarush.java_collections_4.level7.lecture8.task2.connectors;
/*
package com.javarush.task.task37.task3709.connectors;
*/

public class SimpleConnector implements Connector {
    private String resourceString;

    public SimpleConnector(String resourceString) {
        this.resourceString = resourceString;
    }

    @Override
    public void connect() {
        System.out.println("Successfully connected to " + resourceString);
    }
}

