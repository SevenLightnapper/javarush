package javarush.java_collections_4.level5.lecture8.task3;

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Щенок " + name;
    }
}

