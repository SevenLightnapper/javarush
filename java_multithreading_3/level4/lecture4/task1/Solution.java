package javarush.java_multithreading_3.level4.lecture4.task1;
/*
package com.javarush.task.task24.task2406;
*/
import java.math.BigDecimal;

/*
Наследование от внутреннего класса
*/
/*
Внутри класса Solution создай 2 внутренних public класса Apt3Bedroom, BigHall.
Унаследуй их от Apartments и Hall.
Требования:

    •
    Класс Apt3Bedroom должен быть создан внутри класса Solution.
    •
    Класс BigHall должен быть создан внутри класса Solution.
    •
    Класс Apt3Bedroom должен быть публичным.
    •
    Класс BigHall должен быть публичным.
    •
    Класс Apt3Bedroom должен быть потомком класса Building.Apartments.
    •
    Класс BigHall должен быть потомком класса Building.Hall.
    */

public class Solution {
    public class Building {
        public class Hall {
            private BigDecimal square;

            public Hall(BigDecimal square) {
                this.square = square;
            }
        }

        public class Apartments {
        }
    }

    public class Apt3Bedroom extends Building.Apartments {

        public Apt3Bedroom(Building bd) {
            bd.super();
        }
    }
    public class BigHall extends Building.Hall {

        public BigHall(Building bd, BigDecimal bigd) {
            bd.super(bigd);
        }
    }

    public static void main(String[] args) {

    }
}

