package javarush.java_core_2.level8.lecture11.task10;
/*
package com.javarush.task.task18.task1825;
*/
import java.io.*;
import java.util.*;

/*
Собираем файл
*/
/*
Собираем файл из кусочков.
Считывать с консоли имена файлов.
Каждый файл имеет имя: [someName].partN.

Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.

Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].

Например, Lion.avi.

В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки.
Требования:

    •
    Программа должна считывать имена файлов с консоли, пока не будет введено слово "end".
    •
    Создай поток для записи в файл без суффикса [.partN] в папке, где находятся все считанные файлы.
    •
    В новый файл перепиши все байты из файлов-частей *.partN.
    •
    Чтение и запись должны происходить с использованием буфера.
    •
    Созданные для файлов потоки должны быть закрыты.
    •
    Не используй статические переменные.
    */

/*
Собираем файл
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String buf;
        BufferedOutputStream bos = null;
        String outName;

        try {

            while (!(buf = reader.readLine()).equals("end")) {
                Thread t = new ReadThread(buf);
                t.start();
                threads.add(t);

            }

            Collections.sort(threads, new Comparator<Thread>() {
                @Override
                public int compare(Thread o1, Thread o2) {
                    return getLastDidits(reverse(((ReadThread) o1).getFn().split("[.]")).get(0))
                            - getLastDidits(reverse(((ReadThread) o2).getFn().split("[.]")).get(0));
                }
            });


            String[] temp;
            String path = "";
            if (((ReadThread) threads.get(0)).getFn().contains("/")){
                temp = ((ReadThread) threads.get(0)).getFn().split("/");
                for (int i = 0; i < temp.length - 1; i++) {
                    path += temp[i] + "/";
                }
            } else{
                temp = ((ReadThread) threads.get(0)).getFn().split("[\\\\]");
                for (int i = 0; i < temp.length - 1; i++) {
                    path += temp[i] + "\\\\";
                }
            }

            String intermediate = temp[temp.length - 1].replace(".part1", "");
            outName = path + intermediate;
            bos = new BufferedOutputStream(new FileOutputStream(outName));
            List<Byte> lt = new ArrayList();
            for (Thread x : threads
            ) {
                lt = concat(lt,((ReadThread) x).getBuffer());

            }
            byte[] bbb = new byte[lt.size()];
            for (int i = 0; i < bbb.length; i++) {
                bbb[i] = lt.get(i);
            }
            bos.write(bbb, 0, bbb.length);

        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        } finally {
            try {
                reader.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> reverse(String[] arr) {
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        return list;
    }

    public static List<Byte> concat(List<Byte> list1, byte[] arr2) {

        for (int i = 0; i < arr2.length; i++) {
            list1.add(arr2[i]);
        }
        return list1;
    }


    public static int getLastDidits(String s) {
        return Integer.parseInt(s.replaceAll("part", ""));
    }

    public static class ReadThread extends Thread {
        private byte[] buffer;
        private String fn;
        BufferedInputStream bis;

        public String getFn() {
            return fn;
        }


        public ReadThread(String fn) throws FileNotFoundException {
            this.fn = fn;
            bis = new BufferedInputStream(new FileInputStream(fn));
        }

        public void run() {
            byte[] b;
            int size = 0;
            try {
                size = bis.available();
                b = new byte[size];
                bis.read(b);
                buffer = b;

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bis.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public byte[] getBuffer() {
            return buffer;
        }
    }
}

