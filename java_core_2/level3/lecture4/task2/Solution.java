package javarush.java_core_2.level3.lecture4.task2;
/*
package com.javarush.Task.task13.task1312;
*/
/*
Код сам не исправится
*/
/*
Исправить код так, чтобы программа выполнялась и выводила "Я переводчик с английского".
Метод main менять нельзя!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }


}
