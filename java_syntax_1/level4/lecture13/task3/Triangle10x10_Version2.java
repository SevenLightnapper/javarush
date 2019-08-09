package javarush.java_syntax_1.level4.lecture13.task3;

public class Triangle10x10_Version2 {

    public static void main(String[] args) {


        String tr = "8";
        for (int i = 0; i < 10; i++) {
            System.out.println(tr);
            tr = tr + "8";
        }
    }
}
