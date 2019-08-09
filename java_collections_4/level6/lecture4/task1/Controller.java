package javarush.java_collections_4.level6.lecture4.task1;

import java.util.List;

public class Controller {
    private static Model model = new Model();

    public List<String> onShowDataList() {
        return model.getStringDataList();
    }

}
