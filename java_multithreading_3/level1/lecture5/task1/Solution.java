package javarush.java_multithreading_3.level1.lecture5.task1;
/*
package com.javarush.task.task21.task2104;
*/
import java.util.HashSet;
import java.util.Set;

/*
Equals and HashCode
*/
/*
В классе Solution исправить пару методов equals/hashCode в соответствии с правилами реализации этих методов(детали уточни у своего любимого поисковика).
Обе строки first и last должны принимать участие в сравнении с помощью метода equals и вычислении hashcode.
Метод main не участвует в тестировании.
Требования:

    •
    Хешкоды одинаковых объектов должны быть равны.
    •
    Метод equals должен проверять равен ли переданный объект текущему(сравнение через ==).
    •
    Метод equals должен проверять является ли переданный объект объектом класса Solution.
    •
    Метод equals должен возвращать true в случае, если поля first и last равны у переданного объекта и текущего(не забудь что они могут быть равны null).
    •
    Должно быть обеспечено корректное поведение HashSet с типом элементов Solution.
    */

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object n) {
        if (n == null) return false;
        if (this == n) return true;
        if (n == null || getClass() != n.getClass()) return false;
        if (!(n instanceof Solution)) return false;
        Solution sol = (Solution) n;
        return  (first == sol.first || (first!=null && first.equals(sol.first))) &&
                (last  == sol.last  || (last !=null && last.equals(sol.last)));
    }

    public int hashCode() {
        return 31 * (first == null?0:first.hashCode()) + (last==null?0:last.hashCode());
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}

