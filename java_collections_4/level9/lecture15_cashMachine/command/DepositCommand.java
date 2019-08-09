package javarush.java_collections_4.level9.lecture15_cashMachine.command;

import javarush.java_collections_4.level9.lecture15_cashMachine.CashMachine;
import javarush.java_collections_4.level9.lecture15_cashMachine.ConsoleHelper;
import javarush.java_collections_4.level9.lecture15_cashMachine.CurrencyManipulatorFactory;
import javarush.java_collections_4.level9.lecture15_cashMachine.exception.InterruptOperationException;

import java.util.ResourceBundle;

class DepositCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.deposit_en");
    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage(res.getString("before"));
        String cc = ConsoleHelper.askCurrencyCode();
        String[] cash = ConsoleHelper.getValidTwoDigits(cc);
        try {
            int amount = Integer.parseInt(cash[0])*Integer.parseInt(cash[1]);
            CurrencyManipulatorFactory.getManipulatorByCurrencyCode(cc).addAmount(Integer.parseInt(cash[0]), Integer.parseInt(cash[1]));
            ConsoleHelper.writeMessage(String.format(res.getString("success.format"), amount, cc));
        }
        catch (NumberFormatException e)
        {
            ConsoleHelper.writeMessage(res.getString("invalid.data"));
        }
    }
}
