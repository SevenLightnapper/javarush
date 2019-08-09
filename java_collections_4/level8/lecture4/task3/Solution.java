package javarush.java_collections_4.level8.lecture4.task3;
/*
package com.javarush.task.task38.task3801;
*/
/*
Исправь ошибки в коде
*/

public class Solution {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                System.out.println("Имя содержит " + NameChecker.getNumberOfCharacters(args[0]) + " символов");
            } catch (NameIsEmptyException e) {
                System.out.println("Ошибка: Имя пустое");
            } catch (NameIsNullException e) {
                System.out.println("Ошибка: Имя не задано");
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
