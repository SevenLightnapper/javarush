package javarush.java_collections_4.level5.lecture15_factoryMethod;

import javarush.java_collections_4.level5.lecture15_factoryMethod.female.FemaleFactory;
import javarush.java_collections_4.level5.lecture15_factoryMethod.male.MaleFactory;

public class FactoryProducer {

    public static enum HumanFactoryType {MALE, FEMALE}

    public static AbstractFactory getFactory(HumanFactoryType humanFactoryType) {
        if (humanFactoryType == HumanFactoryType.MALE)
            return new MaleFactory();
        if (humanFactoryType == HumanFactoryType.FEMALE)
            return new FemaleFactory();
        return null;
    }
}

