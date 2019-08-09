package javarush.java_multithreading_3.level7.lecture15_archiver;

import javarush.java_multithreading_3.level7.lecture15_archiver.exception.WrongZipFileException;

import java.io.IOException;

public class Archiver {

    public static void main(String[] args) throws Exception {
        Operation operation;
        boolean isExit = false;

        while (!isExit){
            try {
                operation = askOperation();
                if(operation.ordinal() == Operation.EXIT.ordinal()){ isExit = true; }
                CommandExecutor.execute(operation);
            } catch (WrongZipFileException e){
                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
            } catch (Exception e){
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }
        }
    }

    public static Operation askOperation() throws IOException {
        ConsoleHelper.writeMessage("What operation do you need?\n" +
                "CREATE - 0,\n" +
                "ADD - 1,\n" +
                "REMOVE - 2,\n" +
                "EXTRACT - 3,\n" +
                "CONTENT - 4,\n" +
                "EXIT - 5.\n" +
                "Please write down your choice down below.");

        return Operation.values()[ConsoleHelper.readInt()];
    }
}
