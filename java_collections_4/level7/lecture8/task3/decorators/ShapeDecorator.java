package javarush.java_collections_4.level7.lecture8.task3.decorators;
/*
package com.javarush.task.task37.task3710.decorators;
*/

import javarush.java_collections_4.level7.lecture8.task3.shapes.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}

