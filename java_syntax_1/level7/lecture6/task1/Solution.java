package javarush.java_syntax_1.level7.lecture6.task1;
/*
package com.javarush.Task.task07.task0707;
*/
import java.util.ArrayList;

/*
Что за список такой?
*/
/*
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();//напишите тут ваш код
        list.add("Me");
        list.add("We");
        list.add("Us");
        list.add("They");
        list.add("Myself");

        System.out.println(list.size());

        for(int i = 5; i > 0; i--){
            int j = list.size() - i;
            System.out.println(list.get(j));
        }
    }
}

