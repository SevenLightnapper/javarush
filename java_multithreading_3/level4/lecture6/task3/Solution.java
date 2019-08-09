package javarush.java_multithreading_3.level4.lecture6.task3;

import java.util.List;

/*
Интернет-магазин продажи джинсов
*/
public class Solution {

    public static List<Jeans> allJeans = Util.getAllJeans();

    public static void main(String[] args) {
        for (Jeans jeans : allJeans) {
            System.out.println(jeans);
        }
    }

}

