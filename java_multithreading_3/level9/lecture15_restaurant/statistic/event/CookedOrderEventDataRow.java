package javarush.java_multithreading_3.level9.lecture15_restaurant.statistic.event;

import javarush.java_multithreading_3.level9.lecture15_restaurant.kitchen.Dish;

import java.util.Date;
import java.util.List;

public class CookedOrderEventDataRow implements EventDataRow {
    private String tabletName; // имя планшета
    private String cookName; // имя повора
    private int cookingTimeSeconds; // время проготовления заказа в секундах
    private List<Dish> cookingDishs; // список блюд для проготовления
    private Date currentDate;

    public CookedOrderEventDataRow(String tabletName, String cookName, int cookingTimeSeconds, List<Dish> cookingDishs) {
        this.tabletName = tabletName;
        this.cookName = cookName;
        this.cookingTimeSeconds = cookingTimeSeconds;
        this.cookingDishs = cookingDishs;
        this.currentDate = new Date();
    }

    @Override
    public EventType getType() {
        return EventType.COOKED_ORDER;
    }

    @Override
    public Date getDate()
    {
        return currentDate;
    }

    @Override
    public int getTime()
    {
        return cookingTimeSeconds;
    }

    public String getCookName()
    {
        return cookName;
    }
}
