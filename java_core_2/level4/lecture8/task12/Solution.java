package javarush.java_core_2.level4.lecture8.task12;
/*
package com.javarush.task.task14.task1420;
*/
/*
НОД
*/
/*
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
Требования:

    Программа должна считывать с клавиатуры 2 строки.
    В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
    Программа должна выводить данные на экран.
    Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
    */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a <= 0 || b <= 0 || (a <= 0 && b<= 0)) {
            throw new Exception();
        }

        System.out.println(GCD(a, b));
    }
    public static int GCD(int a, int b) {
        if (b==0) return a;
        return GCD(b,a%b);
    }
}

