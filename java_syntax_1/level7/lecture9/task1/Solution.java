package javarush.java_syntax_1.level7.lecture9.task1;
/*
package com.javarush.Task.task07.task0713;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Играем в Jолушку
*/
/*
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран.
Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        ArrayList<Integer> list = new ArrayList<Integer>(); //full list
        for (int i = 0; i < 20; i++){
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        ArrayList<Integer> three = new ArrayList<Integer>(); //list - numbers divide by 3 and nothing's left
        ArrayList<Integer> two = new ArrayList<Integer>(); // list - numbers divide by 2 and nothing's left
        ArrayList<Integer> rest = new ArrayList<Integer>();// list - the rest of the numbers

        for (Integer x : list) {
            if (x % 2 == 0 && x % 3 ==0){
                two.add(x);
                three.add(x);
            }
            else if (x % 3 == 0) {
                three.add(x);
            }
            else if (x % 2 == 0) {
                two.add(x);
            }
            else
                rest.add(x);
        }
        printList(three);
        printList(two);
        printList(rest);
    }

    public static void printList(List<Integer> list) {
        for (int i = list.size(); i > 0; i--){
            int j = list.size() - i;//напишите тут ваш код
            System.out.println(list.get(j));
        }
    }
}

