package javarush.java_collections_4.level8.lecture15_aggregator.model;

import javarush.java_collections_4.level8.lecture15_aggregator.view.View;
import javarush.java_collections_4.level8.lecture15_aggregator.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {
    private View view;
    private Provider[] providers;

    public Model(View view, Provider... providers) {
        if (view == null || providers == null || providers.length == 0)
            throw new IllegalArgumentException();

        this.view = view;
        this.providers = providers;
    }

    public void selectCity(String city) {
        List<Vacancy> vacancies = new ArrayList<>();

        Arrays.stream(providers).map(p -> p.getJavaVacancies(city))
                .forEach(vacancies::addAll);

        view.update(vacancies);
    }
}

