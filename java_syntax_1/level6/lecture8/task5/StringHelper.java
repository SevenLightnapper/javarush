package javarush.java_syntax_1.level6.lecture8.task5;
/*
package com.javarush.Task.task06.task0611;
*/
/*
Класс StringHelper
*/
/*
Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.

Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

public class StringHelper {
    public static String multiply(String s) {
        return s.concat(s).concat(s).concat(s).concat(s);// вариант для 5 повторов.
    }

    public static String multiply(String s, int count) {
     /*   StringBuilder r = new StringBuilder();
        for (int i = 0; i < count; i++) {
            r.append(s);
        }
        return r.toString();*/
        // вариант для цикла

        return count > 0 ? s + multiply(s, --count) : "";
    }

    public static void main(String[] args) {

    }
}
