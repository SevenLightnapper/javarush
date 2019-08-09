package javarush.java_multithreading_3.level2.lecture18.Snake_part14;
/*
package com.javarush.task.task23.task2312;
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
