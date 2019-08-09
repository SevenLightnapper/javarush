package javarush.java_syntax_1.level3.lecture12;

public class SumOfDigitsFromThreedigitNumber {
/*
    package com.javarush.Task.task01.task0132;
*/
/*
Сумма цифр трехзначного числа
*/
        public static void main(String[] args) {
            System.out.println(sumDigitsInNumber(546));
        }

        public static int sumDigitsInNumber(int number) {
            return number = (number/100)+(number%100/10)+(number%10);//напишите тут ваш код
        }

}
