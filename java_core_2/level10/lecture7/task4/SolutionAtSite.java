package javarush.java_core_2.level10.lecture7.task4;
/*
package com.javarush.task.task20.task2014;
*/
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;

/*
Serializable Solution
*/
/*
Сериализуй класс Solution.
Подумай, какие поля не нужно сериализовать, пометь ненужные поля модификатором transient.
Объект всегда должен содержать актуальные итоговые данные.
Метод main не участвует в тестировании.

Написать код проверки самостоятельно в методе main:
1) создать файл, открыть поток на чтение (input stream) и на запись(output stream);
2) создать экземпляр класса Solution - savedObject;
3) записать в поток на запись savedObject (убедитесь, что они там действительно есть);
4) создать другой экземпляр класса Solution с другим параметром;
5) загрузить из потока на чтение объект - loadedObject;
6) проверить, что savedObject.string равна loadedObject.string;
7) обработать исключения.
Требования:

    •
    Поле pattern должно быть отмечено модификатором transient.
    •
    Поле currentDate должно быть отмечено модификатором transient.
    •
    Поле temperature должно быть отмечено модификатором transient.
    •
    Поле string НЕ должно быть отмечено модификатором transient.
    */

public class SolutionAtSite implements Serializable{
    public static void main(String[] args) {
        System.out.println(new Solution(4));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public SolutionAtSite(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
