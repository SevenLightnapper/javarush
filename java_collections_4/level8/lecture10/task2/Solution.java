package javarush.java_collections_4.level8.lecture10.task2;
/*
package com.javarush.task.task38.task3810;
*/
/*
Реализуй аннотации
*/
/*
Проект должен компилироваться и выводить аннотацию класса Solution.
Класс Solution и его аннотацию не менять.
Аннотация Changelog должна быть видна во время выполнения.
Требования:

    •
    Вывод на экран должен соответствовать ожидаемому.
    •
    На экран должна быть выведена аннотация @Changelog класса Solution.
    •
    Аннотация @Changelog должна быть видна во время выполнения программы.
    •
    В классе Solution должен быть реализован метод main с одним параметром типа String[].
    */

@Changelog({
        @Revision(
                revision = 4089,
                date = @Date(year = 2011, month = 5, day = 30, hour = 18, minute = 35, second = 18),
                comment = "Новый файл добавлен"),
        @Revision(
                revision = 6018,
                date = @Date(year = 2013, month = 1, day = 1, hour = 0, minute = 0, second = 1),
                authors = {@Author(value = "Серега", position = Position.MIDDLE)},
                comment = "Фикс багов"),
        @Revision(
                revision = 10135,
                date = @Date(year = 2014, month = 12, day = 31, hour = 23, minute = 59, second = 59),
                authors = {@Author(value = "Диана", position = Position.OTHER),
                        @Author("Игорь"),
                        @Author(value = "Витек", position = Position.SENIOR)})
})
public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.class.getAnnotation(Changelog.class).toString());
    }
}

