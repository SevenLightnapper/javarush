package javarush.java_multithreading_3.level1.lecture10.task2;
/*
package com.javarush.task.task21.task2111;
*/
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/*
Освобождаем ресурсы
*/
/*
Реализуй метод finalize, предварительно обдумав, что именно в нем должно быть.
Проведи рефакторинг метода getUsers в соответствии с java7 try-with-resources.
Требования:

    •
    Метод finalize в классе Solution должен содержать вызов super.finalize().
    •
    Метод finalize в классе Solution должен корректно завершаться в случае, если значение поля connection равно null.
    •
    Метод finalize в классе Solution должен закрывать текущее соединение, если значение поля connection не равно null.
    •
    Метод getUsers должен корректно использовать try-with-resources.
    */

public class Solution {
    private Connection connection;

    public Solution(Connection connection) {
        this.connection = connection;
    }

    public void finalize() throws Throwable {
        if (this.connection == null) {
            super.finalize();
        } else if (this.connection != null) {
            connection.close();
        }
    }

    public List<User> getUsers() {
        String query = "select ID, DISPLAYED_NAME, LEVEL, LESSON from USER";

        List<User> result = new LinkedList();

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)){
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("DISPLAYED_NAME");
                int level = rs.getInt("LEVEL");
                int lesson = rs.getInt("LESSON");

                result.add(new User(id, name, level, lesson));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            result = null;
        }
        return result;
    }

    public static class User {
        private int id;
        private String name;
        private int level;
        private int lesson;

        public User(int id, String name, int level, int lesson) {
            this.id = id;
            this.name = name;
            this.level = level;
            this.lesson = lesson;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", level=" + level +
                    ", lesson=" + lesson +
                    '}';
        }
    }

    public static void main(String[] args) {

    }
}

