package javarush.java_collections_4.level5.lecture4.task2;
/*
package com.javarush.task.task35.task3501;
*/
/*
Измени статический метод в классе GenericStatic так, чтобы он стал дженериком.
Пример вызова дан в методе main.
Требования:

    •
    Метод someStaticMethod в классе GenericStatic должен быть изменен в соответствии с условием задачи.
    •
    Метод someStaticMethod должен быть статическим.
    •
    Метод someStaticMethod должен быть публичным.
    •
    Метод someStaticMethod должен выводить данные на экран.
    */

public class GenericStatic {
    public static <T> T someStaticMethod(T genericObject) {
        System.out.println(genericObject);
        return genericObject;
    }
}
