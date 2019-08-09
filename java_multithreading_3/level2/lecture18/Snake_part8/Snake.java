package javarush.java_multithreading_3.level2.lecture18.Snake_part8;
/*
package com.javarush.task.task23.task2312;
*/
/*
Настала очередь конструктора класса Snake.

Змея у нас будет поначалу состоять из одного кусочка - головы.
А что для него требуется?
Что необходимо передать в конструктор?
Координаты змеи, конечно же.

Надо:
а) Передать в конструктор координаты головы змеи (x и y).
б) создать в нем первый "кусочек змеи" (голову) и добавить его в коллекцию sections (ArrayList).
в) isAlive выставить в true.
г) не забудь в конструкторе инициализировать переменную sections. В null не много-то и добавишь!
д) создать и реализовать метод int getX(). Метод должен вернуть координату Х головы змеи.
е) создать и реализовать метод int getY(). Метод должен вернуть координату Y головы змеи.
ж) еще добавить классу метод move()- он нам пригодится попозже.
з) созданный конструктор должен быть публичным.
Требования:

    •
    В классе Snake должен быть создан корректно работающий public конструктор (согласно условию задачи) с двумя параметрами типа int.
    •
    В классе Snake должен быть создан метод getX() без параметров, возвращающий координату x нулевого элемента списка sections.
    •
    В классе Snake должен быть создан метод getY() без параметров, возвращающий координату y нулевого элемента списка sections.
    •
    В классе Snake должен быть создан метод move.
    */
import java.util.*;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake (int x, int y) {
        sections = new ArrayList<SnakeSection>();
        SnakeSection section1 = new SnakeSection(x, y);
        sections.add(section1);
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

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

    public void move() {

    }
}
