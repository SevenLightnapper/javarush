package javarush.java_core_2.level9.lecture11.task1;
/*
package com.javarush.task.task19.task1919;
*/
/*
Считаем зарплаты
*/
/*
 метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
Требования:

    •
    Программа НЕ должна считывать данные с консоли.
    •
    Программа должна считывать содержимое файла (используй FileReader).
    •
    Поток чтения из файла (FileReader) должен быть закрыт.
    •
    Программа должна выводить в консоль каждое имя и сумму всех его значений, все данные должны быть отсортированы в возрастающем порядке по имени.
    */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        TreeMap<String, Double> map = new TreeMap<>();
        FileReader fileReader = new FileReader(args[0]);

        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(" ");
        }
        String text = stringBuilder.toString();
        String[] words = text.split(" ");
        fileReader.close();
        reader.close();


        for (int i = 0; i < words.length; i += 2) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], Double.parseDouble(words[i + 1]));
            } else {
                map.put(words[i], map.get(words[i]) + Double.parseDouble(words[i + 1]));
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}