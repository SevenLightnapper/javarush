package javarush.java_collections_4.level6.lecture15_shortener.tests;

import javarush.java_collections_4.level6.lecture15_shortener.Helper;
import javarush.java_collections_4.level6.lecture15_shortener.Shortener;
import javarush.java_collections_4.level6.lecture15_shortener.strategy.HashBiMapStorageStrategy;
import javarush.java_collections_4.level6.lecture15_shortener.strategy.HashMapStorageStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SpeedTest {

    public long getTimeToGetIds(Shortener shortener, Set<String> strings, Set<Long> ids){
        Date date = new Date();
        for (String s : strings){
            ids.add(shortener.getId(s));
        }
        Date newDate = new Date();
        return newDate.getTime() - date.getTime();
    }

    public long getTimeToGetStrings(Shortener shortener, Set<Long> ids, Set<String> strings) {
        Date curentTime = new Date();
        for (Long l : ids) {
            strings.add(shortener.getString(l));
        }
        Date lastTime = new Date();
        return lastTime.getTime() - curentTime.getTime();
    }

    @Test
    public void testHashMapStorage(){
        Shortener shortener1 = new Shortener(new HashMapStorageStrategy());
        Shortener shortener2 = new Shortener(new HashBiMapStorageStrategy());

        Set<String> origStrings = new HashSet<>();
        for (int i = 0; i < 10000; i++)
            origStrings.add(Helper.generateRandomString());

        Set<Long> ids1 = new HashSet<>();
        Set<Long> ids2 = new HashSet<>();
        long time1 = getTimeToGetIds(shortener1, origStrings, ids1);
        long time2 = getTimeToGetIds(shortener2, origStrings, ids2);
        Assert.assertTrue(time1 > time2);

        long time3 = getTimeToGetStrings(shortener1, ids1, new HashSet<String>());
        long time4 = getTimeToGetStrings(shortener2, ids2, new HashSet<String>());
        Assert.assertEquals(time3, time4, 5);

    }
}
