package javarush.java_collections_4.level5.lecture15_factoryMethod.female;

import javarush.java_collections_4.level5.lecture15_factoryMethod.AbstractFactory;
import javarush.java_collections_4.level5.lecture15_factoryMethod.Human;

public class FemaleFactory implements AbstractFactory {

    public Human getPerson(int age) {
        if (age <= KidGirl.MAX_AGE)
            return new KidGirl();
        if (age <= TeenGirl.MAX_AGE)
            return new TeenGirl();
        return new Woman();
    }
}
