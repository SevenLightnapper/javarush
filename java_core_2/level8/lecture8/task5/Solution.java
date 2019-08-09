package javarush.java_core_2.level8.lecture8.task5;
/*
package com.javarush.task.task18.task1815;
*/
import java.util.List;

/*
Таблица
*/
/*
Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для ATableInterface.
Метод setModel должен вывести в консоль количество элементов в новом листе перед обновлением модели.
Метод getHeaderText должен возвращать текст в верхнем регистре - используйте метод toUpperCase().
Требования:

    •
    Класс TableInterfaceWrapper должен реализовывать интерфейс ATableInterface.
    •
    Класс TableInterfaceWrapper должен инициализировать в конструкторе поле типа ATableInterface.
    •
    Метод setModel() должен вывести в консоль количество элементов в новом листе перед обновлением модели.
    •
    Метод getHeaderText() должен возвращать текст в верхнем регистре.
    •
    Метод setHeaderText() должен устанавливать текст для заголовка без изменений.
    */

public class Solution {

    public class TableInterfaceWrapper implements ATableInterface {
        private ATableInterface table;

        public TableInterfaceWrapper(ATableInterface table) {
            this.table = table;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            table.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return table.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            table.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
