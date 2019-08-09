package javarush.java_core_2.level4.lecture8.task6;
/*
package com.javarush.Task.task14.task1414;
*/
/*
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Movie movie = null;
        String key = null;

        while (true) {
            key = reader.readLine();
            if (key.equals("cartoon") || key.equals("thriller") || key.equals("soapOpera")) {
                if (key.equals("cartoon")) {
                    movie = MovieFactory.getMovie(key);
                    System.out.println(movie.getClass().getSimpleName());
                } else if (key.equals("thriller")) {
                    movie = MovieFactory.getMovie(key);
                    System.out.println(movie.getClass().getSimpleName());
                } else if (key.equals("soapOpera")) {
                    movie = MovieFactory.getMovie(key);
                    System.out.println(movie.getClass().getSimpleName());
                }
            } else {
                movie = MovieFactory.getMovie(key);
                break;
            }
        }
    }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

        static class MovieFactory {

            static public Movie getMovie(String key) {
                Movie movie = null;

                //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
                if ("soapOpera".equals(key)) {
                    movie = new SoapOpera();
                }

                //напишите тут ваш код, пункты 5,6
                else if ("cartoon".equals(key)) {
                    movie = new Cartoon();
                }
                else if ("thriller".equals(key)) {
                    movie = new Thriller();
                }

                return movie;
            }
        }

        static abstract class Movie {
        }

        static class SoapOpera extends Movie {
        }

        static class Cartoon extends Movie {}
        static class Thriller extends Movie {}//Напишите тут ваши классы, пункт 3
}


