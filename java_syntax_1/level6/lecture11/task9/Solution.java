package javarush.java_syntax_1.level6.lecture11.task9;
/*
package com.javarush.Task.task06.task0621;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/
/*
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String GranfatherName = reader.readLine();
        String GranmotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sunName = reader.readLine();
        String daughterName = reader.readLine();

        Cat catGranFather = new Cat(GranfatherName);
        Cat catGranMother = new Cat(GranmotherName);
        Cat catFather = new Cat(fatherName, null, catGranFather);
        Cat catMother = new Cat(motherName, catGranMother, null);
        Cat catSun = new Cat(sunName, catMother, catFather);
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGranFather);
        System.out.println(catGranMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSun);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if ((parent1 == null) && (parent2 == null))
                return "The cat's name is " + name + ", no mother, no father";
            else if (parent2 == null)
                return "The cat's name is " + name + ", mother is " + parent1.name + ", no father ";
            else if (parent1 == null)
                return "The cat's name is " + name + ", no mother, father is " + parent2.name;
            else
                return "The cat's name is " + name + ", mother is " + parent1.name + ", father is " + parent2.name;
        }
    }
}
