package javarush.java_core_2.level8.lecture5.task3;
/*
package com.javarush.task.task18.task1808;
*/
import java.io.*;
/*
Разделение файла
*/
/*
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.

Требования:
    •
    Программа должна три раза считать имена файлов с консоли.
    •
    Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
    •
    Первую половину байт из первого файла нужно записать во второй файл.
    •
    Вторую половину байт из первого файла нужно записать в третий файл.
    •
    Потоки FileInputStream и FileOutputStream должны быть закрыты.
    */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        String thirdFileName = reader.readLine();

        reader.close();

        FileInputStream fis1 = new FileInputStream(firstFileName);
        FileOutputStream fos1 = new FileOutputStream(secondFileName);
        FileOutputStream fos2 = new FileOutputStream(thirdFileName);

        int size = fis1.available();

        byte[] buffer1 = new byte[size - size / 2];
        byte[] buffer2 = new byte[size / 2];
        fis1.read(buffer1);
        fis1.read(buffer2);

        fos1.write(buffer1);
        fos2.write(buffer2);

        fis1.close();
        fos1.close();
        fos2.close();
    }
}

