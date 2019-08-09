package javarush.java_syntax_1.level9.lecture6.task1;
/*
package com.javarush.Task.task09.task0907;
*/
/*
Исключение при работе с числами
*/
/*
Перехватить исключение, возникающее при выполнении кода:
int a = 42 / 0;
Вывести на экран тип перехваченного исключения.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {//напишите тут ваш код
            int a = 42 / 0;
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException has been caught. We tried to divide by 0");//напишите тут ваш код
        }
    }
}

