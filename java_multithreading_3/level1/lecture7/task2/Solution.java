package javarush.java_multithreading_3.level1.lecture7.task2;
/*
package com.javarush.task.task21.task2108;
*/
/*
Клонирование растений
*/
/*
Класс Plant не должен реализовывать интерфейс Cloneable
Реализуй механизм глубокого клонирования для Tree.
Требования:

    •
    Класс Plant не должен поддерживать интерфейс Cloneable.
    •
    Класс Tree должен поддерживать интерфейс Cloneable.
    •
    Класс Tree должен быть потомком класса Plant.
    •
    В классе Tree должен быть корректно реализован метод clone.
    */

public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);
    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable {
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }
        protected Tree clone() throws CloneNotSupportedException {
            return (Tree) super.clone();

            /*String[] strings = new String[branches.length];
            for (int i = 0; i < branches.length; i++) {
                strings[i] = branches[i];
            }
            return new Tree(super.getName(), strings);*/
        }
    }
}

