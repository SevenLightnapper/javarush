package javarush.java_core_2.level9.lecture5.task1;
/*
package com.javarush.task.task19.task1906;
*/
/*
Четные символы
*/
/*Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie

Закрыть потоки ввода-вывод
Требования:

    •
    Программа должна считывать имена файлов с консоли (используй BufferedReader).
    •
    BufferedReader для считывания данных с консоли должен быть закрыт.
    •
    Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
    •
    Поток чтения из файла (FileReader) должен быть закрыт.
    •
    Программа должна записывать во второй файл все байты из первого файла с четным порядковым номером (используй FileWriter).
    •
    Поток записи в файл (FileWriter) должен быть закрыт.
    */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        reader.close();

        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);
        int count = 0;

        while (fileReader.ready()) {
            int data = fileReader.read();
            count++;
            if (count % 2 == 0){
                fileWriter.write(data);
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}

