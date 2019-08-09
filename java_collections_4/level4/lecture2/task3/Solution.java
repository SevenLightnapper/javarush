package javarush.java_collections_4.level4.lecture2.task3;
/*
package com.javarush.task.task34.task3403;
*/
/*
Разложение на множители с помощью рекурсии
*/
/*
Разложить целое число n > 1 на простые множители.
Вывести в консоль через пробел все множители в порядке возрастания.
Написать рекурсивный метод для вычисления простых множителей.
Не создавай в классе Solution дополнительные поля.

Пример:
132

Вывод на консоль:
2 2 3 11
Требования:

    •
    В классе Solution не должны быть созданы дополнительные поля.
    •
    Метод recurse должен выводить на экран все простые множители числа полученного в качестве параметра (пример в условии).
    •
    Метод recurse не должен быть статическим.
    •
    Метод recurse должен быть рекурсивным.
    */

public class Solution {

    public static void main(String[] args) {
        recurse(132);
    }

    public static void recurse(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print(a + " ");
                    recurse(n / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
        }
    }
}

