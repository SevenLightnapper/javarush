package javarush.java_multithreading_3.level2.lecture9.task1;
/*
package com.javarush.task.task22.task2207;
*/
/*
Обращенные слова
*/
/*
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Использовать StringBuilder.
Кодировка файла - UTF-8.

Пример содержимого файла
рот тор торт о
о тот тот тот

Вывод:
рот тор
о о
тот тот
Требования:

    •
    Метод main должен считывать имя файла с клавиатуры.
    •
    В методе main должен быть использован StringBuilder.
    •
    В классе Solution должен содержаться вложенный класс Pair.
    •
    В классе Pair должен быть объявлен конструктор без параметров (или конструктор по умолчанию).
    •
    Список result должен быть заполнен корректными парами согласно условию задачи.
    */
import java.io.*;
import java.util.*;

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(br.readLine())));
        ArrayList<String> list = new ArrayList<>();

        while(fr.ready()) {
            list.addAll(Arrays.asList(fr.readLine().split(" ")));
        }

        //System.out.println(list);

        while(!list.isEmpty()) {
            StringBuilder sb1 = new StringBuilder(list.get(0));
            StringBuilder sb2 = new StringBuilder(list.get(0)).reverse();
            list.remove(sb1.toString());
            if(list.contains(sb2.toString())) {
                Pair p = new Pair();
                p.first = sb1.toString();
                p.second = sb2.toString();

                if(!result.contains(p))
                    result.add(p);
            }
        }
        br.close();
        fr.close();

        //System.out.println(result.size());

        for(Pair p : result) {
            System.out.println(p);
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        public Pair() {
        }
    }
}


