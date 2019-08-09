package javarush.java_syntax_1.level5.lecture12.task5;
/*
package com.javarush.Task.task05.task0529;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Консоль-копилка
*/
/*
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summ = 0;
        for ( ; true; ) {
            String txt = reader.readLine();
            if (!txt.equals("сумма")) {
                int a = Integer.parseInt(txt);
                summ += a;
            } else break;
        }
        System.out.println(summ);
    }
}
