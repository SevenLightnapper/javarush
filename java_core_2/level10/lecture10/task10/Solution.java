package javarush.java_core_2.level10.lecture10.task10;
/*
package com.javarush.task.task20.task2025;
*/
/*
Алгоритмы-числа
*/
/*
Число S состоит из M цифр, например, S=370 и M (количество цифр) = 3
Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
находить все числа, удовлетворяющие следующему критерию:
число S равно сумме его цифр, возведенных в M степень
getNumbers должен возвращать все такие числа в порядке возрастания.

Пример искомого числа:
370 = 3*3*3 + 7*7*7 + 0*0*0
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8

На выполнение дается 10 секунд и 50 МБ памяти.
Требования:

    •
    В классе Solution должен присутствовать метод getNumbers c одним параметром типа long.
    •
    Метод getNumbers должен быть публичным.
    •
    Метод getNumbers должен быть статическим.
    •
    Метод getNumbers должен возвращать массив чисел удовлетворяющих условию задачи.
    */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static long[] getNumbers(long N) {
        List<Long> list = generate(19);
        long[] result = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= N) {
                result = new long[i];
                break;
            }
        }
        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                if (list.get(i) < N) {
                    result[i] = list.get(i);
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    private static int N;
    private static int[] digitsMultiSet;
    private static int[] testMultiSet;

    private static List<Long> results;
    private static long maxPow;
    private static long minPow;

    private static long[][] pows;

    private static void genPows(int N) {
        if (N > 20) throw new IllegalArgumentException();
        pows = new long[10][N + 1];
        for (int i = 0; i < pows.length; i++) {
            long p = 1;
            for (int j = 0; j < pows[i].length; j++) {
                pows[i][j] = p;
                p *= i;
            }
        }
    }

    private static boolean check(long pow) {
        if (pow >= maxPow) return false;
        if (pow < minPow) return false;

        for (int i = 0; i < 10; i++) {
            testMultiSet[i] = 0;
        }

        while (pow > 0) {
            int i = (int) (pow % 10);
            testMultiSet[i]++;
            if (testMultiSet[i] > digitsMultiSet[i]) return false;
            pow = pow / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (testMultiSet[i] != digitsMultiSet[i]) return false;
        }
        return true;
    }

    private static void search(int digit, int unused, long pow) {
        if (pow >= maxPow) return;

        if (digit == -1) {
            if (check(pow)) results.add(pow);
            return;
        }

        if (digit == 0) {
            digitsMultiSet[digit] = unused;
            search(digit - 1, 0, pow + unused * pows[digit][N]);
        } else {
            // Check if we can generate more than minimum
            if (pow + unused * pows[digit][N] < minPow) return;

            long p = pow;
            for (int i = 0; i <= unused; i++) {
                digitsMultiSet[digit] = i;
                search(digit - 1, unused - i, p);
                if (i != unused) {
                    p += pows[digit][N];
                    // Check maximum and break the loop - doesn't help
                    // if (p >= maxPow) break;
                }
            }
        }
    }

    public static List<Long> generate(int maxN) {
        if (maxN >= 20) throw new IllegalArgumentException();

        genPows(maxN);
        results = new ArrayList<>();
        digitsMultiSet = new int[10];
        testMultiSet = new int[10];

        for (N = 1; N <= maxN; N++) {
            minPow = (long) Math.pow(10, N - 1);
            maxPow = (long) Math.pow(10, N);

            search(9, N, 0);
        }

        Collections.sort(results);

        return results;
    }

    public static void main(String[] args) {
        //long start = System.currentTimeMillis();
        //long finish = System.currentTimeMillis();
        //System.out.println("Time consumed: " + (finish - start) + " ms");
        //System.out.println(list.size());
        //System.out.println(list);
        getNumbers(Long.MAX_VALUE);
    }

}




