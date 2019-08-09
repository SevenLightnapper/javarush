package javarush.java_syntax_1.level7.lecture9.task4;
/*
package com.javarush.Task.task07.task0716;
*/
import java.util.ArrayList;

/*
Р или Л
*/
/*
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза

Выходные данные:
лира
лоза
лоза
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for( int i = list.size() - 1; i != -1; i--){
            if(list.get(i).contains("р") && !(list.get(i).contains("л"))){
                list.remove(i);
            }
            else if(list.get(i).contains("л") && !(list.get(i).contains("р"))){
                list.add(i, list.get(i));
            }
        }//напишите тут ваш код
        return list;
    }
}