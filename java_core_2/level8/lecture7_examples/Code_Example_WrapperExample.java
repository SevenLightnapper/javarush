package javarush.java_core_2.level8.lecture7_examples;

import java.io.*;

public class Code_Example_WrapperExample {

    public static void main(String[] args) throws IOException
    {
        //кладем данные в строку
        StringBuilder sb = new StringBuilder();
        sb.append("Lena").append('\n');
        sb.append("Olya").append('\n');
        sb.append("Anya").append('\n');
        String data = sb.toString();

        //Оборачиваем строку в класс ByteArrayInputStream

        // Создаем переменную абстрактного класса, описывающего поток ввода
        //(переменная is) и записываем в нее поток, позваоляющий использовать
        // массив байтов в качестве источника (new ByteArrayInputStream(data.getBytes()))
        // data.getBytes() - формирует последовательность байтов из переменной data
        InputStream is = new ByteArrayInputStream(data.getBytes());

        //подменяем in
        System.setIn(is);

        //вызываем обычный метод, который не подозревает о наших манипуляциях
        readAndPrintLine();
    }

    public static void readAndPrintLine() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true)
        {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        isr.close();
    }
}
