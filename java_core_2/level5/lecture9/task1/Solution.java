package javarush.java_core_2.level5.lecture9.task1;
/*
package com.javarush.task.task15.task1514;
*/
import java.util.HashMap;
import java.util.Map;

/*
Статики-1
*/
/*
В статическом блоке инициализировать labels 5 различными парами ключ-значение.
Требования:

    В классе Solution должен быть только один метод (main).
    В классе Solution должно быть объявлено статическое поле labels типа Map.
    Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
    Метод main должен выводить содержимое labels на экран.
    */

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        Solution.labels.put(35.10, "m");
        Solution.labels.put(41.09, "d");
        Solution.labels.put(15.02, "os");
        Solution.labels.put(4.01, "s");
        Solution.labels.put(3.01, "b");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}

