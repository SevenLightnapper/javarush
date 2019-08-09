package javarush.java_syntax_1.level7.lecture9.task6;
/*
package com.javarush.Task.task07.task0718;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
*/
/*
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for(int i = 0; i < list.size(); i++){
            if(i == 9){
                break;
            }
            if (list.get(i).length() < list.get(i+1).length() && i != 9){
               continue;
            }
            else if (list.get(i).length() >= list.get(i+1).length() && i !=9) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
