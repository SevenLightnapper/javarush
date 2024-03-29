package javarush.java_core_2.level8.lecture8.task2;
/*
package com.javarush.task.task18.task1812;
*/
import java.io.*;

/*
Расширяем AmigoOutputStream
*/
/*
Используя шаблон проектирования Wrapper (Decorator) расширь функциональность AmigoOutputStream.
В классе QuestionFileOutputStream при вызове метода close() должна быть реализована следующая функциональность:
1. Вывести в консоль фразу "Вы действительно хотите закрыть поток? Д/Н".
2. Считайте строку.
3. Если считанная строка равна "Д", то закрыть поток.
4. Если считанная строка не равна "Д", то не закрывать поток.
Требования:

    •
    Интерфейс AmigoOutputStream изменять нельзя.
    •
    Класс QuestionFileOutputStream должен реализовывать интерфейс AmigoOutputStream.
    •
    Класс QuestionFileOutputStream должен инициализировать в конструкторе поле типа AmigoOutputStream.
    •
    Все методы QuestionFileOutputStream должны делегировать свое выполнение объекту AmigoOutputStream.
    •
    Метод close() должен спрашивать у пользователя "Вы действительно хотите закрыть поток? Д/Н".
    •
    Метод close() должен закрывать поток только в случае, если считает с консоли ответ "Д".
    */

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream object;

    public QuestionFileOutputStream(AmigoOutputStream object) {
        this.object = object;
    }

    @Override
    public void flush() throws IOException {
        object.flush();
    }

    @Override
    public void write(int b) throws IOException {
        object.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        object.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        object.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String letter = reader.readLine();

        if (letter.equals("Д")) {
            reader.close();
        }
        object.close();
    }
}


