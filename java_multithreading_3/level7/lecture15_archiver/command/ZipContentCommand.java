package javarush.java_multithreading_3.level7.lecture15_archiver.command;

import javarush.java_multithreading_3.level7.lecture15_archiver.ConsoleHelper;
import javarush.java_multithreading_3.level7.lecture15_archiver.FileProperties;
import javarush.java_multithreading_3.level7.lecture15_archiver.ZipFileManager;

import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Просмотр содержимого архива.");
        ZipFileManager zipFileManager = getZipFileManager();
        ConsoleHelper.writeMessage("Содержимое архива:");
        List<FileProperties> list = zipFileManager.getFilesList();
        ConsoleHelper.writeMessage(list.toString());
        ConsoleHelper.writeMessage("Содержимое архива прочитано.");
    }
}
