package javarush.java_multithreading_3.level5.lecture2.task3;

/*
Реализуй интерфейс Columnable у Column, описание методов смотрите в джавадоках.
Реализуй логику метода Column.getVisibleColumns.
Метод Column.configureColumns уже реализован, его не меняй.
Создавать дополнительные поля нельзя.
Метод main не участвует в тестировании.
Требования:

    •
    Интерфейс Columnable менять нельзя.
    •
    Класс Column должен реализовывать интерфейс Columnable.
    •
    Создавать дополнительные поля в классе Column нельзя.
    •
    Метод Column.configureColumns реализован. Менять его не нужно.
    •
    Метод Column.getVisibleColumns должен возвращать список отображаемых колонок в скофигурированом порядке.
    •
    Метод Column.getColumnName должен возвращать полное имя колонки.
    •
    Метод Column.isShown должен возвращать true, если колонка видимая, иначе false.
    •
    Метод Column.hide должен скрывать колонку и сдвигать индексы остальных отображаемых колонок.
    */

import java.util.LinkedList;
import java.util.List;

public enum Column implements Columnable {
    Customer("Customer"),
    BankName("Bank Name"),
    AccountNumber("Account Number"),
    Amount("Available Amount");

    private String columnName;

    private static int[] realOrder;

    private Column(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Задает новый порядок отображения колонок, который хранится в массиве realOrder.
     * realOrder[индекс в энуме] = порядок отображения; -1, если колонка не отображается.
     *
     * @param newOrder новая последовательность колонок, в которой они будут отображаться в таблице
     * @throws IllegalArgumentException при дубликате колонки
     */
    public static void configureColumns(Column... newOrder) {
        realOrder = new int[values().length];
        for (Column column : values()) {
            realOrder[column.ordinal()] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {
                    if (isFound) {
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal()] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Вычисляет и возвращает список отображаемых колонок в сконфигурированом порядке (см. метод configureColumns)
     * Используется поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns() {
        List<Column> result = new LinkedList<>();
        for (int i = 0; i < realOrder.length ; i++) {
            if(realOrder[i] != -1)
                result.add(Column.values()[i]);
        }
        result.sort((column, t1) -> (realOrder[column.ordinal()] >= realOrder[t1.ordinal()])? 1: -1);
        return result;
    }



    @Override
    public String getColumnName() {
        return this.columnName;
    }

    @Override
    public boolean isShown() {
        return realOrder[this.ordinal()] != -1;
    }

    @Override
    public void hide() {
        realOrder[this.ordinal()] = -1;
    }
}

