package javarush.java_syntax_1.level8.lecture8.task1;
/*
package com.javarush.Task.task08.task0813;
*/
import java.util.Set;
import java.util.HashSet;

/*
20 слов на букву «Л»
*/
/*
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> list = new HashSet<String>();
        for(int i = 0; i < 20; i++){
            list.add("Л" + i);
        }
        return list;
    }


    public static void main(String[] args) {

    }
}
