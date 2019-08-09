package javarush.java_multithreading_3.level3.lecture8.task3;
/*
package com.javarush.task.task23.task2309;
*/
import javarush.java_multithreading_3.level3.lecture8.task3.vo.*;

import java.util.List;

/*
Анонимность иногда так приятна!
*/
/*
1. В пакете vo создайте public классы User, Location, Server, Subject, Subscription,
 которые наследуются от NamedItem
2. В классе Solution для каждого класса создайте свой метод,
 который возвращает список экземпляров класса.

Например, для класса User это будет - public List<User> getUsers()
Для класса Location это будет - public List<Location> getLocations()

3. Внутри каждого такого метода создайте анонимный класс от AbstractDbSelectExecutor
 и вызовите его нужный метод.
Подсказка:
тело метода должно начинаться так: return new AbstractDbSelectExecutor

4. Пример вывода для User и Location:
Id=5, name='User-5', description6_7=Received from executing 'SELECT * FROM USER'
Id=1, name='Location-1', description6_7=Received from executing 'SELECT * FROM LOCATION'

5. Проанализируйте пример вывода и сформируйте правильный query для всех классов.
Требования:

    •
    В пакете vo должен быть создан public класс User, унаследованный от класса NamedItem.
    •
    В пакете vo должен быть создан public класс Location, унаследованный от класса NamedItem.
    •
    В пакете vo должен быть создан public класс Server, унаследованный от класса NamedItem.
    •
    В пакете vo должен быть создан public класс Subject, унаследованный от класса NamedItem.
    •
    В пакете vo должен быть создан public класс Subscription, унаследованный от класса NamedItem.
    •
    В методе getUsers должен быть создан объект класса AbstractDbSelectExecutor с параметром типа User.
    •
    В методе getUsers должен быть создан объект класса AbstractDbSelectExecutor с параметром типа Location.
    •
    В методе getUsers должен быть создан объект класса AbstractDbSelectExecutor с параметром типа Server.
    •
    В методе getUsers должен быть создан объект класса AbstractDbSelectExecutor с параметром типа Subject.
    •
    В методе getUsers должен быть создан объект класса AbstractDbSelectExecutor с параметром типа Subscription.
    •
    Метод getUsers должен возвращать корректный список(в соответствии с условием задачи).
    •
    Метод getLocations должен возвращать корректный список(в соответствии с условием задачи).
    •
    Метод getServers должен возвращать корректный список(в соответствии с условием задачи).
    •
    Метод getSubjects должен возвращать корректный список(в соответствии с условием задачи).
    •
    Метод getSubscriptions должен возвращать корректный список(в соответствии с условием задачи).
    */

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        print(solution.getUsers());
        print(solution.getLocations());
        print(solution.getSubscriptions());
    }

    public static void print(List list) {
        String format = "Id=%d, name='%s', description6_7=%s";
        for (Object obj : list) {
            NamedItem item = (NamedItem) obj;
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }



    public List<User> getUsers(){
        return new AbstractDbSelectExecutor<User>() {
            public String getQuery() {
                return "SELECT * FROM USER";
            }
        }.execute();

    }
    public List<Server> getServers(){
        return new AbstractDbSelectExecutor<Server>() {
            public String getQuery() {
                return "SELECT * FROM SERVER";
            }
        }.execute();
    }

    public List<Location> getLocations(){
        return new AbstractDbSelectExecutor<Location>() {
            public String getQuery() {
                return "SELECT * FROM LOCATION";
            }
        }.execute();
    }
    public List<Subject> getSubjects(){
        return new AbstractDbSelectExecutor<Subject>() {
            public String getQuery() {
                return "SELECT * FROM SUBJECT";
            }
        }.execute();
    }
    public List<Subscription> getSubscriptions(){
        return new AbstractDbSelectExecutor<Subscription>() {
            public String getQuery() {
                return "SELECT * FROM SUBSCRIPTION";
            }
        }.execute();
    }
}

