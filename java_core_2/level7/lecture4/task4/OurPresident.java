package javarush.java_core_2.level7.lecture4.task4;
/*
package com.javarush.task.task17.task1706;
*/

public class OurPresident {
    private static OurPresident president;

    static {
        synchronized (OurPresident.class) {
            president = new OurPresident();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}

