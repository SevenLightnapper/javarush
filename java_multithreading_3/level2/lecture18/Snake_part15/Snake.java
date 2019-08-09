package javarush.java_multithreading_3.level2.lecture18.Snake_part15;
/*
package com.javarush.task.task23.task2312;
*/
/*
Теперь осталось допилить змею.

Вот что я предлагаю насчет движения змеи:
Змея состоит из кусочков. Давай каждый ход просто добавлять один кусочек со стороны головы,
а самый последний - удалять. Тогда получится, что змея ползет.

Давай добавим два метода move, один без параметров, а другой с двумя параметрами типа int.

В методе move без параметров необходимо:
а) прекратить движение если змея умерла(isAlive == false)
б) вызвать метод move(0, -1) если направление движения равно SnakeDirection.UP
в) вызвать метод move(1, 0) если направление движения равно SnakeDirection.RIGHT
г) вызвать метод move(0, 1) если направление движения равно SnakeDirection.DOWN
д) вызвать метод move(-1, 0) если направление движения равно SnakeDirection.LEFT

Метод move с параметрами int, int пока оставим пустым.
Требования:

    •
    В методе move без параметров должен быть вызван метод move(0, -1),
    если направление движения равно SnakeDirection.UP.
    •
    В методе move без параметров должен быть вызван метод move(1, 0),
    если направление движения равно SnakeDirection.RIGHT.
    •
    В методе move без параметров должен быть вызван метод move(0, 1),
    если направление движения равно SnakeDirection.DOWN.
    •
    В методе move без параметров должен быть вызван метод move(-1, 0),
    если направление движения равно SnakeDirection.LEFT.
    •
    Метод move с параметрами (int, int) не должен быть вызван,
    если змея умерла (isAlive == false).
    •
    В классе Snake должен быть создан метод move без параметров.
    •
    В классе Snake должен быть создан НЕ приватный метод move с параметрами int, int.
    */

import java.util.*;
/**
 * Класс змея
 */

public class Snake
{
    //Направление движения змеи
    private SnakeDirection direction;
    //Состояние - жива змея или нет.
    private boolean isAlive;
    //Список кусочков змеи.
    private ArrayList<SnakeSection> sections = new ArrayList<SnakeSection>();

    public Snake(int x, int y)
    {
        sections = new ArrayList<SnakeSection>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;
    }

    public boolean isAlive()
    {
        return isAlive;
    }

    public int getX()
    {
        return sections.get(0).getX();
    }

    public int getY()
    {
        return sections.get(0).getY();
    }

    public SnakeDirection getDirection()
    {
        return direction;
    }

    public void setDirection(SnakeDirection direction)
    {
        this.direction = direction;
    }

    public ArrayList<SnakeSection> getSections()
    {
        return sections;
    }

    public void move() {
        if (isAlive()) {
            if (direction == SnakeDirection.DOWN) {
                move(0, 1);
            }
            if (direction == SnakeDirection.UP) {
                move(0, -1);
            }
            if (direction == SnakeDirection.RIGHT) {
                move(1, 0);
            }
            if (direction == SnakeDirection.LEFT) {
                move(-1, 0);
            }
        }
    }

    public void move(int x, int y) {

    }

    /**
     *  Метод проверяет - находится ли новая голова в пределах комнаты
     */
    private void checkBorders(SnakeSection head)
    {
        if ((head.getX() < 0 || head.getX() >= Room.game.getWidth()) || head.getY() < 0 || head.getY() >= Room.game.getHeight())
        {
            isAlive = false;
        }
    }

    /**
     *  Метод проверяет - не совпадает ли голова с каким-нибудь участком тела змеи.
     */
    private void checkBody(SnakeSection head)
    {
        if (sections.contains(head))
        {
            isAlive = false;
        }
    }
}
