package javarush.java_collections_4.level9.lecture15_cashMachine.command;

import javarush.java_collections_4.level9.lecture15_cashMachine.exception.InterruptOperationException;

interface Command {

    void execute() throws InterruptOperationException;
}
