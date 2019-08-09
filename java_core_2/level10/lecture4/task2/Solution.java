package javarush.java_core_2.level10.lecture4.task2;
/*
package com.javarush.task.task20.task2007;
*/
import java.util.ArrayList;
import java.util.List;
import java.io.*;

/*
Как сериализовать JavaRush?
*/
/*
Сделай так, чтобы сериализация класса JavaRush была возможной.
Требования:

    •
    Класс JavaRush должен существовать внутри класса Solution.
    •
    Класс JavaRush должен быть статическим.
    •
    Класс JavaRush должен быть публичным.
    •
    Класс JavaRush должен поддерживать интерфейс Serializable.
    */

public class Solution {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) {

    }
}

