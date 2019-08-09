package javarush.java_collections_4.level7.lecture15_logParser;
/*
package com.javarush.task.task39.task3913;
*/

import java.nio.file.Paths;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        LogParser logParser = new LogParser(Paths.get("c:/logs/"));
        System.out.println(logParser.getNumberOfUniqueIPs(null, new Date()));
    }
}
