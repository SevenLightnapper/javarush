package javarush.java_collections_4.level7.lecture8.task3;
/*
package com.javarush.task.task37.task3710;
*/

import javarush.java_collections_4.level7.lecture8.task3.decorators.RedShapeDecorator;
import javarush.java_collections_4.level7.lecture8.task3.shapes.Circle;
import javarush.java_collections_4.level7.lecture8.task3.shapes.Rectangle;
import javarush.java_collections_4.level7.lecture8.task3.shapes.Shape;

/*
Decorator
*/
public class Solution {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Simple circle");
        circle.draw();

        System.out.println("\nApplied RedShapeDecorator to the circle");
        redCircle.draw();

        System.out.println("\nApplied RedShapeDecorator to the rectangle");
        redRectangle.draw();
    }
}

