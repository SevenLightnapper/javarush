package javarush.java_multithreading_3.level1.lecture16.Hippodrome_part3;
/*
package com.javarush.task.task21.task2113;
*/
/*
Ипподром(3)
*/
/*
Несмотря на то что мы объявили переменную horses, сам список еще не создан (если ты конечно не успел опередить нас).
Создай конструктор класса Hippodrome с одним параметром типа List.
Сохрани в поле horses полученный в качестве параметра список (инициализируй поле horses).
Требования:

    •
    В классе Hippodrome должен быть создан конструктор с одним параметром типа List.
    •
    Должна существовать возможность создавать объекты типа Hippodrome извне класса с помощью оператора new.
    •
    Поле horses должно быть корректно инициализировано в конструкторе класса Hippodrome.
    */

import java.util.List;

public class Hippodrome {

    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {

    }
}

