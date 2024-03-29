package javarush.java_core_2.level5.lecture12.task8;
/*
package com.javarush.task.task15.task1526;
*/
/*
Дебаг, дебаг, и еще раз дебаг
*/
/*
Программа выводит 0 9, а должна 6 9. Найди одну! ошибку и исправь.
Используй дебаг. Для этого поставь breakpoint-ы(Ctrl+F8), потом зайди в меню Run -> Debug.
F9 - выполнение кода до следующего breakpoint-а
F8 - переход к следующей строке кода

Требования:
    •
    Программа должна выводить данные на экран.
    •
    Вывод на экран должен соответствовать условию задачи.
    •
    Метод initialize в классе A должен иметь самый строгий модификатор доступа.
    •
    Программа не должна считывать данные с клавиатуры.
    */

public class Solution {
    public static void main(String[] args) {
        new B(6);
    }

    public static class A {
        private int f1 = 7;

        private A(int f1) {
            this.f1 = f1;
            initialize();
        }

        private void initialize() {
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        public B(int f1) {
            super(f1);
            this.f1 += f1;
            initialize(this.f1);
        }

        protected void initialize(int f1) {
            System.out.println(f1);
        }
    }
}
