package javarush.java_multithreading_3.level2.lecture18.Snake_part18;

/*
package com.javarush.task.task23.task2312;
*/
/**
 * Класс змея
 */
 /*
 Теперь закончим класс Snake.

Змея состоит из кусочков. Давай каждый ход просто добавлять один кусочек со стороны головы,
а самый последний - удалять. Тогда получится, что змея ползет.
Добавлять кусочек нужно рядом с текущей головой (кусочком номер 0).
С какой стороны добавлять зависит от direction (UP, DOWN, LEFT, RIGHT).

Подсказка:
а) Как добавить кусочек змеи в начало списка sections?
sections.add(0, new_section);
б) А как удалить последний?
sections.remove(sections.size()-1);

Необходимо реализовать метод move(int dx, int dy):
а) проверить, не вылезла ли она за границу комнаты (если да, то змея умирает)
б) проверить, не совпадает ли она с уже существующими кусочками змеи (если да, то змея умирает)
в) добавить голову к змее (со стороны головы) и удалить последний кусочек из хвоста.
г) вызвать метод eatMouse у статического объекта game класса Room, если координаты мыши совпадают с координатами головы змеи.
д) если змея поймала мышь (координаты головы совпадают с координатами мыши), то удалять кусок из хвоста не надо.
Требования:

    •
    В методе move(int dx, int dy) должен быть вызван метод checkBorders.
    •
    В методе move(int dx, int dy) должен быть вызван метод checkBody.
    •
    В случае если змея осталась жива, необходимо добавить голову и удалить последний элемент из хвоста змеи.
    •
    В случае, если змея поймала мышь, необходимо добавить голову, но последний элемент удалять не нужно.
    •
    Необходимо вызвать метод eatMouse у статического объекта game класса Room, если координаты мыши совпадают с координатами головы змеи.
    */

import java.util.*;
import java.util.List;


public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public Snake(int x, int y) {
        sections = new ArrayList<>();
        SnakeSection snakeSection = new SnakeSection(x,y);
        sections.add(snakeSection);
        isAlive = true;
    }

    public int getX(){
        return  sections.get(0).getX();
    }
    public int getY(){
        return  sections.get(0).getY();
    }
    public void move(){
        if (isAlive) {
            switch (direction) {
                case  UP: move(0, -1);
                    break;
                case RIGHT: move(1, 0);
                    break;
                case DOWN: move(0, 1);
                    break;
                case LEFT: move(-1, 0);
                    break;
            }

        }
    }
    public void move(int dx, int dy) {
        SnakeSection head = new SnakeSection(sections.get(0).getX() + dx, sections.get(0).getY() + dy);    //создаём новую секцию head
        checkBody(head);    //проверяем, не втыкается ли она в себя
        checkBorders(head);    //проверяем, не втыкается ли она в борт
        sections.add(0, head);
        if (head.getY() == Room.game.getMouse().getY()
                && head.getX() == Room.game.getMouse().getX()) {
            Room.game.eatMouse();
        } else
            sections.remove(sections.size()-1);
    }

    public void checkBorders(SnakeSection head) {
        if ((head.getX()>=Room.game.getWidth())
                ||(head.getY()>=Room.game.getHeight())
                ||(head.getX()<0)
                ||(head.getY()<0)){
            isAlive=false;
        }
    }

    public void checkBody(SnakeSection head){
        if (sections.contains(head)){
            isAlive=false;
        }
    }

}

