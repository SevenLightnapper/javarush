package javarush.java_syntax_1.level7.lecture12.task4;
/*
package com.javarush.Task.task07.task0722;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
*/
/*
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();//напишите тут ваш код
        String end = "end";
        for(int i = 0; ;i++){
            String s = reader.readLine();
            list.add(s);
            if(s.equals(end)){
                list.remove("end");
                for(int a = 0; a < list.size(); a++){
                    System.out.println(list.get(a));
                }
                break;
            }
        }
    }
}
