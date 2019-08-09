package javarush.java_collections_4.level8.lecture15_aggregator.view;

import javarush.java_collections_4.level8.lecture15_aggregator.Controller;
import javarush.java_collections_4.level8.lecture15_aggregator.vo.Vacancy;

import java.util.List;

public interface View {

    void update(List<Vacancy> vacancies);
    void setController(Controller controller);
}

