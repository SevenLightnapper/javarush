package javarush.java_multithreading_3.level2.lecture5.task1;
/*
package com.javarush.task.task22.task2202;
*/
/*
Найти подстроку
*/
/*
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.

Пример:
"JavaRush - лучший сервис обучения Java."

Результат:
"- лучший сервис обучения"

Пример:
"Амиго и Диего лучшие друзья!"

Результат:
"и Диего лучшие друзья!"

На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Требования:

    •
    Класс TooShortStringException должен быть потомком класса RuntimeException.
    •
    Метод getPartOfString должен принимать строку в качестве параметра.
    •
    В случае, если в метод getPartOfString были переданы некорректные данные, должно возникнуть исключение TooShortStringException.
    •
    Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова, которое следует после 4-го пробела.
    */

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        try{
            String str[] = string.split(" ");
            String s = "";
            for (int i = 1; i < 5; i++) {
                s = s + str[i] + " ";
            }
            return s.trim();
        }catch (Exception e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}

