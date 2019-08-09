package javarush.java_syntax_1.level7.lecture12.task6;
/*
package com.javarush.Task.task07.task0724;
*/
/*
Семейная перепись
*/
/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Bob", true, 83);
        Human grandfather2 = new Human("Peter", true, 79);
        Human grandmother1 = new Human("Marry", false, 85);
        Human grandmother2 = new Human("Maddison", false, 80);
        Human mother = new Human("Lara", false, 35, grandfather1, grandmother1);
        Human father = new Human("Maks", true, 43, grandfather2, grandmother2);
        Human kid1 = new Human("Tim", true, 3, father, mother);
        Human kid2 = new Human("April", false, 4, father, mother);
        Human kid3 = new Human("Camilla", false, 15, father, mother);
        System.out.println(grandfather1);//напишите тут ваш код
        System.out.println(grandfather2);//напишите тут ваш код
        System.out.println(grandmother1);//напишите тут ваш код
        System.out.println(grandmother2);//напишите тут ваш код
        System.out.println(mother);//напишите тут ваш код
        System.out.println(father);//напишите тут ваш код
        System.out.println(kid1);//напишите тут ваш код
        System.out.println(kid2);//напишите тут ваш код
        System.out.println(kid3);//напишите тут ваш код
    }

    public static class Human {
        String name;//напишите тут ваш код
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}

