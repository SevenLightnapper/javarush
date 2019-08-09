package javarush.java_collections_4.level8.lecture15_aggregator.model;

import javarush.java_collections_4.level8.lecture15_aggregator.vo.Vacancy;

import java.util.List;

/**
 * Он будет отвечать за получение данных с сайта.
 */
public interface Strategy {

    List<Vacancy> getVacancies(String searchString);
}