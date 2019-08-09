package javarush.java_core_2.level8.lecture11.task2;
/*
package com.javarush.task.task18.task1817;
*/
import java.io.*;
/*
Пробелы
*/
/*
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
4. Закрыть потоки.
Требования:

    •
    Считывать с консоли ничего не нужно.
    •
    Создай поток чтения из файла, который приходит первым параметром в main.
    •
    Посчитай отношение пробелов ко всем символам в файле и выведи в консоль это число.
    •
    Выведенное значение необходимо округлить до 2 знаков после запятой.
    •
    Поток чтения из файла должен быть закрыт.
    */

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(args[0]);

        int countAllSigns = 0;
        int countSpaceSigns = 0;

        while (inputStream.available() > 0) {
            countAllSigns++;
            if (inputStream.read() == ' ') {
                countSpaceSigns++;
            }
        }
        inputStream.close();

        float res =(float) countSpaceSigns / countAllSigns * 100;
        System.out.println(String.format("%.2f", res));


    }
}

