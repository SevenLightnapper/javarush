package javarush.java_collections_4.level8.lecture8.task2;
/*
package com.javarush.task.task38.task3808;
*/
import java.util.ArrayList;
import java.util.List;

/*
Неверные аннотации
*/
/*
Исправь неверные аннотации. Код должен компилироваться без ошибок и предупреждений.

Избегай избыточности. Не нужно писать подряд все знакомые тебе аннотации.
Требования:

    •
    Аннотация @Main должна использоваться только для аннотирования методов.
    •
    Метод main класса Solution должен быть отмечен только аннотацией @Main.
    •
    Метод overriddenMethod класса SubSolution должен быть отмечен только аннотацией @Override.
    •
    В методе uncheckedCall должны быть подавлены unchecked warnings с помощью аннотации.
    */

public class Solution {

    @Main
    public static void main(String[] args) {
        Solution solution = new Solution().new SubSolution();
        solution.overriddenMethod();
    }

    public void overriddenMethod() {
    }

    public class SubSolution extends Solution {
        @Override
        public void overriddenMethod() {
            System.out.println(uncheckedCall());
        }

        @SuppressWarnings("unchecked")
        List uncheckedCall() {
            List list = new ArrayList();
            list.add("hello");
            return list;
        }
    }


}

