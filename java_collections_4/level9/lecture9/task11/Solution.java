package javarush.java_collections_4.level9.lecture9.task11;
/*
package com.javarush.task.task39.task3907;
*/
/*
ISP
*/
/*
Из-за того что интерфейс Worker содержит слишком много разноплановых методов, классам которые хотят поддерживать только часть функциональности, необходимо реализовывать и те методы, которые им на самом деле не нужны.
Было бы намного удобнее иметь несколько интерфейсов, каждый из которых описывал бы отдельную функциональность.

Создай интерфейсы Sleeper и Eater в пакете workers, подумай как провести корректный рефакторинг и внеси необходимые изменения.
Требования:

    •
    В интерфейсе Sleeper должен быть объявлен только метод sleep.
    •
    В интерфейсе Eater должен быть объявлен только метод eat.
    •
    В интерфейсе Worker должен остаться только метод work.
    •
    Класс NormalWorker должен поддерживать интерфейсы Worker, Sleeper, Eater.
    •
    Класс LazyPerson должен поддерживать только интерфейсы Sleeper, Eater.
    •
    Класс Robot должен поддерживать только интерфейс Worker.
    */

public class Solution {
    public static void main(String[] args) {

    }
}

