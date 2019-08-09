package javarush.java_syntax_1.level7.lecture4.task4;
/*
package com.javarush.Task.task07.task0704;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Переверни массив
*/
/*
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке,
каждое значение выводить с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] a = new int[10];
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i < a.length; i++){
            a[i] = Integer.parseInt(num.readLine());
        }
        for (int i = a.length -1; i>=0; i--){
            System.out.println(a[i]);
        }

        /* another way to do the same thing:

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];//напишите тут ваш код

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(nums[9]);
        System.out.println(nums[8]);
        System.out.println(nums[7]);
        System.out.println(nums[6]);
        System.out.println(nums[5]);
        System.out.println(nums[4]);
        System.out.println(nums[3]);
        System.out.println(nums[2]);
        System.out.println(nums[1]);
        System.out.println(nums[0]);
        */

    }
}