package javarush.java_core_2.level9.lecture7_examples;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
— Привет, Амиго! Сегодня я расскажу как сделать новую интересную штуку — подменить объект System.out.
System.out — это статическая переменная out типа PrintStream в классе System.
Эта переменная имеет модификатор final, так что просто так новое значение ей не присвоить.
Но класс System имеет для этого специальный метод setOut(PrintStream stream). Им то мы и воспользуемся.

— Интересно. А на что мы его заменим?

— Нам нужен какой-то объект, куда можно будет собирать выведенные данные. Лучше всего на эту роль подойдет ByteArrayOutputStream.
Это специальный класс, который с одной стороны является динамическим (растягиваемым) массивом, а с другой – реализует интерфейс OutputStream.
 */

public class Example_1 {

    public static void main(String[] args) throws Exception
    {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        //Возвращаем все как было
        System.setOut(consoleStream);

        // Выводим полученную строку на экран
        System.out.println(result);
    }

    public static void printSomething()
    {
        System.out.println("Hi");
        System.out.println("My name is Amigo");
        System.out.println("Bye-bye!");
    }
}
