package javarush.java_collections_4.level5.lecture15_factoryMethod.male;

import javarush.java_collections_4.level5.lecture15_factoryMethod.AbstractFactory;
import javarush.java_collections_4.level5.lecture15_factoryMethod.Human;

public class MaleFactory implements AbstractFactory {

    public Human getPerson(int age) {
        if (age <= KidBoy.MAX_AGE)
            return new KidBoy();
        if (age <= TeenBoy.MAX_AGE)
            return new TeenBoy();
        return new Man();
    }
}
