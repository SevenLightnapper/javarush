package javarush.java_core_2.level3.lecture11.task11;
/*
package com.javarush.Task.task13.task1326;
*/
import java.util.*;
import java.io.*;
/*
Сортировка четных чисел из файла
*/
/*
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(fis.available() > 0) {
            StringBuilder a = new StringBuilder();
            while(fis.available() > 0) {
                char c = (char) fis.read();
                if(c == '\n') break;
                a.append(c);
            }
            list.add(Integer.parseInt(a.toString()));
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                System.out.println(list.get(i));
            }
        }
        fis.close();
        reader.close();
    }
}
