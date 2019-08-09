package javarush.java_core_2.level8.lecture3.task4;
/*
package com.javarush.task.task18.task1804;
*/
import java.io.*;
import java.util.*;

/*
Самые редкие байты
*/
/*
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.

Требования:
    •
    Программа должна считывать имя файла с консоли.
    •
    Для чтения из файла используй поток FileInputStream.
    •
    В консоль через пробел должны выводиться все байты из файла с минимальным количеством повторов.
    •
    Данные в консоль должны выводится в одну строку.
    •
    Поток чтения из файла должен быть закрыт.
    */

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());
        reader.close();
        HashMap<Integer, Integer> map = new HashMap<>();

        while (input.available() > 0){
            int i = input.read();
            if (map.containsKey(i)){
                int j = map.get(i);
                map.put(i, ++j);
            } else map.put(i, 1);
        }
        input.close();
        int min = Collections.min(map.values());
        for (Map.Entry<Integer, Integer> pair: map.entrySet()){
            if (pair.getValue().equals(min)){
                byte b = (byte) pair.getKey().intValue();
                System.out.printf(b + " ");
            }
        }
    }
}
