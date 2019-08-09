package javarush.java_syntax_1.level4.lecture4.task6;

import java.io.*;

public class Weekday {
/*
package com.javarush.Task.task04.task0413;
*/
/*
День недели
*/
/*
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".
*/
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader( new InputStreamReader(System.in)); //напишите тут ваш код

            String Sweekday = reader.readLine();
            int weekday = Integer.parseInt(Sweekday);

            if (weekday == 1)
                System.out.println("понедельник");
            else if (weekday == 2)
                System.out.println("вторник");
            else if (weekday == 3)
                System.out.println("среда");
            else if (weekday == 4)
                System.out.println("четверг");
            else if (weekday == 5)
                System.out.println("пятница");
            else if (weekday == 6)
                System.out.println("суббота");
            else if (weekday == 7)
                System.out.println("воскресенье");
            else
                System.out.println("такого дня недели не существует");

        }
}
