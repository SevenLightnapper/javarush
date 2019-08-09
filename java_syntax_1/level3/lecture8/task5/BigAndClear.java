package javarush.java_syntax_1.level3.lecture8.task5;

import java.io.*;

public class BigAndClear {
/*
    package com.javarush.Task.task03.task0322;
*/
/*
Большая и чистая
*/

        public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

            String name = reader.readLine();//напишите тут ваш код
            String name1 = reader.readLine();
            String name2 = reader.readLine();

            System.out.println(name + " + " + name1 + " + " + name2 + " = Чистая любовь, да-да!");

        }

}
