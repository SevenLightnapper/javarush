package javarush.java_syntax_1.level4.lecture6.task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
        Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
        Если имена и длины имен разные - ничего не выводить.
*/
public class NastyaOrNastya {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameA = reader.readLine();
        String name2 = reader.readLine();

        long lettersCount = nameA
                .chars()
                .filter(Character::isLetter)
                .count();

        long lettersCount2 = name2
                .chars()
                .filter(Character::isLetter)
                .count();

        if (nameA.equals(name2))
            System.out.println("Имена идентичны");
        else if (lettersCount == lettersCount2 && (nameA != name2))
            System.out.println("Длины имен равны");
        else{}
    }
}