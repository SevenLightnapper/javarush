package javarush.java_syntax_1.level9.lecture11.task3;
/*
package com.javarush.Task.task09.task0921;
*/
import java.util.ArrayList;
import java.util.Scanner;

/*
Метод в try..catch
*/
/*
Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Код внутри readData обернуть в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            try{
                list.add(sc.nextInt());
            }catch(Exception e){
                for(int i = 0; i < list.size(); i++){
                    System.out.println(list.get(i));
                }
                break;
            }
        }
    }
}
