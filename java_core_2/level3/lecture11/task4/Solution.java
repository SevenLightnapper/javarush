package javarush.java_core_2.level3.lecture11.task4;
/*
package com.javarush.Task.task13.task1319;
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Писатель в файл с консоли
*/
/*
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
*/


public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter(rd.readLine()));
            while(true){
                String str = rd.readLine();
                bw.write(str);
                bw.newLine();
                if (str.equals("exit"))
                    break;
            }
            bw.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}

