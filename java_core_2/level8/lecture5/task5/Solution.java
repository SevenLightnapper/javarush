package javarush.java_core_2.level8.lecture5.task5;
/*
package com.javarush.task.task18.task1810;
*/
/*
DownloadException
*/
import java.io.*;
/*
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки работы с файлами.
2.2 Выбросить исключение DownloadException.
Требования:

    •
    Программа должна считать имена файлов с консоли.
    •
    Для чтения из файлов используй поток FileInputStream.
    •
    Программа должна работать, пока введенный файл не окажется меньше 1000 байт.
    •
    Программа должна завершиться исключением DownloadException.
    •
    Поток FileInputStream должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                FileInputStream inputStream = new FileInputStream(reader.readLine());
                if (inputStream.available() < 1000) {
                    inputStream.close();
                    break;
                }
            }
        } catch (IOException e) {
        }
        throw new DownloadException();

    }

    public static class DownloadException extends Exception {

    }
}

