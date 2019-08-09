package javarush.java_multithreading_3.level2.lecture18.Snake_part16;
/*
package com.javarush.task.task23.task2312;
*/
/**
 * Класс змея
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
    public  void move(int x, int y){

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
