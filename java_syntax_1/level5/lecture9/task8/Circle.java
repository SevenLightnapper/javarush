package javarush.java_syntax_1.level5.lecture9.task8;
/*
package com.javarush.Task.task05.task0523;
*/
/*
Конструктор
*/
/*
Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.

Подсказка:
изучи конструктор по умолчанию.
*/
public class Circle {
    public Color color = new Color();

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public void Circle() {
    }

    public class Color {
        String description;

        public String getDescription() { return description; }

        public void setDescription(String description){
            this.description = description;
        }
    }
}