package javarush.java_collections_4.level9.lecture15_cashMachine;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulatorFactory {
    private static Map<String, CurrencyManipulator> manipulators = new HashMap<>();

    private CurrencyManipulatorFactory() {}

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        if (!manipulators.containsKey(currencyCode))
            manipulators.put(currencyCode, new CurrencyManipulator(currencyCode));

        return manipulators.get(currencyCode);
    }

    public static Collection<CurrencyManipulator> getAllCurrencyManipulators() {
        return manipulators.values();
    }
}
