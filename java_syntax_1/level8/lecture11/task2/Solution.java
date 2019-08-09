package javarush.java_syntax_1.level8.lecture11.task2;
/*
package com.javarush.Task.task08.task0820;
*/
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/*
Множество всех животных
*/
/*
1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<Cat>();
        for(int i = 0; i < 4; i++) {
            cats.add(new Cat());//напишите тут ваш код
        }
        return cats;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet<Dog>();//напишите тут ваш код
        for(int i = 0; i < 3; i++){
            dogs.add(new Dog());
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<Object>();//напишите тут ваш код
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        for(int i = 0; i < pets.size(); i++){
            for(int k = 0; k < cats.size(); k++){
                if(pets.toArray()[i] == cats.toArray()[k]){
                    pets.remove(pets.toArray()[i]);
                }
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        IntStream.range(0, pets.size()).mapToObj(i -> pets).forEach(System.out::println);//напишите тут ваш код
    }

    public static class Cat{public Cat(){}}//напишите тут ваш код
    public static class Dog{public Dog(){}}

}

