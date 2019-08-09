package javarush.java_collections_4.level8.lecture15_aggregator;

import javarush.java_collections_4.level8.lecture15_aggregator.model.Model;
import javarush.java_collections_4.level8.lecture15_aggregator.model.Provider;
import javarush.java_collections_4.level8.lecture15_aggregator.model.HHStrategy;
import javarush.java_collections_4.level8.lecture15_aggregator.model.MoikrugStrategy;
import javarush.java_collections_4.level8.lecture15_aggregator.view.HtmlView;

public class Aggregator {

    public static void main(String[] args) {
        HtmlView view = new HtmlView();
        Model model = new Model(view, new Provider(new HHStrategy()), new Provider(new MoikrugStrategy()));
        Controller controller = new Controller(model);
        view.setController(controller);
        view.userCitySelectEmulationMethod();
    }
}