package javarush.java_multithreading_3.level4.lecture9.task1;

public interface JustAnInterface {
    public static final B B = new B();

    class B extends C {
        public B() {
            System.out.print("B");
        }
    }
}
