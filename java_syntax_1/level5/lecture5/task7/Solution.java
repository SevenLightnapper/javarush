package javarush.java_syntax_1.level5.lecture5.task7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
package com.javarush.Task.task05.task0507;
*/
/*
Среднее арифметическое
*/
/*
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Примеры:
а) при вводе чисел
1
2
2
4
5
-1
получим вывод
2.8
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int count1= 0;
        double summ = 0;

        for (; true; ) {
            String txt = r.readLine();

            if (!txt.equals("-1")) {
                int a = Integer.parseInt(txt);
                count1++;
                summ += a;

            } else break;
        }

        System.out.println(summ/count1);//напишите тут ваш код

    }
}