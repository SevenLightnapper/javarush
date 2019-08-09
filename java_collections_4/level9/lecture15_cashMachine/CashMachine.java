package javarush.java_collections_4.level9.lecture15_cashMachine;

import javarush.java_collections_4.level9.lecture15_cashMachine.command.CommandExecutor;
import javarush.java_collections_4.level9.lecture15_cashMachine.exception.InterruptOperationException;

import java.util.Locale;

public class CashMachine {
    public static final String RESOURCE_PATH = CashMachine.class.getPackage().getName() + ".resources.";

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        try {
            CommandExecutor.execute(Operation.LOGIN);
            Operation operation;
            do {
                operation = ConsoleHelper.askOperation();
                CommandExecutor.execute(operation);

            } while (operation != Operation.EXIT);

        } catch (InterruptOperationException e) {
            try {
                CommandExecutor.execute(Operation.EXIT);
            } catch (InterruptOperationException ignored) { }

            ConsoleHelper.printExitMessage();
        }
    }
}

