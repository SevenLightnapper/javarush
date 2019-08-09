package javarush.java_core_2.level9.lecture11.task9;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Task {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        PrintStream print = new PrintStream(arr);
        System.setOut(print);
        testString.printSomething();
        ArrayList<String> list = new ArrayList<String>();
        list.add(arr.toString());
        String[] mass = list.get(0).split("\n");
        int length = mass.length-1;
        System.setOut(out);
        for(int i=0;i<mass.length;i+=2){
            System.out.println(mass[i]);
            if(!mass[length].equals(mass[i])) {
                System.out.println(mass[i + 1]);
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
            System.out.println("sixth");
            System.out.println("seventh");
        }
    }
}

