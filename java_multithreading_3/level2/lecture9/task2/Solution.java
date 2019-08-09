package javarush.java_multithreading_3.level2.lecture9.task2;
/*
package com.javarush.task.task22.task2208;
*/
import java.util.HashMap;
import java.util.Map;

/*
Формируем WHERE
*/
/*
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{name=Ivanov, country=Ukraine, city=Kiev, age=null}

Результат:
name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'
Требования:

    •
    Метод getQuery должен принимать один параметр типа Map.
    •
    Метод getQuery должен иметь тип возвращаемого значения String.
    •
    Метод getQuery должен быть статическим.
    •
    Метод getQuery должен возвращать строку сформированную по правилам описанным в условии задачи.
    */

public class Solution {
    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);
        System.out.println(params);
        System.out.println(getQuery(params));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                sb.append(" and ").append(pair.getKey()).append(" = '").append(pair.getValue()).append("'");
            }
        }
        sb.delete(0, 5);

        return sb.toString();
    }
}

