package javarush.java_collections_4.level6.lecture4.task1;

import java.util.List;

public class Model {
    private static Service service = new Service();

    public List<String> getStringDataList() {
        return service.getData();
    }
}
