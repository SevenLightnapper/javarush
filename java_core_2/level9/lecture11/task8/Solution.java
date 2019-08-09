package javarush.java_core_2.level9.lecture11.task8;
/*
package com.javarush.task.task19.task1926;
*/
/*
Перевертыши
*/
/*
1. Считать с консоли имя файла. Считать содержимое файла.
2. Для каждой строки в файле:
2.1. переставить все символы в обратном порядке.
2.2. вывести на экран.
3. Закрыть потоки.

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
Требования:

    •
    Программа должна считывать имя файла с консоли (используй BufferedReader).
    •
    BufferedReader для считывания данных с консоли должен быть закрыт.
    •
    Программа должна считывать содержимое файла (используй FileReader).
    •
    Поток чтения из файла (FileReader) должен быть закрыт.
    •
    Программа должна выводить в консоль все символы из файла в обратном порядке.
    */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fr = new BufferedReader(new FileReader(fileName));


        while (fr.ready()) {
            StringBuilder sb = new StringBuilder(fr.readLine());
            System.out.println(sb.reverse().toString());
        }
        fr.close();
    }
}

