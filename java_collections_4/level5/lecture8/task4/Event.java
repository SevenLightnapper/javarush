package javarush.java_collections_4.level5.lecture8.task4;
/*
package com.javarush.task.task35.task3512;
*/
public class Event {

    private static int nextId = 1;

    private int id;

    public Event() {
        id = nextId++;
    }

    public int getId() {
        return id;
    }
}

