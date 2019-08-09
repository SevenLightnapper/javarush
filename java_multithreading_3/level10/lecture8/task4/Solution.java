package javarush.java_multithreading_3.level10.lecture8.task4;
/*
package com.javarush.task.task30.task3012;
*/
/*
Получи заданное число
*/
/*
Реализуй метод createExpression(int number).
Метод createExpression вызывается с одним параметром number. Этот параметр - число от 1 до 3000 включительно.
Нужно вывести арифметическое выражение, результатом которого является число number.
Можно использовать числа: 1, 3, 9, 27, 81, 243, 729, 2187 не более, чем по одному разу.
Можно использовать знаки: "+" и "-" любое количество раз.
Обрати внимание, что перед каждым числом в искомой строке обязательно должен быть знак плюс или минус.
Перед выражением выведи [переданное число] =. (Смотри примеры вывода ниже).

Пример1:
Переданное число:
74
Ожидаемый вывод:
74 = - 1 + 3 - 9 + 81

Пример2:
Переданное число:
1234
Ожидаемый вывод:
1234 = + 1 - 9 + 27 - 243 - 729 + 2187

При выводе выражения используй числа ТОЛЬКО В ВОЗРАСТАЮЩЕМ порядке!
Переданное число:
2
Ожидаемый вывод:
2 = - 1 + 3 //правильно
Ожидаемый вывод:
2 = + 3 - 1 //НЕ правильно
Метод main не участвует в тестировании.

Подсказка:
Почитай в интернете про троичную симметричную систему счисления.
Требования:

    •
    В начале строчки вывода должно быть расположено число, которое передано в метод createExpression в качестве параметра и знак "=".
    •
    В выражении можно использовать только числа: 1, 3, 9, 27, 81, 243, 729, 2187 не более, чем по одному разу.
    •
    В выражении можно использовать только знаки "+" и "-" любое количество раз.
    •
    Метод createExpression должен быть реализован согласно условию.
    */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    StringBuilder s = new StringBuilder();
    List<Integer> list = new ArrayList<>();
    static List<Integer> integers = new ArrayList<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.createExpression(14);
    }
    public void createExpression(int number) {
        integers.add(1);
        integers.add(3);
        integers.add(9);
        integers.add(27);
        integers.add(81);
        integers.add(243);
        integers.add(729);
        integers.add(2187);
        list.add(number);
        int i = number / 3;
        int io = number % 3;
        s.append(io);
        if (io == 2) i++;
        if (i >= 3) {
            createExpression(i);
        } else {
            s.append(i);
            s = s.reverse();
            List<Character> chars = new ArrayList();
            char[] c = s.toString().toCharArray();
            int i2 = 0;
            if (c[0] == '2') {
                chars.add('+');
                chars.add('-');
                i2 = 1;
            }
            for (int i1 = i2; i1 < c.length; i1++) {
                if (c[i1] == '0') {
                    chars.add('0');
                } else if (c[i1] == '1') {
                    chars.add('+');
                } else if (c[i1] == '2') {
                    chars.add('-');
                }
            }
            int g = list.get(0);
            StringBuilder str = new StringBuilder();
            str.append(g).append(" ").append("=");
            for (int j = chars.size()-1; j >= 0; j--) {
                if (chars.get(j) == '0') continue;
                str.append(" ").append(chars.get(j)).append(" ").append(integers.get(chars.size()-1 -j));
            }
            System.out.println(str);
        }
        //напишите тут ваш код
    }
}