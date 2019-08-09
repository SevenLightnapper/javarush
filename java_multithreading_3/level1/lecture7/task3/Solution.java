package javarush.java_multithreading_3.level1.lecture7.task3;
/*
package com.javarush.task.task21.task2109;
*/
/*
Запретить клонирование
*/
/*
Разреши клонировать класс А
Запрети клонировать класс B
Разреши клонировать класс C
Не забудь о методах equals и hashCode!
Требования:

    •
    Класс A должен поддерживать интерфейс Cloneable.
    •
    Класс B должен быть потомком класса A.
    •
    При объявлении класса B не должно быть явно указано implements Cloneable.
    •
    Метод clone в классе B должен быть переопределен таким образом, чтобы при попытке клонирования объекта класса B возникало исключение CloneNotSupportedException.
    •
    Класс C должен быть потомком класса B.
    •
    Клонирование объектов класса C должно завершаться успешно.
    */

import java.util.Objects;

public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        @Override
        protected A clone() throws CloneNotSupportedException {
            A a = (A) super.clone();
            return a;
        }

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a = (A) o;
            return i == a.i &&
                    j == a.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        protected  B clone() throws CloneNotSupportedException {
            B b = (B) super.clone();
            throw new CloneNotSupportedException();

        }
    }

    public static class C extends B implements Cloneable {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            C c = (C) o;
            if (c.getI() != ((C) o).getI()) return false;
            if (c.getJ() != ((C) o).getJ()) return false;
            if ((c.getName() != null ? !((C) o).getName().equals(getName()) : ((C) o).getName()) == null) return false;
            return false;
        }


        @Override
        public int hashCode() {
            int result;
            result = this.getI() + this.getJ();
            result = result * 31 +(this.getName() != null ? this.getName().hashCode() : 0);
            return result;
        }

        @Override
        protected C clone() throws CloneNotSupportedException {
            return new C(getI(), getJ(), getName());
        }
    }

    public static void main(String[] args) {

    }
}

