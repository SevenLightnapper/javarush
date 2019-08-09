package javarush.java_multithreading_3.level1.lecture16.Hippodrome_part5;
/*
package com.javarush.task.task21.task2113;
*/
/*
Закончим написание класса лошадь (Horse).
Добавь конструктор с параметрами (name, speed, distance).
Добавь getter'ы и setter'ы для всех полей класса Horse.
Делай все методы public, если явно не указано обратное.
Требования:

    •
    В классе Horse должен быть создан конструктор с параметрами String, double и double (name, speed и distance).
    •
    Конструктор класса Horse должен корректно инициализировать поля класса в соответствии с полученными параметрами.
    •
    В классе Horse должны быть созданы getter'ы для всех полей класса.
    •
    В классе Horse должны быть созданы setter'ы для всех полей класса.
    •
    Getter'ы класса Horse должны возвращать значения соответствующих полей класса.
    •
    Setter'ы класса Horse должны устанавливать значения соответствующих полей класса.
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

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}

