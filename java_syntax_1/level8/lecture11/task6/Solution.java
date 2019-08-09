package javarush.java_syntax_1.level8.lecture11.task6;

import java.util.ArrayList;
import java.util.Collections;
/*
package com.javarush.Task.task08.task0824;
*/

/*
Собираем семейство
*/
/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/

public class Solution {
    public static void main(String[] args) {
        Human kid1 = new Human("Alice", false, 3);
        Human kid2 = new Human("Julian", true, 10);
        Human kid3 = new Human("Wendy", false, 5);//напишите тут ваш код
        Human mother = new Human("Rissa", false, 31, kid1, kid2, kid3);
        Human father = new Human("Robert", true, 37, kid1, kid2, kid3);
        Human grandfather1 = new Human("Samuel", true, 76, father);
        Human grandfather2 = new Human("Rodrigo", true, 69, mother);
        Human grandmother1 = new Human("Stella", false, 79, father);
        Human grandmother2 = new Human("Marin", false, 73, mother);
        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
    }

    public static class Human {
        String name;//напишите тут ваш код
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, Human ... human){
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, human);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
