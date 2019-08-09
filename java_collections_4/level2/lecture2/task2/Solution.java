package javarush.java_collections_4.level2.lecture2.task2;
/*
package com.javarush.task.task32.task3210;
*/
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Используем RandomAccessFile
*/
/*
В метод main приходят три параметра:
1) fileName - путь к файлу;
2) number - число, позиция в файле;
3) text - текст.

Считать текст с файла начиная с позиции number, длинной такой же как и длинна переданного текста в третьем параметре.
Если считанный текст такой же как и text, то записать в конец файла строку 'true', иначе записать 'false'.
Используй RandomAccessFile и его методы seek(long pos), read(byte[] b, int off, int len), write(byte[] b).
Используй один из конструкторов класса String для конвертации считанной строчки в текст.
Требования:

    •
    В методе main класса Solution необходимо использовать RandomAccessFile, который должен использовать файл, который приходит первым параметром.
    •
    В методе main класса Solution программа должна устанавливать позицию в файле, которая передана во втором параметре.
    •
    В методе main класса Solution программа должна считывать данные с файла при помощи метода read(byte[] b, int off, int len).
    •
    Запись должна происходить в конец файла.
    */

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw")) {
            byte[] buffer = new byte[text.length()];
            file.seek(number);
            file.read(buffer, 0, buffer.length);
            String textFromFile = convertBytesToString(buffer);
            String endLine = textFromFile.equals(text) ? "true" : "false";
            file.seek(file.length());
            file.write(endLine.getBytes());
        }
    }


    public static String convertBytesToString (byte readBytes[]) {
        return new String(readBytes);
    }
}

