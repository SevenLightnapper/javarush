package javarush.java_multithreading_3.level6.lecture8.task2;
/*
package com.javarush.task.task26.task2608;
*/
/*
Мудрый человек думает раз, прежде чем два раза сказать
*/
/*
Все методы, кроме метода main, класса Solution должны быть thread safe.
Сделайте так, чтобы оба метода могли выполняться одновременно двумя различными тредами.
synchronized(this) для этого не подходит, используй другой объект для лока.
Требования:

    •
    Класс Solution должен содержать метод getSumOfVar1AndVar2().
    •
    Класс Solution должен содержать метод getSumOfVar3AndVar4().
    •
    Метод getSumOfVar1AndVar2() должен содержать synchronized блок.
    •
    Метод getSumOfVar3AndVar4() должен содержать synchronized блок.
    •
    Synchronized блоки методов getSumOfVar1AndVar2() и getSumOfVar3AndVar4() должны использовать мьютексы разных объектов.
    */

public class Solution {
    int var1;
    int var2;
    int var3;
    int var4;

    public Solution(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public int getSumOfVar1AndVar2() {
        synchronized ( Solution.class.cast(var1) ) {
            return var1 + var2;
        }
    }

    public int getSumOfVar3AndVar4() {
        synchronized ( Solution.class.cast(var3) ) {
            return var3 + var4;
        }
    }

    public static void main(String[] args) {

    }
}

