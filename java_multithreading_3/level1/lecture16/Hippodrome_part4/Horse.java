package javarush.java_multithreading_3.level1.lecture16.Hippodrome_part4;
/*
package com.javarush.task.task21.task2113;
*/
/*
Теперь вернемся к лошадям. У каждой лошади на скачках должны быть известны имя (name) и скорость (speed).
Наши лошади будут бежать просто определенное время (100 секунд/"шагов").
Будем определять победителя, как лошадь, пробежавшую наибольшую дистанцию.
Поэтому нам понадобится хранить еще и расстояние (distance), которое лошадь уже пробежала.
Добавь в класс Horse переменные name (String), speed (double), distance (double).
Требования:

    •
    В классе Horse должно быть создано поле name.
    •
    В классе Horse должно быть создано поле speed.
    •
    В классе Horse должно быть создано поле distance.
    •
    Поле name должно быть типа String.
    •
    Поле speed должно быть типа double.
    •
    Поле distance должно быть типа double.
    */

public class Horse {

    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
}
