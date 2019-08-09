package javarush.java_core_2.level9.lecture11.task11;
/*
package com.javarush.task.task19.task1916;
*/
/*
Отслеживаем изменения
*/
/*
Считать с консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines.
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME.
Пустые строки даны в примере для наглядности.
В оригинальном и редактируемом файлах пустых строк нет!

Пример 1:
оригинальный    редактированный    общий
file1:          file2:             результат:(lines)

строка1         строка1            SAME строка1
строка2                            REMOVED строка2
строка3         строка3            SAME строка3
строка4                            REMOVED строка4
строка5         строка5            SAME строка5
                строка0            ADDED строка0
строка1         строка1            SAME строка1
строка2                            REMOVED строка2
строка3         строка3            SAME строка3
                строка4            ADDED строка4
строка5         строка5            SAME строка5
строка0                            REMOVED строка0

Пример 2:
оригинальный    редактированный    общий
file1:          file2:             результат:(lines)

строка1         строка1            SAME строка1
                строка0            ADDED строка0

Пустые строки в примере означают, что этой строки нет в определенном файле.
Требования:

    •
    Класс Solution должен содержать класс LineItem.
    •
    Класс Solution должен содержать enum Type.
    •
    Класс Solution должен содержать публичное статическое поле lines типа List<LineItem>, которое сразу проинициализировано.
    •
    В методе main(String[] args) программа должна считывать имена файлов с консоли (используй BufferedReader).
    •
    В методе main(String[] args) BufferedReader для считывания данных с консоли должен быть закрыт.
    •
    Программа должна считывать содержимое первого и второго файла (используй FileReader).
    •
    Потоки чтения из файлов (FileReader) должны быть закрыты.
    •
    Список lines должен содержать объединенную версию строк из файлов, где для каждой строки указана одна из операций ADDED, REMOVED, SAME.
    */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();
    public static List<LineItem> copy = new ArrayList<LineItem>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(br.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(br.readLine()));

        ArrayList<String> firstFile = new ArrayList<>();
        ArrayList<String> secondFile = new ArrayList<>();

        String line = "";

        while ((line = file1.readLine()) != null)
            firstFile.add(line);

        while ((line = file2.readLine()) != null)
            secondFile.add(line);

        int counter = firstFile.size() + secondFile.size();

        for (int i = firstFile.size(); i < counter; i++)
            firstFile.add("");

        for (int i = secondFile.size(); i < counter; i++)
            secondFile.add("");

        int i = 0, j = 0, c = 0;

        while (c < counter) {

            if (firstFile.get(i).equals(secondFile.get(j))) {
                copy.add(new LineItem(Type.SAME, firstFile.get(i)));
                i++;
                j++;
            } else if (firstFile.get(i + 1).equals(secondFile.get(j))) {
                copy.add(new LineItem(Type.REMOVED, firstFile.get(i)));
                i++;
            } else if (firstFile.get(i).equals(secondFile.get(j + 1))) {
                copy.add(new LineItem(Type.ADDED, secondFile.get(j)));
                j++;
            }

            c++;
        }

        for (LineItem item : copy)
            if (!item.line.equals(""))
                lines.add(item);

        br.close();
        file1.close();
        file2.close();


    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
