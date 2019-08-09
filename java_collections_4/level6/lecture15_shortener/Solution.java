package javarush.java_collections_4.level6.lecture15_shortener;

import javarush.java_collections_4.level6.lecture15_shortener.strategy.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        Set<Long> ids = new HashSet<>();
        for (Iterator<String> it = strings.iterator(); it.hasNext(); ) {
            String string = it.next();
            ids.add(shortener.getId(string));
        }
        return ids;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
        Set<String> values = new HashSet<>();
        for (Iterator<Long> it = keys.iterator(); it.hasNext(); ) {
            long id = it.next();
            values.add(shortener.getString(id));
        }
        return values;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber) {
        System.out.println(strategy.getClass().getName());
        Set<String> randomStrings = new HashSet<>();
        for (int i = 0; i < elementsNumber; i++) {
            randomStrings.add(Helper.generateRandomString());
        }
        Shortener shortener = new Shortener(strategy);

        Date d1 = new Date();
        Set<Long> ids = getIds(shortener, randomStrings);
        Date d2 = new Date();
        Date d3 = new Date();
        Set<String> strings = getStrings(shortener, ids);
        Date d4 = new Date();

        Helper.printMessage("getIds - " + (d2.getTime() - d1.getTime()));
        Helper.printMessage("getStrings - " + (d4.getTime() - d3.getTime()));

        if (randomStrings.equals(strings)) {
            Helper.printMessage("Тест пройден.");
        } else {
            Helper.printMessage("Тест не пройден.");
        }
    }

    public static void main(String[] args) {
        HashMapStorageStrategy strategy1 = new HashMapStorageStrategy();
        Date d1 = new Date();
        testStrategy(strategy1, 10000);
        Date d2 = new Date();


        OurHashMapStorageStrategy strategy2 = new OurHashMapStorageStrategy();
        Date d3 = new Date();
        testStrategy(strategy2, 10000);
        Date d4 = new Date();

        FileStorageStrategy strategy3 = new FileStorageStrategy();
        Date d5 = new Date();
        testStrategy(strategy3, 100);
        Date d6 = new Date();

        OurHashBiMapStorageStrategy strategy4 = new OurHashBiMapStorageStrategy();
        Date d7 = new Date();
        testStrategy(strategy4, 10000);
        Date d8 = new Date();

        HashBiMapStorageStrategy strategy5 = new HashBiMapStorageStrategy();
        Date d9 = new Date();
        testStrategy(strategy5, 10000);
        Date d10 = new Date();

        DualHashBidiMapStorageStrategy strategy6 = new DualHashBidiMapStorageStrategy();
        Date d11 = new Date();
        testStrategy(strategy6, 10000);
        Date d12 = new Date();

        Helper.printMessage("strategy1 - " + (d2.getTime() - d1.getTime()));
        Helper.printMessage("strategy2 - " + (d4.getTime() - d3.getTime()));
        Helper.printMessage("strategy3 - " + (d6.getTime() - d5.getTime()));
        Helper.printMessage("strategy4 - " + (d8.getTime() - d7.getTime()));
        Helper.printMessage("strategy5 - " + (d9.getTime() - d10.getTime()));
        Helper.printMessage("strategy6 - " + (d11.getTime() - d12.getTime()));
    }
}
