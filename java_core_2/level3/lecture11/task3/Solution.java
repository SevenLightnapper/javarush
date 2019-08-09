package javarush.java_core_2.level3.lecture11.task3;
/*
package com.javarush.Task.task13.task1318;
*/
import java.io.*;

/*
Чтение файла
*/
/*
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(reader.readLine());

        while (inStream.available() > 0){
            int data = inStream.read();
            System.out.write(data);
        }
        reader.close();
        inStream.close();

    }
}
