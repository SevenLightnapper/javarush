package javarush.java_syntax_1.level7.lecture4.task5;
/*
package com.javarush.Task.task07.task0705;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/
/*
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // massive for 20 numbers
        int[] full = new int[20];
        for(int i = 0; i < full.length; i++){
            full[i] = Integer.parseInt(reader.readLine());
        }
        // massive for first half of the 20 numbers massive
        int[] half1 = new int[10];
        for(int i = 0; i < half1.length; i++){
            half1[i] = full[i];
        }

        // massive for second half of the 20 numbers massive
        int[] half2 = new int[10];
        for(int i = 0; i < half2.length; i++){
            half2[i] = full[10];
            full[10]++;
        }
        for(int i = 0; i < half2.length; i++){
            System.out.println(half2[i]);//напишите тут ваш код
        }
    }
}

