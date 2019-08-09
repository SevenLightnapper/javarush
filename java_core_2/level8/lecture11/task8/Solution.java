package javarush.java_core_2.level8.lecture11.task8;
/*
package com.javarush.task.task18.task1823;
*/
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
*/
/*
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.
Требования:

    •
    Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
    •
    Для каждого файла создай нить ReadThread и запусти ее.
    •
    После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
    •
    Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
    •
    Поток для чтения из файла в каждой нити должен быть закрыт.
    */

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName;

        while (true) {
            fileName = reader.readLine();
            if (fileName.equals("exit")) { break; }
            new ReadThread(fileName).start();
        }

    }

    public static class ReadThread extends Thread {
        private volatile FileInputStream f;
        private volatile String fileName;

        public ReadThread(String fileName) throws IOException {
            f = new FileInputStream(fileName);
            this.fileName = fileName;
        } //implement constructor body

        @Override
        public void run() {
            HashMap<Integer, Integer> bufMap = new HashMap();
            Integer buf = 0;
            try {
                while (f.available() != 0) {
                    buf = f.read();
                    if (!bufMap.keySet().contains(buf)) bufMap.put(buf, 1);
                    else bufMap.replace(buf, bufMap.get(buf) + 1);
                }
            } catch (IOException e){}
            Integer max = 0;
            Integer maxkey = 0;
            for (Integer x : bufMap.keySet()) {
                if (bufMap.get(x) >= max) {
                    max = bufMap.get(x);
                    maxkey = x;
                }
            }
            synchronized (resultMap) {
                resultMap.put(fileName, maxkey);
            }
            try {
                f.close();
            } catch (IOException e){}
        } // implement file reading here - реализуйте чтение из файла тут
    }
}

