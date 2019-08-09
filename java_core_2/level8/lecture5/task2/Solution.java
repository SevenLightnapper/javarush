package javarush.java_core_2.level8.lecture5.task2;
/*
package com.javarush.task.task18.task1807;
*/
/*
Подсчет запятых
*/
/*
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ','.
Требования:

    •
    Программа должна считывать имя файла с консоли.
    •
    Для чтения из файла используй поток FileInputStream.
    •
    В консоль должно выводится число запятых в считанном файле.
    •
    Поток чтения из файла должен быть закрыт.
    */

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fr = new FileInputStream(br.readLine());
        br.close();
        ArrayList<Integer> list = new ArrayList<>();

        while (fr.available() > 0){
            list.add(fr.read());
        }
        fr.close();

        int count = 0;
        for (int i = 0; i < list.size(); i++){
            if (44 == list.get(i)) count++;
        }
        System.out.print(count);
    }

}

