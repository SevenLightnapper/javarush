package javarush.java_collections_4.level7.lecture8.task2.security;
/*
package com.javarush.task.task37.task3709.security;
*/

public class SecurityCheckerImpl implements SecurityChecker {
    @Override
    public boolean performSecurityCheck() {
        System.out.println("SECURITY OK!");
        return true;
    }
}

