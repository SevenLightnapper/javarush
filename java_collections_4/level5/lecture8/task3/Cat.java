package javarush.java_collections_4.level5.lecture8.task3;

public class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кот " + name;
    }
}

