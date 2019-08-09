package javarush.java_collections_4.level9.lecture15_cashMachine.command;


import javarush.java_collections_4.level9.lecture15_cashMachine.Operation;
import javarush.java_collections_4.level9.lecture15_cashMachine.exception.InterruptOperationException;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private CommandExecutor() {}
    private static final Map<Operation, Command> allKnownCommandsMap = new HashMap<>();
    static {
        allKnownCommandsMap.put(Operation.LOGIN, new LoginCommand());
        allKnownCommandsMap.put(Operation.DEPOSIT, new DepositCommand());
        allKnownCommandsMap.put(Operation.INFO, new InfoCommand());
        allKnownCommandsMap.put(Operation.WITHDRAW, new WithdrawCommand());
        allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
    }

    public static final void execute(Operation operation) throws InterruptOperationException {
        allKnownCommandsMap.get(operation).execute();
    }
}
