package javarush.java_core_2.level5.lecture12.task4;

public class Earth implements Planet {
    private static Earth instance;

    private Earth(){}

    public static Earth getInstance() {

        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
