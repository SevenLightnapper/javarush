package javarush.java_core_2.level5.lecture2.task4;
/*
package com.javarush.task.task15.task1504;
*/
import java.util.LinkedList;
import java.util.List;

/*
ООП - книги
*/
/*
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].
Параметр конструктора - название книги (title).
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.

Требования:
    •
    Класс Solution должен содержать public static класс MarkTwainBook.
    •
    Класс MarkTwainBook должен быть потомком класса Book.
    •
    В классе MarkTwainBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
    •
    Конструктор класса MarkTwainBook должен вызывать конструктор класса предка (Book) с параметром "Mark Twain".
    •
    Метод getBook в классе MarkTwainBook должен иметь тип возвращаемого значения MarkTwainBook и возвращать текущий объект.
    •
    Класс Solution должен содержать public static класс AgathaChristieBook.
    •
    Класс AgathaChristieBook должен быть потомком класса Book.
    •
    В классе AgathaChristieBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
    •
    Конструктор класса AgathaChristieBook должен вызывать конструктор класса предка (Book) с параметром "Agatha Christie".
    •
    Метод getBook в классе AgathaChristieBook должен иметь тип возвращаемого значения AgathaChristieBook и возвращать текущий объект.
    •
    Метод getTitle в классах AgathaChristieBook и MarkTwainBook должен возвращать название конкретной книги.
    •
    Метод getOutputByBookType должен возвращать корректную строку для объектов типа AgathaChristieBook.
    •
    Метод getOutputByBookType должен возвращать корректную строку для объектов типа MarkTwainBook.
    •
    В классе MarkTwainBook должно быть создано поле title типа String (название книги).
    •
    В классе AgathaChristieBook должно быть создано поле title типа String (название книги).
    */
public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";

            //Add your code here
            if (this instanceof MarkTwainBook){
                return markTwainOutput;
            }
            if (this instanceof AgathaChristieBook){
                return agathaChristieOutput;
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book{
        // private String author="Mark Twain";
        private String title;


        public MarkTwainBook(String title){
            super("Mark Twain");
            this.title=title;

        }

        public MarkTwainBook getBook(){
            return this;
        }
        public String getTitle(){
            return this.title;
        }

    }
    public static class AgathaChristieBook extends Book{
        private String author="Agatha Christie";
        private String title;


        public AgathaChristieBook(String title){
            super("Agatha Christie");
            this.title=title;
        }

        public AgathaChristieBook getBook(){
            return this;
        }
        public String getTitle(){
            return this.title;
        }

    }
}
