package javarush.java_collections_4.level9.lecture9.task1;
/*
package com.javarush.task.task39.task3901;
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
Уникальные подстроки
*/
/*
Реализуй метод lengthOfLongestUniqueSubstring таким образом, чтобы он возвращал длину самой длинной подстроки без повторяющихся символов, найденной в строке полученной в качестве параметра.
Например, для строки "a123bcbcqwe" - 6, а для строки "ttttwt" - 2.
Если анализируемая строка пуста или равна null - верни 0.
Требования:

    •
    Метод lengthOfLongestUniqueSubstring должен возвращать длину подстроки с максимальным количеством уникальных символов.
    •
    Метод lengthOfLongestUniqueSubstring должен возвращать 0 для пустой строки, или строки равной null.
    •
    Метод lengthOfLongestUniqueSubstring должен быть публичным.
    •
    Метод lengthOfLongestUniqueSubstring должен быть статическим.
    */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input your string: ");
        String s = bufferedReader.readLine();
        //String s = "a123bcbccaa67890kuu";
        //String s = "ttttwt";

        System.out.println("The longest unique substring length is: \n" + lengthOfLongestUniqueSubstring(s));
    }

    public static int lengthOfLongestUniqueSubstring(String s) {
        int max = 1;
        int count = 1;
        if (s == null || s.length()==0) return 0;
        if(s.length()==1)return 1;
        for (int i = 0; i < s.length(); i++) {
            Set set = new HashSet();
            set.add(s.charAt(i));
            count=1;
            for (int j = i + 1; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    set.clear();
                    break;
                } else {
                    set.add(s.charAt(j));
                    count++;
                    if(count>max)max=count;
                }
            }
        }
        return max;
    }
}