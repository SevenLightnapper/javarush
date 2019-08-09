package javarush.java_multithreading_3.level9.lecture15_restaurant.statistic.event;

import java.util.Date;

public interface EventDataRow {

    EventType getType();
    Date getDate();
    int getTime();
}
