package javarush.java_core_2.level9.lecture11.task4;
/*
package com.javarush.task.task19.task1922;
*/
/*
Ищем нужные строки
*/
/*
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
Закрыть потоки.

Пример:
words содержит слова А, Б, В

Строки:
В Б А Д //3 слова из words, не подходит
А Б А Д //3 слова из words, не подходит
Д А Д //1 слово из words, не подходит
Д А Б Д //2 слова - подходит, выводим
Д А А Д //2 слова - подходит, выводим
Требования:

    •
    Класс Solution должен содержать публичное статическое поле words типа List<String>, которое должно быть сразу проинициализировано.
    •
    Класс Solution должен содержать статический блок, в котором добавляются три или больше слов в список words.
    •
    Программа должна считывать имя файла с консоли (используй BufferedReader).
    •
    BufferedReader для считывания данных с консоли должен быть закрыт.
    •
    Программа должна считывать содержимое файла (используй FileReader).
    •
    Поток чтения из файла (FileReader) должен быть закрыт.
    •
    Программа должна выводить в консоль все строки из файла, которые содержат всего 2 слова из списка words.
    */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bf.readLine();
        bf.close();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String[] strings;
        byte counter = 0;
        while (reader.ready())
        {
            String str = reader.readLine();
            strings = str.split(" ");
            for (int i = 0; i < strings.length; i++)
            {
                for (int j = 0; j < words.size(); j++)
                {
                    if(strings[i].equals(words.get(j)))
                        counter++;
                }
            }
            if(counter == 2) System.out.println(str);
            counter = 0;
        }
        reader.close();

    }
}

