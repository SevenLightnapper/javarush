package javarush.java_collections_4.level6.lecture15_shortener.strategy;

import java.util.HashMap;
import java.util.Map;

public class HashMapStorageStrategy implements StorageStrategy {
    private HashMap<Long, String> data = new HashMap<>();

    @Override
    public boolean containsKey(Long key) {
        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(String value) {
        return data.containsValue(value);
    }

    @Override
    public void put(Long key, String value) {
        data.put(key, value);
    }

    @Override
    public Long getKey(String value) {
        for(Map.Entry entry : data.entrySet()) {
            if (entry.getValue().equals(value)) {
                return (Long) entry.getKey();
            }
        }
        return null;
    }

    @Override
    public String getValue(Long key) {
        return data.get(key);
    }
}
