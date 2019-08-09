package javarush.java_collections_4.level1.lecture8.task1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
package com.javarush.task.task31.task3107;
*/
/*
Null Object Pattern
*/
public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) {
        try {
            Path path = Paths.get(pathToFile);

            fileData = new ConcreteFileData(Files.isHidden(path), Files.isExecutable(path), Files.isDirectory(path), Files.isWritable(path));
        }
        catch (Exception e) {
            fileData = new NullFileData(e);
        }
    }

    public FileData getFileData() {
        return fileData;
    }
}

