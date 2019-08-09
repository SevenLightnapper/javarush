package javarush.java_core_2.level8.lecture11.task5;
/*
package com.javarush.task.task18.task1820;
*/
import java.io.*;
/*
Округление чисел
*/
/*
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 => 3
3.50 => 4
3.51 => 4
-3.49 => -3
-3.50 => -3
-3.51 => -4
Требования:

    •
    Программа должна два раза считать имена файлов с консоли.
    •
    Для первого файла создай поток для чтения. Для второго - поток для записи.
    •
    Считать числа из первого файла, округлить их и записать через пробел во второй.
    •
    Должны соблюдаться принципы округления, указанные в задании.
    •
    Созданные для файлов потоки должны быть закрыты.
    */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();

        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);
        char[] inBuff = new char[fis.available()];
        String result;

        for (int i = 0; fis.available() > 0 ; i++) {
            inBuff[i] = (char)fis.read();
        }
        result = new String(inBuff);
        String split[] = result.split(" ");

        for (int i = 0;  i < split.length; i++) {
            int j = Math.round(Float.parseFloat(split[i]));
            String wr =Integer.toString(j);
            String space = " ";
            if(i < split.length-1 ) {
                byte[] arrByteFinal = wr.getBytes();
                byte[] arrSpace = space.getBytes();
                fos.write(arrByteFinal, 0, arrByteFinal.length);
                fos.write(arrSpace, 0, arrSpace.length);
            }
            else {
                byte[] arrByteFinal = wr.getBytes();
                fos.write(arrByteFinal, 0, arrByteFinal.length);
            }
        }
        reader.close();
        fis.close();
        fos.close();
    }
}

