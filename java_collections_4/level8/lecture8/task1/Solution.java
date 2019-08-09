package javarush.java_collections_4.level8.lecture8.task1;
/*
package com.javarush.task.task38.task3807;
*/
/*
Предопределенные типы аннотаций (Predefined Annotation Types)
*/
/*
Расставь в этом классе, везде где только можно, все возможные предопределенные в Java аннотации.
Не должно быть избыточности.
Требования:

    •
    Класс Solution должен быть отмечен аннотацией @Deprecated.
    •
    Класс SubSolution должен быть отмечен аннотацией @Deprecated.
    •
    Поле arguments должно быть отмечено аннотацией @Deprecated.
    •
    Метод main должен быть отмечен аннотацией @Deprecated.
    •
    Метод voidMethod класса Solution должен быть отмечен аннотацией @Deprecated.
    •
    Метод voidMethod класса SubSolution должен быть отмечен аннотациями @Deprecated и @Override.
    •
    Конструктор класса Solution должен быть отмечен аннотациями @Deprecated и @SafeVarargs.
    */

@Deprecated
public class Solution {

    @Deprecated
    private String[] arguments;

    @Deprecated
    @SafeVarargs
    public Solution(String... arguments) {
        this.arguments = arguments;
    }

    @Deprecated
    public void voidMethod() throws Exception {
    }

    @Deprecated
    public static void main(String[] args) throws Exception {
        new Solution().new SubSolution().voidMethod();
    }

    @Deprecated
    class SubSolution extends Solution {

        @Deprecated
        @Override
        public void voidMethod() throws Exception {
            super.voidMethod();
        }
    }
}

