package javarush.java_syntax_1.level8.lecture8.task2;
/*
package com.javarush.Task.task08.task0814;
*/
import java.util.HashSet;

/*
Больше 10? Вы нам не подходите
*/
/*
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> list = new HashSet<Integer>();//напишите тут ваш код
        for(int i = 0; i < 20; i++) {
            list.add(i);
        }
        return list;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        set.removeIf(x -> x > 10);
        return set;

    }

    public static void main(String[] args) {
        //System.out.println(removeAllNumbersMoreThan10(createSet())); <- doesn't exist in the Task. I added it in order to check if the program is working.
    }
}

