package javarush.java_collections_4.level1.lecture10.task1;
/*
package com.javarush.task.task31.task3109;
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
Читаем конфиги
*/
/*
Реализовать метод getProperties, который должен считывать свойства из переданного файла fileName.
fileName может иметь любое расширение - как xml, так и любое другое, или вообще не иметь.
Нужно обеспечить корректное чтение свойств.
При возникновении ошибок должен возвращаться пустой объект.
Метод main не участвует в тестировании.

Подсказка: возможно тебе понадобится File.separator.
Требования:

    •
    Класс Solution должен содержать метод Properties getProperties(String fileName).
    •
    Метод getProperties должен корректно считывать свойства из xml-файла.
    •
    Метод getProperties должен корректно считывать свойства из любого другого файла с любым расширением.
    •
    Метод getProperties должен возвращать пустой объект, если во время чтения свойств возникла ошибка.
    */

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        Properties properties = new Properties();
        //marker
        boolean isXMLSuccess;

        //for XML
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            properties.loadFromXML(fileInputStream);
            isXMLSuccess = true;

        } catch (IOException e) {
            isXMLSuccess = false;
        }

        //non XML
        if (!isXMLSuccess) {
            FileInputStream fileInputStream;

            try {
                fileInputStream = new FileInputStream(fileName);
                properties.load(fileInputStream);
                fileInputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return properties;
    }
}

