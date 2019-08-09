package javarush.java_multithreading_3.level2.lecture7.task3;
/*
package com.javarush.task.task22.task2206;
*/
import java.util.Date;

/*
Форматирование даты
*/
/*
USEFUL INFORMATION ON String.format();
https://ilovejavaforever.wordpress.com/2016/01/03/%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-%D1%81%D1%82%D1%80%D0%BE%D0%BA-java/
 */
/*
Исправить метод getFormattedString так, чтобы он возвращал строку с параметрами для форматирования.

Должен быть вывод аналогичный следующему:
05:04:18 09:09:09 (число:месяц:год часы:минуты:секунды)
Требования:

    •
    Метод getFormattedString должен быть публичным.
    •
    Метод getFormattedString должен быть статическим.
    •
    Вывод на экран должен соответствовать условию задачи.
    •
    Метод getFormattedString должен возвращать строку с параметрами для форматирования согласно условию задачи.
    */

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format(getFormattedString(), date, date, date, date, date, date));
        //должен быть вывод аналогичный следующему
        //31:10:13 15:59:59
    }

    public static String getFormattedString() {
        return "%td:%tm:%ty %tH:%tM:%tS";
    }
}

