package javarush.java_core_2.level8.lecture8.task3;
/*
package com.javarush.task.task18.task1813;
*/
/*
import org.jetbrains.annotations.NotNull;
*/
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
AmigoOutputStream
*/
/*
1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используй наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 Вызвать метод flush().
2.2 Дописать следующий текст "JavaRush © All rights reserved.", используй метод getBytes().
2.3 Закрыть поток методом close().
Требования:

    •
    Метод main изменять нельзя.
    •
    Класс AmigoOutputStream должен наследоваться от класса FileOutputStream.
    •
    Класс AmigoOutputStream должен принимать в конструкторе объект типа FileOutputStream.
    •
    Все методы write(), flush(), close() в классе AmigoOutputStream должны делегировать свое выполнение объекту FileOutputStream.
    •
    Метод close() должен сначала вызвать метод flush(), затем дописать текст, затем закрыть поток.
    */

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream name;

    public AmigoOutputStream(FileOutputStream name) throws FileNotFoundException {
        super(fileName);
        this.name = name;
    }

    @Override
    public void write(int b) throws IOException {
        name.write(b);
    }

    @Override
    public void write(/*@NotNull*/ byte[] b) throws IOException {   //@NotNull isn't used here because it isn't used at JavaRush site
        name.write(b);
    }

    @Override
    public void write(/*@NotNull*/ byte[] b, int off, int len) throws IOException {  //@NotNull isn't used here because it isn't used at JavaRush site
        name.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        name.flush();
    }

    @Override
    public void close() throws IOException {
        name.flush();
        String string = "JavaRush © All rights reserved.";
        name.write(string.getBytes());
        name.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}

