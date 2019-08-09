package javarush.java_syntax_1.level4.lecture13.task5;
import java.io.*;
public class LetterOfHappiness {
/*
    Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.

    Пример вывода на экран для имени Света:
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
    Света любит меня.
------------------------------------------------------------
package com.javarush.Task.task04.task0439;                 |
------------------------------------------------------------
Письмо счастья
*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String name = reader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }
}
