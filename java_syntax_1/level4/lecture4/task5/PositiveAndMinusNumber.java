package javarush.java_syntax_1.level4.lecture4.task5;

import java.io.*;

public class PositiveAndMinusNumber {
/*
    package com.javarush.Task.task04.task0412;
*/
/*
    Положительное и отрицательное число
*/
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));            //напишите тут ваш код

            String sNumber = reader.readLine();
            int nNumber = Integer.parseInt(sNumber);

            if (nNumber > 0)
                System.out.println(nNumber * 2);
            else if (nNumber < 0)
                    System.out.println(nNumber + 1);
            else if (nNumber == 0)
                System.out.println(0);
        }
}

