package javarush.java_syntax_1.level9.lecture11.task4;
/*
package com.javarush.Task.task09.task0922;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/
/*
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-Solution");
        Date date = sdf.parse(reader.readLine());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(date).toUpperCase());
    }
}


