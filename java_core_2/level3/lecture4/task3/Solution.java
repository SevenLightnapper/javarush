package javarush.java_core_2.level3.lecture4.task3;
/*
package com.javarush.Task.task13.task1313;
*/
import java.awt.*;

/*
Лисица — это такое животное
*/
/*
1. Реализуй в классе Fox интерфейс Animal.
2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
3. Создавать дополнительные классы и удалять методы нельзя!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {

            return "Fox";
        }

    }
}
