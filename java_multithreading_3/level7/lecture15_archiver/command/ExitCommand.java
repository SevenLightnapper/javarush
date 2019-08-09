package javarush.java_multithreading_3.level7.lecture15_archiver.command;

import javarush.java_multithreading_3.level7.lecture15_archiver.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
