package javarush.java_multithreading_3.level9.lecture15_restaurant;

import javarush.java_multithreading_3.level9.lecture15_restaurant.ad.Advertisement;
import javarush.java_multithreading_3.level9.lecture15_restaurant.ad.StatisticAdvertisementManager;
import javarush.java_multithreading_3.level9.lecture15_restaurant.statistic.StatisticManager;

import java.util.*;
import java.text.SimpleDateFormat;

public class DirectorTablet {

    public void printAdvertisementProfit() {
        Map<Date, Long> videoProfits = StatisticManager.getInstance().getMoneyPerDay();
        Date[] dates = videoProfits.keySet().toArray(new Date[0]);
        Arrays.sort(dates, new Comparator<Date>() {     // сортировка по убыванию
            @Override
            public int compare(Date o1, Date o2) {
                return o2.compareTo(o1);
            }
        });
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        double total = 0.0;
        if (dates.length > 0) {
            for (Date date : dates) {
                Long curValue = videoProfits.get(date);
                if (curValue == null || curValue == 0) {
                    continue;
                }
                double curDayProfit = 0.01 * curValue;
                total += curDayProfit;
                if (curDayProfit > 0) {
                    String message = String.format("%s - %.2f", sdf.format(date), curDayProfit);
                    ConsoleHelper.writeMessage(message);
                }
            }
            String message = String.format("Total - %.2f", total);
            ConsoleHelper.writeMessage(message);
        }
    }

    public void printCookWorkloading() {

        Map<Date, Map<String, Integer>> cookWorkTime = StatisticManager.getInstance().getCookWorkTime();
        Date[] dates = cookWorkTime.keySet().toArray(new Date[0]);
        Arrays.sort(dates, new Comparator<Date>() {     // сортировка по убыванию
            @Override
            public int compare(Date o1, Date o2) {
                return o2.compareTo(o1);
            }
        });
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        int total = 0;
        if (dates.length > 0) {
            for (Date date : dates) {
                String message = sdf.format(date);      //14-May-2013
                ConsoleHelper.writeMessage(message);
                Map<String, Integer> cooksData = cookWorkTime.get(date);
                String[] cookNames = cooksData.keySet().toArray(new String[0]);
                Arrays.sort(cookNames, new Comparator<String>() {     // сортировка по убыванию
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                });
                for (String cookName : cookNames) {
                    int cookingTimeSeconds = cooksData.get(cookName);
                    total += cookingTimeSeconds;
                    message = String.format("%s - %s min", cookName, (int) ((cookingTimeSeconds + 59.0) / 60.0));   //Petrov - 35 min
                    ConsoleHelper.writeMessage(message);
                }
                ConsoleHelper.writeMessage("");
            }
        }
    }

    public void printActiveVideoSet() {
        List<Advertisement> activeVideoSet = StatisticAdvertisementManager.getInstance().getVideoSet(true);
        for (Advertisement ad : activeVideoSet)
        {
            ConsoleHelper.writeMessage(ad.getName() + " - " + ad.getHits());
        }
    }

    public void printArchivedVideoSet() {
        List<Advertisement> activeVideoSet = StatisticAdvertisementManager.getInstance().getVideoSet(false);
        for (Advertisement ad : activeVideoSet)
        {
            ConsoleHelper.writeMessage(ad.getName());
        }
    }
}
