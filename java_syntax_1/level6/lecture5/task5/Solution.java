package javarush.java_syntax_1.level6.lecture5.task5;
/*
package com.javarush.Task.task06.task0606;
*/
import java.io.*;

/*
Чётные и нечётные циферки
*/
/*
Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int len = number.length();
        int num = Integer.parseInt(number);
        for(int i = 0; i < len; i++) {
            if (num % 2 == 0)
                Solution.even++;
            else if (num % 2 != 0)
                Solution.odd++;
            num = num / 10;

        }
        System.out.println("Even: " + Solution.even +" Odd: " + Solution.odd);

    }

}
