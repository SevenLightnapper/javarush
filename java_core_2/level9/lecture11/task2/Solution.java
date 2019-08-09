package javarush.java_core_2.level9.lecture11.task2;
/*
package com.javarush.task.task19.task1920;
*/
/*
Самый богатый
*/
/*
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
Имена разделять пробелом либо выводить с новой строки.
Закрыть потоки.

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
Требования:

    •
    Программа НЕ должна считывать данные с консоли.
    •
    Программа должна считывать содержимое файла (используй FileReader).
    •
    Поток чтения из файла (FileReader) должен быть закрыт.
    •
    Программа должна выводить в консоль имена, у которых максимальная сумма.
    */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        ArrayList<String> list = new ArrayList<>();

        while (reader.ready()) {
            String st = reader.readLine();
            list.add(st);
        }

        for (String s : list) {
            String[] array = s.split(" ");
            String name = array[0];
            double salary = Double.parseDouble(array[1]);
            if (map.containsKey(name)) {
                salary = salary + map.get(name);
            }
            map.put(name, salary);

        }

        Double maxValueInMap = (Collections.max(map.values()));  // This will return max value in the Hashmap
        for (Map.Entry<String, Double> entry : map.entrySet()) {  // Itrate through hashmap
            // System.out.println(entry.getKey() + " - " + entry.getValue() + " | " + (entry.getValue() == maxValueInMap)); <- line to see what answer you will see on the screen
            if (entry.getValue().equals(maxValueInMap)) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }

        reader.close();
    }
}


