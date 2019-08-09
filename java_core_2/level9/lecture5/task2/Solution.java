package javarush.java_core_2.level9.lecture5.task2;
/*
package com.javarush.task.task19.task1907;
*/
/*
Считаем слово
*/
/*
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.
Требования:

    •
    Программа должна считывать имя файла с консоли (используй BufferedReader).
    •
    BufferedReader для считывания данных с консоли должен быть закрыт.
    •
    Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
    •
    Поток чтения из файла (FileReader) должен быть закрыт.
    •
    Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
    */
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(fileName));
        int count = 0;
        String s;

        while(true)
        {
            s = reader2.readLine();
            if(s == null)
                break;
            Pattern p = Pattern.compile("\\bworld\\b");

            Matcher m = p.matcher(s);
            while (m.find()){
                count++;
            }

        }
        reader2.close();
        System.out.println(count);
    }
}

