package javarush.java_syntax_1.level4.lecture4.task9;
import java.io.*;
public class CrossTheRoadBlindfolded {
/*
    Работа светофора для пешеходов запрограммирована следующим образом:
    в начале каждого часа в течение трех минут горит зелёный сигнал,
    затем в течение одной минуты - жёлтый,
    а потом в течение одной минуты - красный,
    затем опять зелёный горит три минуты и т. д.

    Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
            Определить, сигнал какого цвета горит для пешеходов в этот момент.

    Результат вывести на экран в следующем виде:
            "зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.

    Пример для числа 2.5:
    зелёный

    Пример для числа 3:
    жёлтый

    Пример для числа 4:
    красный

    Пример для числа 5:
    зелёный
*/
/*
package com.javarush.Task.task04.task0416;
*/
/*
Переходим дорогу вслепую
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String s = reader.readLine();
        double a = Double.parseDouble(s);
        double b = a % 5;

        if (b >= 0.0 && b < 3)
            System.out.println("зелёный");
        else if (b >= 3.0 && b < 4)
            System.out.println("жёлтый");
        else if (b >= 4.0 && b < 5)
            System.out.println("красный");
    }

}
