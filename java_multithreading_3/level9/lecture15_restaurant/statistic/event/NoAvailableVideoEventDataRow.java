package javarush.java_multithreading_3.level9.lecture15_restaurant.statistic.event;

import java.util.Date;

public class NoAvailableVideoEventDataRow implements EventDataRow {
    private int totalDuration; // время приготовления заказа в секундах
    private Date currentDate;

    public NoAvailableVideoEventDataRow(int totalDuration) {
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }

    @Override
    public EventType getType() {
        return EventType.NO_AVAILABLE_VIDEO;
    }

    @Override
    public Date getDate()
    {
        return currentDate;
    }

    @Override
    public int getTime()
    {
        return totalDuration;
    }
}
