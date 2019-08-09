package javarush.java_core_2.level5.lecture12.task4;

public class Moon implements Planet {
    private static Moon instance;

    private Moon(){}

    public static Moon getInstance() {

        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}
