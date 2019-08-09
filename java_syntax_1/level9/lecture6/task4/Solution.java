package javarush.java_syntax_1.level9.lecture6.task4;
/*
package com.javarush.Task.task09.task0910;
*/
import java.util.ArrayList;

/*
Исключение при работе с коллекциями List
*/
/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {//напишите тут ваш код
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        //напишите тут ваш код
    }
}
