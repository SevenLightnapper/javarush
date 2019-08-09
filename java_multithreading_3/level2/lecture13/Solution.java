package javarush.java_multithreading_3.level2.lecture13;

public class Solution {

    public class Fish {

        private void Breathe() {
            System.out.println("Вдох.... Выдох");
        }
    }

    public class Animal extends Fish {

    }

    public class Ape extends Animal {

    }

    public class Human extends Ape {

    }

}