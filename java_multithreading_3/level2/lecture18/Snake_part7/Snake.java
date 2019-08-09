package javarush.java_multithreading_3.level2.lecture18.Snake_part7;
/*
package com.javarush.task.task23.task2312;
*/
/*
"Кусочки змеи" мы описали, теперь займемся самой змеей.

У змеи должен быть список кусочков(SnakeSection) и голова.
Пусть головой будет просто самый первый кусочек (с номером 0).

У змеи также есть направление движения - сторона,
куда она движется по умолчанию.
А еще есть состояние - жива змея или мертва.
Игра заканчивается тогда, когда змея мертва.

Надо:
а) Добавить в класс Snake поле sections типа List<SnakeSection>.
б) Добавить поле isAlive типа boolean.
в) Добавить поле direction типа SnakeDirection.
г) Для всех полей добавить getter'ы, а для direction еще и setter.

Примечание:
Для полей логического типа геттер принято писать не как getValue(),
а как isValue() - это улучшает читабельность кода.
Только не пиши isIsAlive(). Одного is будет вполне достаточно.

Примечание 2:
Все поля создаваемые в этом задании должны быть приватными,
а методы - публичными.
Требования:

    •
    В классе Snake должно быть объявлено поле sections типа List<SnakeSection>.
    •
    В классе Snake должно быть объявлено поле isAlive типа boolean.
    •
    В классе Snake должно быть объявлено поле direction типа SnakeDirection.
    •
    В классе Snake должен быть создан корректный геттер для поля sections.
    •
    В классе Snake должен быть создан корректный геттер для поля isAlive.
    •
    В классе Snake должен быть создан корректный геттер для поля direction.
    •
    В классе Snake должен быть создан корректный сеттер для поля direction.
    •
    Все поля класса Snake должны быть объявлены с модификатором доступа private.
    •
    Все методы класса Snake должны быть объявлены с модификатором доступа public.
    */

import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public boolean isAlive() {
        return isAlive;
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }
}
