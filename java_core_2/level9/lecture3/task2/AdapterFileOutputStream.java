package javarush.java_core_2.level9.lecture3.task2;
/*
package com.javarush.task.task19.task1902;
*/
/*
Адаптер
*/
/*
Используй класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter.
Требования:

    •
    AmigoStringWriter должен быть интерфейсом.
    •
    Класс AdapterFileOutputStream должен реализовывать интерфейс AmigoStringWriter.
    •
    Класс AdapterFileOutputStream должен содержать приватное поле fileOutputStream типа FileOutputStream.
    •
    Класс AdapterFileOutputStream должен содержать конструктор с параметром FileOutputStream.
    •
    Метод flush() класса AdapterFileOutputStream должен делегировать полномочие такому же методу fileOutputStream.
    •
    Метод writeString(String s) класса AdapterFileOutputStream должен делегировать полномочие такому же методу fileOutputStream.
    •
    Метод close() класса AdapterFileOutputStream должен делегировать полномочие такому же методу fileOutputStream.
    */

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public static void main(String[] args) {

    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
            fileOutputStream.close();
    }
}


