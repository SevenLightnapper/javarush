package javarush.java_collections_4.level8.lecture15_aggregator.model;

import javarush.java_collections_4.level8.lecture15_aggregator.vo.Vacancy;

import java.util.Collections;
import java.util.List;

/**
 * Этот класс будет обобщать способ получения данных о вакансиях.
 */
public class Provider {
    Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Vacancy> getJavaVacancies(String searchString) {
        if(searchString == null) return Collections.emptyList();
        return strategy.getVacancies(searchString);
    }
}
