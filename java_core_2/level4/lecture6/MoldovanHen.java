package javarush.java_core_2.level4.lecture6;

public class MoldovanHen extends Hen {
    public int getCountOfEggsPerMonth(){
        int N = 31;
        return N;
    }
    public String getDescription(){
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(), "Moldova",  getCountOfEggsPerMonth());
    }
}
