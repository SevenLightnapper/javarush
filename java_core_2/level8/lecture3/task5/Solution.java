package javarush.java_core_2.level8.lecture3.task5;
/*
package com.javarush.task.task18.task1805;
*/
import java.io.*;
import java.util.*;

/*
Сортировка байт
*/
/*
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83

Требования:
    •
    Программа должна считывать имя файла с консоли.
    •
    Для чтения из файла используй поток FileInputStream.
    •
    В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
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

        TreeSet<Integer> set = new TreeSet<>();
        while (input.available() > 0) {
            set.add(input.read());
        }
        input.close();

        set.stream().forEachOrdered(x -> System.out.print(x + " "));
    }
}

