package javarush.java_syntax_1.level6.lecture11.task8;
/*
package com.javarush.Task.task06.task0620;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Исправляем ошибки юности
*/
/*
public class Solution {
    public static class KissMyShinyMetalAss {

    }

    public static void main(String[] args) {
        KissMyShinyMetalAss robot = new KissMyShinyMetalAss();//напишите тут ваш код
        System.out.println(robot);
    }
}
*/

public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "Max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        Solution.max = a > b ? a : b;

        System.out.println(max + Solution.max);
    }
}