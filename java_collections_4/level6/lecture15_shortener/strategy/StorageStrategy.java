package javarush.java_collections_4.level6.lecture15_shortener.strategy;

public interface StorageStrategy {

    boolean containsKey(Long key);
    boolean containsValue(String value);
    void put(Long key, String value);
    Long getKey(String value);
    String getValue(Long key);
}
