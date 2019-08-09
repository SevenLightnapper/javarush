package javarush.java_core_2.level9.lecture11.task5;
/*
package com.javarush.task.task19.task1923;
*/
/*
Слова с цифрами
*/
/*
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со словами, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
Закрыть потоки.
Требования:

    •
    Программа НЕ должна считывать данные с консоли.
    •
    Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
    •
    Поток чтения из файла (FileReader) должен быть закрыт.
    •
    Программа должна записывать во второй файл все слова из первого файла которые содержат цифры (используй FileWriter).
    •
    Поток записи в файл (FileWriter) должен быть закрыт.
    */
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fw = new BufferedWriter(new FileWriter(args[1]));
        String line = "";
        String digit_words = "";
        while((line = fr.readLine()) != null){
            String[] parts_line = line.split(" ");
            for(int i = 0; i < parts_line.length; i++) {
                if (parts_line[i].matches("\\S*\\d+\\S*")) {
                    fw.write(parts_line[i] + " ");
                }
            }
        }
        fr.close();
        fw.close();
    }
}

