package javarush.java_core_2.level5.lecture12.task4;

public class Sun implements Planet {
    private static Sun instance;

    private Sun(){}

    public static Sun getInstance() {

        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
