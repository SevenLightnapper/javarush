package javarush.java_core_2.level8.lecture11.task7;
/*
package com.javarush.task.task18.task1822;
*/
/*
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader buff = new BufferedReader(new FileReader(fileName));

        while (buff.ready()) {
            String s = buff.readLine();

            if (s.startsWith(args[0] + " ")) {
                System.out.println(args[0] + " " + s.substring(args[0].length() + 1));
            }
        }

        reader.close();
        buff.close();
    }
}


