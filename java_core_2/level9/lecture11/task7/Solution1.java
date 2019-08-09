package javarush.java_core_2.level9.lecture11.task7;
/*
package com.javarush.task.task19.task1925;
*/
/*
Длинные слова
*/

import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        FileWriter fileWriter = new FileWriter(args[1]);
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()) {
            stringBuilder.append((char)fileReader.read());
        }
        fileReader.close();
        String [] words = stringBuilder.toString().trim().split(" ");
        String moreThenSix = " ";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 6) {
                moreThenSix = (moreThenSix + words[i]) + " ";
            }
        }
        moreThenSix = moreThenSix.trim().replaceAll(" ", ",");
        fileWriter.write(moreThenSix);
        fileWriter.close();
    }
}

