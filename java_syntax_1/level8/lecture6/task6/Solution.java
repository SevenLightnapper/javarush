package javarush.java_syntax_1.level8.lecture6.task6;
/*
package com.javarush.Task.task08.task0812;
*/
import java.io.*;
import java.util.ArrayList;

/*
Cамая длинная последовательность
*/
/*
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3,
т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();//напишите тут ваш код
        for (int i = 0; i < 10; i++){
            int k = Integer.parseInt(reader.readLine());
            list.add(k);
        }
        int a = 1;
        int b = 1;
        for (int i = 0; i < list.size() - 1; i++){
            if(list.get(i).equals(list.get(i+1))){
                a++;
                if(b < a)
                    b = a;
            }
            else
                a = 1;
        }
        System.out.println(b);
    }
}
