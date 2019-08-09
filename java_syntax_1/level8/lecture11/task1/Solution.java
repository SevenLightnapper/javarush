package javarush.java_syntax_1.level8.lecture11.task1;
/*
package com.javarush.Task.task08.task0819;
*/
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/*
Set из котов
*/
/*
1. Внутри класса Solution создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        cats.remove(cats.toArray()[0]);//напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();//напишите тут ваш код. step 2 - пункт 2
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        IntStream.range(0, cats.size()).mapToObj(i -> cats).forEach(System.out::println);
    }

    public static class Cat{
        public Cat(){

        }
    }// step 1 - пункт 1
}

