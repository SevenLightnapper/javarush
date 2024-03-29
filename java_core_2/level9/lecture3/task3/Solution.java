package javarush.java_core_2.level9.lecture3.task3;
/*
package com.javarush.task.task19.task1903;
*/
/*
Адаптация нескольких интерфейсов
*/
/*
Адаптируй IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости (смотри примеры).
Обратите внимание на формат вывода фамилии и имени человека.
Требования:

    •
    Класс Solution должен содержать public static поле countries типа Map<String, String>.
    •
    В статическом блоке класса Solution инициализируй поле countries тестовыми данными согласно заданию.
    •
    Класс IncomeDataAdapter должен реализовывать интерфейсы Customer и Contact.
    •
    Класс IncomeDataAdapter должен содержать приватное поле data типа IncomeData.
    •
    Класс IncomeDataAdapter должен содержать конструктор с параметром IncomeData.
    •
    В классе IncomeDataAdapter реализуй методы интерфейсов Customer и Contact используя подсказки в виде комментариев в интерфейсах.
    */

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        Solution.countries.put("UA", "Ukraine");
        Solution.countries.put("RU", "Russia");
        Solution.countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData){
            data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String number = String.valueOf(data.getPhoneNumber());
            while (number.length() < 10)
            {
                number = "0" + number;
            }
            String str = "+" + data.getCountryPhoneCode() + "(" + number.substring(0,3) + ")" + number.substring(3,6) + "-" + number.substring(6,8) + "-" + number.substring(8,10);
            return str;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}
