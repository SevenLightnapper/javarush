package javarush.java_syntax_1.level10.lecture11.task4;
/*
package com.javarush.Task.task10.task1011;
*/
/*
Большая зарплата
*/
/*
Вывести на экран надпись "Я не хочу изучать Java, я хочу большую зарплату" 40 раз по образцу.

Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
...
зарплату
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        for(int i = 0; i < 40; i++) {
            System.out.println(s.substring(i, 47));
        }


        //напишите тут ваш код
    }

}


