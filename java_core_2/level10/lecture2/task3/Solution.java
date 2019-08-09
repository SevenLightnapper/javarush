package javarush.java_core_2.level10.lecture2.task3;
/*
package com.javarush.task.task20.task2003;
*/
/*
Знакомство с properties
*/
/*
В методе fillInPropertiesMap считайте имя файла с консоли и заполни карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуй логику записи в файл и чтения из файла для карты properties.
Требования:

    •
    Метод fillInPropertiesMap должен считывать данные с консоли.
    •
    Метод fillInPropertiesMap должен создавать FileInputStream, передавая считанную строку в качестве параметра.
    •
    Метод fillInPropertiesMap должен вызывать метод load передавая только что созданный FileInputStream в качестве параметра.
    •
    Метод save должен сохранять карту properties в полученный в качестве параметра объект типа OutputStream.
    •
    Метод load должен восстанавливать состояние карты properties из полученного в качестве параметра объекта типа InputStream.
    */

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* !!!!!!!!!
 HELP FOR SOLVING THIS TASK IS BEHIND THIS LINK -> http://www.mkyong.com/java/java-properties-file-examples/
 HERE'S SOME MORE USEFUL STUFF -> https://stackoverflow.com/questions/17209260/converting-java-util-properties-to-hashmapstring-string
 AND EVEN MORE USEFUL STUFF -> Обогатился ссылками:
                               1. https://docs.oracle.com/javase/7/docs/api/java/util/Properties.html#store(java.io.OutputStream,%20java.lang.String)
                               2. https://habr.com/post/168195/
                               3. https://habr.com/post/224593/

                               properties.forEach((key, value) -> System.out.println(key + " : " + value));
 */

public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception{
        //implement this method - реализуйте этот метод

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
        load(inputStream);
        inputStream.close();
        reader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties pr = new Properties();
        for (Map.Entry<String,String> pair: properties.entrySet()
        ) {
            pr.setProperty(pair.getKey(),pair.getValue());
        }
        pr.store(new PrintWriter(outputStream), "");


    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties pr = new Properties();
        pr.load(inputStream);
        properties.putAll((Map)pr);
    }

    public static void main(String[] args){


    }
}
