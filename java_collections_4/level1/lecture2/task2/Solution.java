package javarush.java_collections_4.level1.lecture2.task2;
/*
package com.javarush.task.task31.task3102;
*/

import java.io.File;
import java.io.IOException;
import java.util.*;

/*
Находим все файлы
*/
/*
Реализовать логику метода getFileTree, который должен в директории root найти список всех файлов включая вложенные.
Используй очередь, рекурсию не используй.
Верни список всех путей к найденным файлам, путь к директориям возвращать не надо.
Путь должен быть абсолютный.
Требования:

    •
    Метод getFileTree должен принимать аргументом String root, по которому нужно найти все вложенные файлы.
    •
    Метод getFileTree должен возвращать список строк.
    •
    Нужно реализовать метод getFileTree: найти все файлы по указанному пути и добавить их в список.
    •
    Метод getFileTree должен быть вызван только 1 раз (рекурсию не использовать).
    */

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> fileList = new ArrayList<>();
        Stack<File> stack = new Stack<>();
        File rootDir = new File(root);
        stack.push(rootDir);
        while (!stack.isEmpty()) {
            File child = stack.pop();
            if (child.isDirectory()) {
                for (File f : child.listFiles()) {
                    stack.push(f);
                }
            } else if (child.isFile()) {
                fileList.add(child.getAbsolutePath());
            }
        }
        return fileList;
    }

    public static void main(String[] args) throws IOException {
        List<String> fileList = getFileTree("C:\\Users\\User\\IdeaProjects\\untitled\\src\\JavaRush_Tasks\\java_collections_4\\level1\\lecture2\\task2");
        for (String s : fileList) {
            System.out.println(s);
        }
    }
}