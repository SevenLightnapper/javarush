package javarush.java_syntax_1.level8.lecture3.task1;
/*
package com.javarush.Task.task08.task0801;
*/
/*
HashSet из растений
*/
/*
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<String>();//напишите тут ваш код
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for(String text : set){
            System.out.println(text);
        }
    }
}

