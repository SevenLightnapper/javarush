package javarush.java_core_2.level9.lecture11.task7;
/*
package com.javarush.task.task19.task1925;
*/
/*
Длинные слова
*/
/*
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6.
В конце файла2 запятой не должно быть.
Закрыть потоки.

Пример выходных данных в файл2:
длинное,короткое,аббревиатура
Требования:

    •
    Программа НЕ должна считывать данные с консоли.
    •
    Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
    •
    Поток чтения из файла (FileReader) должен быть закрыт.
    •
    Программа должна записывать через запятую во второй файл все слова из первого файла длина которых строго больше 6(используй FileWriter).
    •
    Поток записи в файл (FileWriter) должен быть закрыт.
    */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        FileWriter file2 = new FileWriter(args[1]);
        String out = "";
        while(file1.ready()){
            String read = file1.readLine();
            String[] readWords = read.split("(\\s)");
            for(int i = 0; i<readWords.length; i++){
                if(readWords[i].length()>6) out+=readWords[i]+" ";
            }
        }
        file2.write(out.trim().replaceAll(" ", ","));
        file1.close();
        file2.close();
    }
}

