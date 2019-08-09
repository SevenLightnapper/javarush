package javarush.java_syntax_1.level6.lecture5.task3;
/*
package com.javarush.Task.task06.task0603;
*/
/*
По 50 000 объектов Cat и Dog
*/
/*
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
*/

public class Solution {
    public static void main(String[] args)  {
        for (int i = 1; i <= 50000; i++){
            Cat cat = new Cat();
            Dog dog = new Dog();//напишите тут ваш код
            try {
                cat.finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            try {
                dog.finalize();
            } catch (Throwable throwable){
                throwable.printStackTrace();
            }
        }

    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}

