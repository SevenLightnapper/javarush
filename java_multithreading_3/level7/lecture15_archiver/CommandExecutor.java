package javarush.java_multithreading_3.level7.lecture15_archiver;

import javarush.java_multithreading_3.level7.lecture15_archiver.command.*;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private static final Map<Operation, Command> allKnownCommandsMap = new HashMap<Operation, Command>();

    private CommandExecutor() {}

    static {
        allKnownCommandsMap.put(Operation.ADD, new ZipAddCommand());
        allKnownCommandsMap.put(Operation.CONTENT, new ZipContentCommand());
        allKnownCommandsMap.put(Operation.CREATE, new ZipCreateCommand());
        allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
        allKnownCommandsMap.put(Operation.EXTRACT, new ZipExtractCommand());
        allKnownCommandsMap.put(Operation.REMOVE, new ZipRemoveCommand());
    }

    public static void execute(Operation operation) throws Exception{
        allKnownCommandsMap.get(operation).execute();
    }

}
