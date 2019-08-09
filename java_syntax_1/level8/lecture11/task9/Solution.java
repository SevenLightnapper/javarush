package javarush.java_syntax_1.level8.lecture11.task9;
/*
package com.javarush.Task.task08.task0827;
*/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Работа с датой
*/
/*
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 1 2010")); // 31 + 28 = 59; 59 + 31 = 90; 90 + 30 = 120; 120 + 1 = 121; <- odd date
    }

    public static boolean isDateOdd(String date) throws ParseException {
        /*Date date1 = new Date(date);
        Calendar cal = new GregorianCalendar();
        cal.setTime(date1);
        // System.out.println(cal.get(Calendar.DAY_OF_YEAR)); <- shows the number of days that have passed from the beginning of the year on the screen
        return ( cal.get(Calendar.DAY_OF_YEAR) % 2 != 0 );
*/
        Date startofyear = new Date();
        startofyear.setHours(0);
        startofyear.setMinutes(0);
        startofyear.setSeconds(0);
        startofyear.setDate(0);
        startofyear.setMonth(0);
        startofyear.setYear(0);

        DateFormat df = new SimpleDateFormat("MMMMM Solution yyyy", Locale.ENGLISH);

        Date currentTime = new Date();
        currentTime = df.parse(date);
        long msTimeDistance = currentTime.getTime() - startofyear.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTimeDistance / msDay);
        return (dayCount % 2 != 0);
    }
}
