package javarush.java_multithreading_3.level1.lecture16.Hippodrome_part2;
/*
package com.javarush.task.task21.task2113;
*/
/*
Ипподром(2)
*/
/*
Раз это ипподром, то на нем должны быть лошади.
Значит наш ипподром должен хранить список всех его лошадей.
Добавь поле horses типа List<Horse> в класс Hippodrome.
А чтобы лошадей не украли - сделай это поле приватным.
Добавь getter для этого поля.
Требования:

    •
    В классе Hippodrome должен быть создан список лошадей(horses).
    •
    В классе Hippodrome должен быть создан метод getHorses возвращающий список horses.
    •
    Метод getHorses должен быть объявлен с модификатором доступа public.
    •
    Поле horses должно быть объявлено с модификатором доступа private.
    */

import java.util.List;

public class Hippodrome {

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {

    }
}
