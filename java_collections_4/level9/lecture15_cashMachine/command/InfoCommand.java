package javarush.java_collections_4.level9.lecture15_cashMachine.command;

import javarush.java_collections_4.level9.lecture15_cashMachine.CashMachine;
import javarush.java_collections_4.level9.lecture15_cashMachine.ConsoleHelper;
import javarush.java_collections_4.level9.lecture15_cashMachine.CurrencyManipulator;
import javarush.java_collections_4.level9.lecture15_cashMachine.CurrencyManipulatorFactory;

import java.util.ResourceBundle;

class InfoCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.info_en");

    @Override
    public void execute() {
        boolean flag = false;
        ConsoleHelper.writeMessage(res.getString("before"));
        for(CurrencyManipulator manipulator : CurrencyManipulatorFactory.getAllCurrencyManipulators())
        {
            if (manipulator.hasMoney())
            {
                System.out.println(manipulator.getCurrencyCode() + " - " + manipulator.getTotalAmount());
                flag = true;
            }
        }
        if (!flag) ConsoleHelper.writeMessage(res.getString("no.money"));
    }
}
