package javarush.java_core_2.level3.lecture11.task2;
/*
package com.javarush.Task.task13.task1317;
*/
/*
The weather is fine
*/
/*
1. В классе Today реализовать интерфейс Weather.
2. Подумай, как связан параметр type с методом getWeatherType().
3. Интерфейсы Weather и WeatherType уже реализованы в отдельных файлах.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FROZEN));
    }

    public interface Weather {
        String getWeatherType();
    }

    public interface WeatherType {
        String CLOUDY = "Cloudy";
        String FOGGY = "Foggy";
        String FROZEN = "Frozen";
    }

    static class Today implements Weather {
        private String type;

        public String getWeatherType() {
            return this.type;
        }

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("%s for today", this.getWeatherType());
        }
    }
}
