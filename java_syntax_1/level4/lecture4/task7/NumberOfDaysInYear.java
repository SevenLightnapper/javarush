package javarush.java_syntax_1.level4.lecture4.task7;

import java.io.*;

public class NumberOfDaysInYear {
/*
    package com.javarush.Task.task04.task0414;
*/
/*
    Количество дней в году
*/
/*Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
количество дней в году: x
, где
х - 366 для високосного года,
х - 365 для обычного года.

Подсказка:
В високосном году - 366 дней, тогда как в обычном - 365.
Високосным годом является каждый четвёртый год, за исключением годов, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 - не високосные.*/
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

            String Syear = reader.readLine();
            int a = Integer.parseInt(Syear);

            if (a % 4 != 0 || (a % 100 == 0 & a % 400 != 0))
                System.out.println("количество дней в году: 365");
            else
                System.out.println("количество дней в году: 366");

        }
}
