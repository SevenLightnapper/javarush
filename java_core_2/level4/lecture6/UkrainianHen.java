package javarush.java_core_2.level4.lecture6;

public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        int N = 17;
        return N;
    }
    public String getDescription(){
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(), "Ukraine",  getCountOfEggsPerMonth());
    }
}
