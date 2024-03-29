package javarush.java_core_2.level8.lecture5.task1;
/*
package com.javarush.task.task18.task1806;
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Исправить ошибки
*/
/*
Иссправить функциональность в соответствии с требованиями.

Программа должна:
1. Переписать все байты одного файла в другой одним куском.
2. Закрывать потоки ввода-вывода.

Подсказка:
4 ошибки.
Требования:

    •
    Программа должна использовать классы FileInputStream и FileOutputStream.
    •
    Программа должна переписать все байты одного файла в другой одним куском.
    •
    Потоки FileInputStream и FileOutputStream должны быть закрыты.
    •
    Нужно исправить 4 ошибки.
    */

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");
        byte[] buffer = new byte[1000];

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}

