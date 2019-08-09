package javarush.java_collections_4.level5.lecture8.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertableUtil {

    public static <T extends Convertable> Map convert(List<T> list) {
        Map result = new HashMap();

        for (T item: list)
            result.put(item.getKey(), item);

        return result;
    }
}

