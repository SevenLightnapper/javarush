package javarush.java_multithreading_3.level5.lecture16_refactoring.human;

public class Soldier extends Human {
    public Soldier(String name, int age) {
        super(name, age);
    }

    public void fight() {

    }

    public void live() {
        fight();
    }
}
