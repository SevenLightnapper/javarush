package javarush.java_core_2.level9.lecture3.task5;
/*
package com.javarush.task.task19.task1905;
*/
import java.util.HashMap;
import java.util.Map;

/*
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        Solution.countries.put("UA", "Ukraine");
        Solution.countries.put("RU", "Russia");
        Solution.countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String key = null;
            for (Map.Entry<String, String> pair : countries.entrySet()) {
                if (pair.getValue().equals(this.customer.getCountryName())) {
                    key = pair.getKey();
                }
            }
            return key;
        }

        @Override
        public String getCompany() {
            return this.customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] name = this.contact.getName().split(", ");
            return name[1];
        }

        @Override
        public String getContactLastName() {
            String[] name = this.contact.getName().split(", ");
            return name[0];
        }

        @Override
        public String getDialString() {
            String a = contact.getPhoneNumber();
            String phone = "callto://+";

            for (int i = 0; i < a.length(); i++){
                if (Character.isDigit(a.charAt(i))){
                    phone += a.charAt(i);
                }
            }
            return phone;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA
        String getCompany();            //For example: JavaRush Ltd.
        String getContactFirstName();   //For example: Ivan
        String getContactLastName();    //For example: Ivanov
        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.
        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan
        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}
