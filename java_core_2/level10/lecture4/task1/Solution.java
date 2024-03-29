package javarush.java_core_2.level10.lecture4.task1;
/*
package com.javarush.task.task20.task2006;
*/
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Как сериализовать?
*/
/*
Сделай так, чтобы сериализация класса Human была возможной.
Требования:

    •
    Класс Human должен существовать внутри класса Solution.
    •
    Класс Human должен быть статическим.
    •
    Класс Human должен быть публичным.
    •
    Класс Human должен поддерживать интерфейс Serializable.
    */

public class Solution {
    public static class Human implements Serializable {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }
    }

    public static void main(String[] args) {

    }
}

