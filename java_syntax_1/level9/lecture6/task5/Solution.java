package javarush.java_syntax_1.level9.lecture6.task5;
/*
package com.javarush.Task.task09.task0911;
*/
import java.util.HashMap;

/*
Исключение при работе с коллекциями Map
*/
/*
 Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);
*/

public class Solution {
    public static void main(String[] args) throws  Exception {
        try { //напишите тут ваш код
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch (NullPointerException e) { //напишите тут ваш код
            System.out.println(e);
        }
    }
}

