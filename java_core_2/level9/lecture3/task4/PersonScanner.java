package javarush.java_core_2.level9.lecture3.task4;
/*
package com.javarush.task.task19.task1904;
*/
import java.io.IOException;

public interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}

