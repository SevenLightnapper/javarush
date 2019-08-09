package javarush.java_collections_4.level1.lecture2.task3;
/*
package com.javarush.task.task31.task3111;
*/

import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new ArrayList<>();

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        boolean isFiltered = true;

        if (attrs.isDirectory())
            return FileVisitResult.CONTINUE;

        if (partOfName != null)
            isFiltered = file.getFileName().toString().contains(partOfName);
        if (partOfContent != null) {
            if (!new String(Files.readAllBytes(file)).contains(partOfContent))
                isFiltered = false;
        }
        if ((minSize != 0) && content.length < minSize)
            isFiltered = false;
        if (content.length > maxSize && (maxSize!=0))
            isFiltered = false;

        if (isFiltered)
            foundFiles.add(file);

        return super.visitFile(file, attrs);
    }
}