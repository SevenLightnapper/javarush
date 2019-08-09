package javarush.java_core_2.level5.lecture12.task9;
/*
package com.javarush.task.task15.task1527;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Парсер реквестов
*/
/*
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double 3.14

Требования:
    Программа должна считывать с клавиатуры только одну строку.
    Класс Solution не должен содержать статические поля.
    Программа должна выводить данные на экран в соответствии с условием.
    Программа должна вызывать метод alert с параметром double в случае, если значение параметра obj может быть корректно преобразовано в число типа double.
    Программа должна вызывать метод alert с параметром String в случае, если значение параметра obj НЕ может быть корректно преобразовано в число типа double.
    */

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        str = str.split("\\?")[1];
        String[] params = str.split("&");
        for (int i = 0; i < params.length; i++) {
            params[i] = params[i].split("=")[0];
        }
        String output = "";
        for (int i = 0; i < params.length; i++) {
            output += params[i] + " ";
        }
        System.out.println(output.trim());
        params = str.split("&");
        for (int i = 0; i < params.length; i++) {
            if (params[i].split("=")[0].equals("obj")) {
                try {
                    alert(Double.parseDouble(params[i].split("=")[1]));
                } catch (Exception e) {
                    alert(params[i].split("=")[1]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}



