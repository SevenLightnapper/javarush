package javarush.java_syntax_1.level8.lecture11.task10;
/*
package com.javarush.Task.task08.task0828;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Номер месяца
*/
/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String>  spisok = new ArrayList<>();
        spisok.add("January");
        spisok.add("February");
        spisok.add("March");
        spisok.add("April");
        spisok.add("May");
        spisok.add("June");
        spisok.add("July");
        spisok.add("August");
        spisok.add("September");
        spisok.add("October");
        spisok.add("November");
        spisok.add("December");

        try {

            String input = reader.readLine();
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("MMMMM", Locale.ENGLISH);
            calendar.setTime(sdf.parse(input));

            int month = calendar.get(Calendar.MONTH);


            System.out.println(spisok.get(month) + " is the " + (month+1) + " month");


        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}




