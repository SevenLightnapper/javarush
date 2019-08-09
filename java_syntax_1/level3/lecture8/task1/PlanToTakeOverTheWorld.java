package javarush.java_syntax_1.level3.lecture8.task1;

import java.io.*;

import static java.lang.String.format;


public class PlanToTakeOverTheWorld {
    /*
        package com.javarush.Task.task03.task0318;
    */
/*
План по захвату мира
*/

         public static void main(String[] args) throws Exception {

             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

             String sAge = reader.readLine();
             int nAge = Integer.parseInt(sAge);
             String name = reader.readLine();

             System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");

        }
}
