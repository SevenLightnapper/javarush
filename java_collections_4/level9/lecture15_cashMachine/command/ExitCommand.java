package javarush.java_collections_4.level9.lecture15_cashMachine.command;

import javarush.java_collections_4.level9.lecture15_cashMachine.CashMachine;
import javarush.java_collections_4.level9.lecture15_cashMachine.ConsoleHelper;
import javarush.java_collections_4.level9.lecture15_cashMachine.exception.InterruptOperationException;

import java.util.ResourceBundle;

class ExitCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.exit_en");

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage(res.getString("exit.question.y.n"));
        if(ConsoleHelper.readString().equals("y") || ConsoleHelper.readString().equals("Y")) {
            ConsoleHelper.writeMessage(res.getString("thank.message"));
        }
    }
}
