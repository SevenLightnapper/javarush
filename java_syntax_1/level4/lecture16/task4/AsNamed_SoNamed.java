package javarush.java_syntax_1.level4.lecture16.task4;
import java.io.*;
public class AsNamed_SoNamed {
    /*
        package com.javarush.Task.task04.task0443;
    */
/*
Как назвали, так назвали
*/
/*
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, Solution.

Вывести на экран текст:
"Меня зовут name.
Я родился Solution.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988
*/
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        String name = reader.readLine();
        String sAge = reader.readLine();
        String dAge = reader.readLine();
        String fAge = reader.readLine();
        int age1 = Integer.parseInt(sAge);
        int age2 = Integer.parseInt(dAge);
        int age3 = Integer.parseInt(fAge);

        System.out.println("Меня зовут " + name + ".\n" +
                "Я родился " + age3 + "." + age2 + "." + age1);

    }
}


