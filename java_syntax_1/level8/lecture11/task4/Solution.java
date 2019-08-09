package javarush.java_syntax_1.level8.lecture11.task4;
/*
package com.javarush.Task.task08.task0822;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Минимальное из N чисел
*/
/*
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = Collections.min(array);// find minimum here — найти минимум тут

        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//create and initialize a list here - создать и заполнить список тут
        List<Integer> integerList = new ArrayList<Integer>();
        int N = Integer.parseInt(reader.readLine());
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(reader.readLine());
            integerList.add(a);
        }
        return integerList;
    }
}

