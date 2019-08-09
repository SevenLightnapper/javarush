package javarush.java_multithreading_3.level4.lecture9.task1;

public class C implements JustAnInterface {
    public C() {
        System.out.print("C");
        B localB = B;
    }
}