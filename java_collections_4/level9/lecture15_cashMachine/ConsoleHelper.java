package javarush.java_collections_4.level9.lecture15_cashMachine;

import javarush.java_collections_4.level9.lecture15_cashMachine.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class ConsoleHelper {
    private static ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "common_en");
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws InterruptOperationException {
        String line = "";
        try {
            line = bis.readLine();
            if ("EXIT".equalsIgnoreCase(line)){
                throw new InterruptOperationException();
            }
        } catch (IOException ioex) { }

        return line;
    }

    public static void printExitMessage()
    {
        writeMessage(res.getString("the.end"));
    }

    public static String askCurrencyCode() throws InterruptOperationException {
        writeMessage(res.getString("choose.currency.code"));
        String input;
        while (true) {
            input = readString();
            if (input.length() != 3) {
                writeMessage(res.getString("invalid.data"));
            } else break;

        }

        return input.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
        writeMessage(res.getString("choose.denomination.and.count.format"));
        String[] input;

        while (true) {
            input = readString().split(" ");
            int nominal = 0;
            int total = 0;

            try {
                nominal = Integer.parseInt(input[0]);
                total = Integer.parseInt(input[1]);

            } catch (Exception e) {
                writeMessage(res.getString("invalid.data"));
                continue;
            }
            if (nominal <= 0 || total <= 0) {
                writeMessage(res.getString("invalid.data"));
                continue;
            }
            break;
        }
        return input;
    }

    public static Operation askOperation() throws InterruptOperationException {
        int i = 0;
        writeMessage("choose.operation");

        try {
            i = Integer.parseInt(readString());
            return Operation.getAllowableOperationByOrdinal(i);
        } catch (IllegalArgumentException aex) {
            writeMessage(res.getString("invalid.data"));
            try {
                i = Integer.parseInt(bis.readLine());

            } catch (IOException ex) { }

            return Operation.getAllowableOperationByOrdinal(i);
        }
    }
}

