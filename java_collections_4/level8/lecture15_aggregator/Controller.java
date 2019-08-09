package javarush.java_collections_4.level8.lecture15_aggregator;


import javarush.java_collections_4.level8.lecture15_aggregator.model.Model;

public class Controller {
    private Model model;

    public Controller(Model model) {
        if (model == null)
            throw new IllegalArgumentException();

        this.model = model;
    }

    public void onCitySelect(String cityName) {
        model.selectCity(cityName);
    }
}
