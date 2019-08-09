package javarush.java_core_2.level8.lecture8.task2;
/*
package com.javarush.task.task18.task1812;
*/
import java.io.IOException;
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

public interface AmigoOutputStream {
    void flush() throws IOException;

    void write(int b) throws IOException;

    void write(byte[] b) throws IOException;

    void write(byte[] b, int off, int len) throws IOException;

    void close() throws IOException;
}

