package javarush.java_core_2.level4.lecture6;

/*
2. Создать класс RussianHen, который наследуется от Hen.
 */

public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        int N = 40;
        return N;
    }
    public String getDescription(){
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(), "Russian",  getCountOfEggsPerMonth());
    }
}
