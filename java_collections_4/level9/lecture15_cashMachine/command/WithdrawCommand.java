package javarush.java_collections_4.level9.lecture15_cashMachine.command;

import javarush.java_collections_4.level9.lecture15_cashMachine.CashMachine;
import javarush.java_collections_4.level9.lecture15_cashMachine.ConsoleHelper;
import javarush.java_collections_4.level9.lecture15_cashMachine.CurrencyManipulator;
import javarush.java_collections_4.level9.lecture15_cashMachine.CurrencyManipulatorFactory;
import javarush.java_collections_4.level9.lecture15_cashMachine.exception.InterruptOperationException;
import javarush.java_collections_4.level9.lecture15_cashMachine.exception.NotEnoughMoneyException;

import java.util.ResourceBundle;

class WithdrawCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "withdraw_en");

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Enter currency code");
        String currencyCode = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator currencyManipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
        int sum;
        while(true) {
            ConsoleHelper.writeMessage(res.getString("before"));
            String s = ConsoleHelper.readString();
            try {
                sum = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage(res.getString("specify.amount"));
                continue;
            }
            if (sum <= 0) {
                ConsoleHelper.writeMessage(res.getString("specify.not.empty.amount"));
                continue;
            }
            if (!currencyManipulator.isAmountAvailable(sum)) {
                ConsoleHelper.writeMessage(res.getString("not.enough.money"));
                continue;
            }
            try {
                currencyManipulator.withdrawAmount(sum);
            } catch (NotEnoughMoneyException e) {
                ConsoleHelper.writeMessage(res.getString("exact.amount.not.available"));
                continue;
            }
            ConsoleHelper.writeMessage(String.format(res.getString("success.format"), sum, currencyCode));
            break;
        }
    }
}
