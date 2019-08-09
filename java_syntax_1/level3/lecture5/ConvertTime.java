package javarush.java_syntax_1.level3.lecture5;

public class ConvertTime {
    public static int convertToSeconds(int hour){

        int Seconds = hour * 3600;
        return Seconds;

    }//напишите тут ваш код

    public static void main(String[] args) {

        System.out.println(convertToSeconds(8));
        System.out.println(convertToSeconds(5));//напишите тут ваш код
    }
}
