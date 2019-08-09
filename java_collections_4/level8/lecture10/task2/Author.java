package javarush.java_collections_4.level8.lecture10.task2;
/*
package com.javarush.task.task38.task3810;
*/

public @interface Author {
    //напиши свой код
    String value() default "";
    Position position() default Position.OTHER;
}

