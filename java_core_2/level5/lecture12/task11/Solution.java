package javarush.java_core_2.level5.lecture12.task11;
/*
package com.javarush.task.task15.task1529;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Осваивание статического блока
*/
/*
1. В отдельных файлах создать классы Plane и Helicopter, реализующие интерфейс CanFly.
2. Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
3. В статическом методе reset класса Solution:
3.1. Считать с консоли параметр типа String.
3.2. Если параметр равен "helicopter", то статическому объекту CanFly result присвоить объект класса Helicopter.
3.3. Если параметр равен "plane", то считать второй параметр типа int(количество пассажиров), статическому объекту CanFly result присвоить объект класса Plane.
4. В статическом блоке инициализировать CanFly result вызвав метод reset.
5. Закрыть поток ввода методом close().

Требования:
    •
    Класс Plane должен быть создан в отдельном файле и реализовывать интерфейс CanFly.
    •
    Класс Helicopter должен быть создан в отдельном файле и реализовывать интерфейс CanFly.
    •
    Класс Plane должен иметь конструктор с параметром int.
    •
    В классе Solution должен быть реализован метод public static void reset().
    •
    Метод reset должен считывать строки с клавиатуры.
    •
    Если введенная строка равна "helicopter", в переменную result должен быть сохранен объект типа Helicopter.
    •
    Если введенная строка равна "plane", в переменную result должен быть сохранен объект типа Plane.
    •
    Поле result класса Solution должно быть инициализировано в статическом блоке путем вызова метода reset.
    */

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();//add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //add your code here - добавьте код тут

        try {
            String s = reader.readLine();

            if (s.equals("helicopter")) {
                result = new Helicopter();
            } else if (s.equals("plane")) {
                result = new Plane(Integer.parseInt(reader.readLine()));
            }
            reader.close();
        } catch (IOException e) {}
    }
}

