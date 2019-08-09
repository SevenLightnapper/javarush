package javarush.java_collections_4.level5.lecture8.task3;

public class Dog {

    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Пес " + name;
    }
}

