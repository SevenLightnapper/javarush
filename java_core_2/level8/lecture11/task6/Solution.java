package javarush.java_core_2.level8.lecture11.task6;
/*
package com.javarush.task.task18.task1821;
*/
/*
Встречаемость символов
*/
/*
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Пример:
','=44, 's'=115, 't'=116.

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.

Пример вывода:
, 19
- 7
f 361
Требования:

    •
    Считывать с консоли ничего не нужно.
    •
    Создай поток для чтения из файла, который приходит первым параметром в main.
    •
    В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
    •
    Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
    •
    Поток для чтения из файла должен быть закрыт.
*/
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[0]);
        ArrayList<Character> arr = new ArrayList<>();
        while(reader.ready()){
            arr.add((char)reader.read());
        }
        reader.close();
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (char ar : arr) {
            if (map.containsKey(ar)) {
                map.put(ar,map.get(ar) + 1);
            }
            else{
                map.put(ar, 1);
            }
        }
        for (Map.Entry<Character,Integer>pair : map.entrySet() ) {
            System.out.println(pair.getKey() + " "+ pair.getValue());
        }

    }
}
