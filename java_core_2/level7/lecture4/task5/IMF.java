package javarush.java_core_2.level7.lecture4.task5;
/*
package com.javarush.task.task17.task1707;
*/

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        synchronized (IMF.class) { //add your code here - добавь код тут
            if (imf == null) {
                imf = new IMF();
            } else // ??? not sure if this line is needed
                return imf; // ???
        }
        return imf;
    }

    private IMF() {
    }
}

