package javarush.java_core_2.level3.lecture4.task1;
/*
package com.javarush.Task.task13.task1311;
*/
/*
Нанимаем переводчика
*/
/*
1. Создать класс EnglishTranslator, который наследуется от Translator.
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран "Я переводчик с английского"
   путем вызова метода translate у объекта типа EnglishTranslator.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }


    static class EnglishTranslator extends Translator {
        public String getLanguage(){
            return "английского";
        }

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }

}
