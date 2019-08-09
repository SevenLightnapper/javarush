package javarush.java_multithreading_3.level10.lecture2.task2;
/*
package com.javarush.task.task30.task3009;
*/
import java.util.HashSet;
import java.util.Set;

/*
Палиндром?
*/
/*
Объяви и реализуй логику приватного статического метода Set<Integer> getRadix(String number), в котором нужно определить,
в каких системах счисления (от 2 до 36 включительно) представление числа number
(передается в десятичной системе счисления) является палиндромом и добавить индекс таких систем в результат.
Если переданное число некорректно - возвращай пустой HashSet.
В системах счисления с основанием большим 10 в качестве цифр используются латинские буквы. К примеру, числу 35 в десятичной системе соответствует число "Z" в системе с основанием 36.

Метод main не принимает участие в тестировании.

P.S.: В методе getRadix перехватывай NumberFormatException. Стек-трейс выводить не нужно.
Требования:

    •
    Необходимо объявить приватный статический метод Set<Integer> getRadix(String number).
    •
    Метод getRadix в случае некорректных входных данных должен возвращать пустой HashSet.
    •
    Методе getRadix не должен бросать NumberFormatException.
    •
    Метод getRadix не должен ничего выводить в консоль.
    •
    Метод getRadix должен возвращать множество согласно условию задачи.
    */

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        //expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        //expected output: [6]
        System.out.println(getRadix("5321"));       //expected output: []
        System.out.println(getRadix("1A"));         //expected output: []
    }

    private static Set<Integer> getRadix(String number) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 2; i < 37; i++) {
            try {
                String stringNumber = Integer.toString(Integer.parseInt(number), i);
                if (stringNumber.equals(new StringBuilder(stringNumber).reverse().toString())) {
                    hashSet.add(i);
                }
            }
            catch (NumberFormatException e) { }
        }
        return hashSet;
    }
}
