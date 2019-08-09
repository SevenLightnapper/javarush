package javarush.java_core_2.level3.lecture2.task7;
/*
package com.javarush.Task.task13.task1307;
*/
/*
Параметризованый интерфейс
*/
/*
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject //допишите здесь ваш код
    {

        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}
