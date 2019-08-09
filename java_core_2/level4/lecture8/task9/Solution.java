package javarush.java_core_2.level4.lecture8.task9;
/*
package com.javarush.Task.task14.task1417;
*/
import java.util.ArrayList;
import java.util.List;

/*
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new USD(65.11));
            allMoney.add(new Ruble(25.23));
            allMoney.add(new Hrivna(13.01));//напишите тут ваш код
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

