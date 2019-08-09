package javarush.java_syntax_1.level10.lecture11.task5;
/*
package com.javarush.Task.task10.task1012;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Количество букв
*/
/*
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // FIRST VARIANT. MORE COMPLICATED.
        int[] count = new int[alphabet.size()]; //создаем массив для подсчета букв

        for (int g =0;g<list.size();g++) //цикл для прохода по списку введенных строк

        {
            char[] yy = list.get(g).toCharArray(); //создаем массив символов для хранения полученной строки
            for (int u=0;u<yy.length;u++) // проходим по полученному массиву
            {
                for (int q=0;q<abcArray.length;q++)
                    if (yy[u]==abcArray[q])  // Если элемент не является буквой русского алфавита, он пропукскается, в противном случае значение индекса буквы увеличивается
                        count[alphabet.indexOf(yy[u])]++;
            }
        }
        for (int r=0;r<alphabet.size();r++) // вывод списка + массив
        {
            System.out.print(alphabet.get(r)+" ");
            System.out.print(count[r]);
            System.out.println();
        }
        /*
        SECOND VARIANT. MORE COMPACT AND SIMPLE
        for(Character ch : alphabet){ //перебрали алфавит
            int count = 0;
            for(String string : list){ //перебрали строки введенные с клавиатуры
                char[] chars = string.toCharArray(); //каждую строку разбираем на массив
                for(char c : chars){ //перебираем массив
                    if(ch == c){
                    count++;
                    }
            }
        }
        System.out.println(ch + " " + count);
        }
         */
    }
}
