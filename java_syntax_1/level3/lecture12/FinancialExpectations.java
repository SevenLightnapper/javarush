package javarush.java_syntax_1.level3.lecture12;

import java.io.*;

public class FinancialExpectations {
/*
    package com.javarush.Task.task03.task0325;
*/
/*
Финансовые ожидания
*/
        public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
            String sAge = reader.readLine();
            int n = Integer.parseInt(sAge);
            System.out.println("Я буду зарабатывать $" + n + " в час");

        }
}
