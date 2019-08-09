package javarush.java_syntax_1.level7.lecture4.task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
    package com.javarush.Task.task07.task0706;
*/
/*
Улицы и дома
*/
/*
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.
*/
public class StreetsAndHouses {
    public static void main(String[] args) throws Exception {
        int[] numb = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numb.length; i++){
            numb[i] = Integer.parseInt(reader.readLine());}

        int[] numb2 = new int[8];
        for (int i = 0; i < numb2.length; i++)
            numb2[i] = numb[i*2];


        int[] numb3 = new int[8];
        for (int i = 0; i < numb3.length - 1; i++)
            numb3[i] = numb[1+2*i];

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < numb2.length; i++){
            sum1 += numb2[i];}

        for (int i = 0; i < numb3.length; i++){
            sum2 += numb3[i];}

        if (sum1>sum2)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}

