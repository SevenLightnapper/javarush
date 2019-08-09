package javarush.java_multithreading_3.level9.lecture15_restaurant.statistic;

import javarush.java_multithreading_3.level9.lecture15_restaurant.statistic.event.*;

import java.util.*;

public class StatisticManager {
    private class StatisticStorage {
        private Map<EventType, List<EventDataRow>> map = new HashMap<>();

        private StatisticStorage() {
            for (EventType eventType : EventType.values()) {
                map.put(eventType, new ArrayList<EventDataRow>());
            }
        }

        private void put(EventDataRow data)
        {
            map.get(data.getType()).add(data);
        }

        private Map<EventType, List<EventDataRow>> getData()
        {
            return map;
        }

        private List<EventDataRow> getData(EventType eventType)
        {
            return map.get(eventType);
        }

    }

    private StatisticStorage statisticStorage = new StatisticStorage();
    private static StatisticManager instance = new StatisticManager();

    public static StatisticManager getInstance()
    {
        return instance;
    }

    private StatisticManager() { }

    public void register(EventDataRow data)
    {
        statisticStorage.put(data);
    }

    public Map<Date, Long> getMoneyPerDay() {
        HashMap<Date, Long> res = new HashMap<Date, Long>();
        List<EventDataRow> eventDataRowList = statisticStorage.getData(EventType.SELECTED_VIDEOS);
        for (EventDataRow eventDataRow: eventDataRowList) {
            Date normDate = removeTimeFromDate(eventDataRow.getDate());
            if (res.containsKey(normDate)) {
                res.put(normDate, res.get(normDate) + ((VideoSelectedEventDataRow)eventDataRow).getAmount());
            }
            else {
                res.put(normDate, ((VideoSelectedEventDataRow)eventDataRow).getAmount());
            }
        }
        return res;
    }

    private Date removeTimeFromDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public Map<Date, Map<String, Integer>> getCookWorkTime() {
        HashMap<Date, Map<String, Integer>> res = new HashMap<Date, Map<String, Integer>>();
        List<EventDataRow> eventDataRowList = statisticStorage.getData(EventType.COOKED_ORDER);
        for (EventDataRow eventDataRow: eventDataRowList) {
            Date normDate = removeTimeFromDate(eventDataRow.getDate());
            Map<String, Integer> cookDataMap;
            if (res.containsKey(normDate)) {
                cookDataMap = res.get(normDate);
            }
            else {
                cookDataMap = new HashMap<String, Integer>();
                res.put(normDate, cookDataMap);
            }
            String cookName = ((CookedOrderEventDataRow)eventDataRow).getCookName();
            if (cookDataMap.containsKey(cookName)) {
                cookDataMap.put(cookName, cookDataMap.get(cookName) + eventDataRow.getTime());
            }
            else {
                cookDataMap.put(cookName, eventDataRow.getTime());
            }
        }
        return res;
    }
}