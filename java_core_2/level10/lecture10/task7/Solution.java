package javarush.java_core_2.level10.lecture10.task7;
/*
package com.javarush.task.task20.task2022;
*/
import java.io.*;

/*
Переопределение сериализации в потоке
*/
/*
Сериализация/десериализация Solution не работает.
Исправь ошибки не меняя сигнатуры методов и класса.
Метод main не участвует в тестировании.

Написать код проверки самостоятельно в методе main:
1) создать экземпляр класса Solution
2) записать в него данные - writeObject
3) сериализовать класс Solution - writeObject(ObjectOutputStream out)
4) десериализовать, получаем новый объект
5) записать в новый объект данные - writeObject
6) проверить, что в файле есть данные из п.2 и п.5
Требования:

    •
    Поле stream должно быть объявлено с модификатором transient.
    •
    В методе writeObject(ObjectOutputStream out) не должен быть вызван метод close у потока полученного в качестве параметра.
    •
    В методе readObject(ObjectInputStream in) не должен быть вызван метод close у потока полученного в качестве параметра.
    •
    В методе readObject(ObjectInputStream in) поле stream должно быть инициализировано новым объектом типа FileOutputStream с параметрами(fileName, true).
    •
    В конструкторе класса Solution поле stream должно быть инициализировано новым объектом типа FileOutputStream с параметром(fileName).
    */

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution = new Solution("C:\\Users\\User\\IdeaProjects\\untitled\\src\\JavaRush_Tasks\\Java_Core\\level10\\lecture10\\task7\\file");
        ObjectOutputStream out = new ObjectOutputStream(solution.stream);
        solution.writeObject("Info");
        solution.writeObject(out);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(solution.fileName));
        Solution loadedSolution = new Solution("C:\\Users\\User\\IdeaProjects\\untitled\\src\\JavaRush_Tasks\\Java_Core\\level10\\lecture10\\task7\\file");
        loadedSolution = (Solution) in.readObject();
    }
}

