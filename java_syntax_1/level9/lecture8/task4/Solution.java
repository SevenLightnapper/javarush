package javarush.java_syntax_1.level9.lecture8.task4;
/*
package com.javarush.Task.task09.task0916;
*/
import java.io.IOException;
import java.rmi.RemoteException;

/*
Перехват checked-исключений
*/
/*
В методе processExceptions обработайте все checked исключения.
Нужно вывести на экран возникшее checked исключение.
Можно использовать только один блок try..catch
*/

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());

    }

    public static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (IOException | NoSuchFieldException e) {
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}

