package javarush.java_collections_4.level8.lecture10.task2;
/*
package com.javarush.task.task38.task3810;
*/

public @interface Revision {
    //напиши свой код
    int revision();
    Date date();
    Author[] authors() default {};
    String comment() default "";
}

