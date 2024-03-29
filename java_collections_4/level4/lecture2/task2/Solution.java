package javarush.java_collections_4.level4.lecture2.task2;
/*
package com.javarush.task.task34.task3402;
*/
/*
Факториал с помощью рекурсии
*/
/*
Почитай про вычисление факториала.
Реализуй рекурсивную логику метода factorial, где n - это число, факториал которого нужно вычислить.
Не создавай в классе Solution дополнительные поля.
Требования:

    •
    В классе Solution не должны быть созданы дополнительные поля.
    •
    Метод factorial должен возвращать факториал числа принятого в качестве параметра.
    •
    Метод factorial не должен быть статическим.
    •
    Метод factorial должен быть рекурсивным.
    */

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.factorial(9));     //362880
        System.out.println(solution.factorial(0));     //1
        System.out.println(solution.factorial(1));     //1
    }

    public int factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }
}

