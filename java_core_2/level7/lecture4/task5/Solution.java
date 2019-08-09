package javarush.java_core_2.level7.lecture4.task5;
/*
package com.javarush.task.task17.task1707;
*/
/*
МВФ
*/
/*
 Singleton паттерн - синхронизация в методе.
Класс IMF - это Международный Валютный Фонд.
Внутри метода getFund создайте синхронизированный блок.
Внутри синхронизированного блока инициализируйте поле imf так, чтобы метод getFund всегда возвращал один и тот же объект.
Требования:

    •
    Класс IMF должен содержать приватное статическое поле IMF imf.
    •
    Класс IMF должен содержать приватный конструктор.
    •
    Класс IMF должен содержать публичный статический метод IMF getFund().
    •
    Метод getFund() должен содержать синхронизированный блок.
    •
    Внутри синхронизированного блока должно быть проинициализировано поле imf.
    •
    Метод getFund() должен всегда возвращать один и тот же объект.
    */

public class Solution {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund );
    }
}
