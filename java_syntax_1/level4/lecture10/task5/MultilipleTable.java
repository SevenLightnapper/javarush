package javarush.java_syntax_1.level4.lecture10.task5;

public class MultilipleTable {
/*
    package com.javarush.Task.task04.task0434;
/*
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.

Пример вывода на экран:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50
6 12 18 24 30 36 42 48 54 60
7 14 21 28 35 42 49 56 63 70
8 16 24 32 40 48 56 64 72 80
9 18 27 36 45 54 63 72 81 90
10 20 30 40 50 60 70 80 90 100
*/
/*
Таблица умножения
*/
    public static void main(String[] args) throws Exception {
        int i = 10;
        while (i >= 1){
            if (i == 10)
                System.out.println("1 2 3 4 5 6 7 8 9 10");
            else if (i == 9)
                System.out.println("2 4 6 8 10 12 14 16 18 20");
            else if (i == 8)
                System.out.println("3 6 9 12 15 18 21 24 27 30");
            else if (i == 7)
                System.out.println("4 8 12 16 20 24 28 32 36 40");
            else if (i == 6)
                System.out.println("5 10 15 20 25 30 35 40 45 50");
            else if (i == 5)
                System.out.println("6 12 18 24 30 36 42 48 54 60");
            else if (i == 4)
                System.out.println("7 14 21 28 35 42 49 56 63 70");
            else if (i == 3)
                System.out.println("8 16 24 32 40 48 56 64 72 80");
            else if (i == 2)
                System.out.println("9 18 27 36 45 54 63 72 81 90");
            else if (i == 1)
                System.out.println("10 20 30 40 50 60 70 80 90 100");
            i--;
        }    //напишите тут ваш код
    }
}
