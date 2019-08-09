package javarush.java_multithreading_3.level3.lecture4.task3;
/*
package com.javarush.task.task23.task2304;
*/
/*
Inner 3
*/
/*
Внутри класса Solution:
1) реализуйте private class TaskDataProvider используя Task и MockDB, цель которого - обновить поле tasks.
2) реализуйте private class NameDataProvider используя String и MockDB, цель которого - обновить поле names.
Требования:

    •
    Класс TaskDataProvider должен быть создан внутри класса Solution и быть приватным.
    •
    Класс NameDataProvider должен быть создан внутри класса Solution и быть приватным.
    •
    Класс TaskDataProvider должен реализовывать интерфейс DbDataProvider с параметром типа Task.
    •
    Класс NameDataProvider должен реализовывать интерфейс DbDataProvider с параметром типа String.
    •
    Метод refreshAllData в классе TaskDataProvider должен сохранять в список tasks результат работы метода getFakeTasks класса MockDB.
    •
    Метод refreshAllData в классе NameDataProvider должен сохранять в список names результат работы метода getFakeNames класса MockDB.
    */

import java.util.List;
import java.util.Map;

public class Solution {

    private List<Task> tasks;
    private List<String> names;

    private DbDataProvider taskDataProvider = new TaskDataProvider();
    private DbDataProvider nameDataProvider = new NameDataProvider();

    public void refresh() {
        Map taskCriteria = MockView.getFakeTaskCriteria();
        taskDataProvider.refreshAllData(taskCriteria);

        Map nameCriteria = MockView.getFakeNameCriteria();
        nameDataProvider.refreshAllData(nameCriteria);
    }

    private interface DbDataProvider<T> {
        void refreshAllData(Map criteria);
    }

    class Task extends MockDB {
    }

    private class NameDataProvider implements DbDataProvider<String>{

        @Override
        public void refreshAllData(Map criteria) {
            names = MockDB.getFakeNames(criteria);
        }
    }

    private class TaskDataProvider implements DbDataProvider<Task>{

        @Override
        public void refreshAllData(Map criteria) {
            tasks = MockDB.getFakeTasks(criteria);

        }
    }

    public static void main(String[] args) {

    }
}
