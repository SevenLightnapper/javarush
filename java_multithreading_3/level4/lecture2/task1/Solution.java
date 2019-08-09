package javarush.java_multithreading_3.level4.lecture2.task1;
/*
package com.javarush.task.task24.task2402;
*/
/*
Cloneable
*/
/*
Добавьте java-код, чтобы метод main отработал без исключений.
Требования:

    •
    Класс Test4 должен поддерживать интерфейс Cloneable.
    •
    В классе Test4 должен быть реализован метод clone() без параметров.
    •
    В методе main должен быть вызван метод clone на объекте типа Test1.
    •
    В методе main должен быть вызван метод clone на объекте типа Test2.
    •
    В методе main должен быть вызван метод clone на объекте типа Test4.
    •
    В методе main должен быть вызван метод c1one на объекте типа Test3.
    •
    Класс Test1 должен поддерживать интерфейс Cloneable.
    */

public class Solution {

    public static void main(String[] args) throws CloneNotSupportedException {
        Test1 test1 = new Test1();
        test1.clone();

        Test2 test2 = new Test2();
        test2.clone(new Test2());

        Test3 test3 = new Test3();
        test3.clone();

        Test4 test4 = new Test4();
        test4.clone();
    }


    public static class Test1 implements Cloneable {
        protected Test1 clone() throws CloneNotSupportedException {
            return (Test1)super.clone();
        }
    }

    public static class Test2 extends Test1 {
        public Test2 clone(Test2 test2) throws CloneNotSupportedException {
            return (Test2)test2.clone();
        }
    }

    public static class Test3 {
        protected Object clone() throws CloneNotSupportedException {
            return new Test3();
        }
    }

    public static class Test4 extends Test3 {
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}

