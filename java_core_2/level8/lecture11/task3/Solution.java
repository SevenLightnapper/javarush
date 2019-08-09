package javarush.java_core_2.level8.lecture11.task3;
/*
package com.javarush.task.task18.task1818;
*/
/*
Два в одном
*/
import  java.io.*;
/*
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.
Требования:

    •
    Программа должна три раза считать имена файлов с консоли.
    •
    Для первого файла создай поток для записи. Для двух других - потоки для чтения.
    •
    Содержимое второго файла нужно переписать в первый файл.
    •
    Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
    •
    Созданные для файлов потоки должны быть закрыты.
    */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream firstFile = new FileOutputStream(reader.readLine());
        FileInputStream secondFile = new FileInputStream(reader.readLine());
        FileInputStream thirdFile = new FileInputStream(reader.readLine());
        reader.close();
        byte[] buffer1 = new byte[1000];
        byte[] buffer2 = new byte[1000];

        while (secondFile.available() > 0) {
            int count = secondFile.read(buffer1);
            firstFile.write(buffer1, 0, count);
        }
        secondFile.close();

        while (thirdFile.available() > 0) {
            int count = thirdFile.read(buffer2);
            firstFile.write(buffer2, 0, count);
        }
        thirdFile.close();
        firstFile.close();

    }
}

