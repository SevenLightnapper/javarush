package javarush.java_core_2.level9.lecture11.task3;
/*
package com.javarush.task.task19.task1921;
*/
/*
Хуан Хуанович
*/
/*
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами.

Заполнить список PEOPLE используя данные из файла.
Закрыть потоки.

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
Требования:

    •
    Класс Solution должен содержать публичную константу PEOPLE типа List<Person>, которая должна быть сразу проинициализирована.
    •
    Программа НЕ должна считывать данные с консоли.
    •
    Программа должна считывать содержимое файла (используй FileReader).
    •
    Поток чтения из файла (FileReader) должен быть закрыт.
    •
    Программа должна заполнить список PEOPLE данными из файла.
    •
    Программа должна правильно работать с двойными именами, например Анна-Надежда.
    */
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String text = "";
        while (reader.ready()) {
            text += reader.readLine() + "\n";
        }
        reader.close();
        String[] strings = text.split("\\s+");
        String name = "";
        boolean b;
        for (int i = 0; i < strings.length; ) {
            b = true;
            while (b) {
                if (!isNumeric(strings[i])) {
                    name += strings[i] + " ";
                    i++;
                } else {
                    DateFormat df = new SimpleDateFormat("dd M yyyy");
                    Date bd = df.parse(strings[i] + " " + strings[i + 1] + " " + strings[i + 2]);
                    PEOPLE.add(new Person(name.trim(), bd));
                    i += 3;
                    name = "";
                    b = false;
                }
            }
        }
        for (Person p : PEOPLE) {
            System.out.println(p);
        }
    }

    public static boolean isNumeric(String str) {
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}




