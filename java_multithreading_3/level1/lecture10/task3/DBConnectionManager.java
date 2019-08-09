package javarush.java_multithreading_3.level1.lecture10.task3;
/*
package com.javarush.task.task21.task2112;
*/

public class DBConnectionManager {
    public FakeConnection getFakeConnection() {
        return new FakeConnection();
    }
}

