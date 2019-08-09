package javarush.java_collections_4.level8.lecture10.task2;
/*
package com.javarush.task.task38.task3810;
*/

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Changelog {
    //напиши свой код
    Revision[] value();
}

