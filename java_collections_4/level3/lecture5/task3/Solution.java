package javarush.java_collections_4.level3.lecture5.task3;
/*
package com.javarush.task.task33.task3303;
*/
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
Десериализация JSON объекта
*/
/*
НЕОБХОДИМО: подключенные библиотеки Jackson Core, Bind и Annotation версии 2.6.1

В метод convertFromJsonToNormal первым параметром приходит имя файла, который содержит один ДЖЕЙСОН объект.
Вторым параметром приходит имя класса, объект которого находится в файле.
Метод convertFromJsonToNormal должен вычитать объект из файла, преобразовать его из JSON и вернуть.
Требования:

    •
    В методе convertFromJsonToNormal должен быть создан объект типа ObjectMapper с помощью конструктора без параметров.
    •
    Объект возвращаемый методом convertFromJsonToNormal должен быть получен с помощью метода readValue класса ObjectMapper.
    •
    Метод convertFromJsonToNormal должен быть статическим.
    •
    Метод convertFromJsonToNormal должен быть публичным.
    */

public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
        T result;
        ObjectMapper mapper = new ObjectMapper();

        result = mapper.readValue(new FileReader(new File(fileName)), clazz);
        return result;
    }

    public static void main(String[] args) {

    }
}

