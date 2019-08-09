package javarush.java_multithreading_3.level1.lecture16.Hippodrome_part6;
/*
package com.javarush.task.task21.task2113;
*/
/*
Ипподром(6)
*/
/*
Теперь перейдем к классу Hippodrome и методу main.
Нам нужно создать объект типа Hippodrome и добавить ему несколько лошадей.

Для начала, в классе Hippodrome:
Создай статическое поле game типа Hippodrome.

В методе main требуется:
а) Создать объект типа Hippodrome и сохранить его в поле game.
б) Создать три объекта "лошадь". Имена придумай сам. Начальные скорость у всех лошадей - 3, дистанция - 0.
в) Добавить созданных лошадей в список лошадей ипподрома (horses). Получить список лошадей ипподрома можно с помощью метода getHorses.
Требования:

    •
    В классе Hippodrome должно быть создано поле game типа Hippodrome.
    •
    Поле game должно быть статическим.
    •
    Поле game НЕ должно быть приватным.
    •
    В методе main должно инициализироваться поле game.
    •
    В методе main в список лошадей ипподрома должны быть добавлены три лошади.
    •
    Скорости всех лошадей должны быть равны 3, а дистанции - 0.
    */

import java.util.*;

public class Hippodrome {
    public static Hippodrome game;
    private static List<Horse> horses = new ArrayList<>();

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome(horses);

        Horse horse1 = new Horse("Light", 3, 0);
        Horse horse2 = new Horse("Red", 3, 0);
        Horse horse3 = new Horse("Madelin", 3, 0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
    }
}
