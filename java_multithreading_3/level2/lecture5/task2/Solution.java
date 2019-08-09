package javarush.java_multithreading_3.level2.lecture5.task2;
/*
package com.javarush.task.task22.task2203;
*/
/*
Между табуляциями
*/
/*
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
Требования:

    •
    Класс TooShortStringException должен быть потомком класса Exception.
    •
    Метод getPartOfString должен принимать строку в качестве параметра.
    •
    В случае, если строка, переданная в метод getPartOfString содержит менее 2 табуляций должно возникнуть исключение TooShortStringException.
    •
    Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
    */

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        try {
            String s[] = string.split("\t");
            if (s.length < 3) { throw new TooShortStringException(); }
            String str = s[1];
            return str;
        } catch (Exception e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}

