package javarush.java_core_2.level4.lecture6;
/*
6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
        Методы должны возвращать количество яиц в месяц от данного типа куриц.
        7. В каждом из четырех последних классов написать свою реализацию метода getDescription.

        Методы должны возвращать строку вида:
<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
        где Sssss - название страны
        где N - количество яиц в месяц
*/

public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        int N = 15;
        return N;
    }
    public String getDescription(){
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(), "Belarus",  getCountOfEggsPerMonth());
    }
}
