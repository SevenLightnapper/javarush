package javarush.java_multithreading_3.level7.lecture15_archiver.command;

import javarush.java_multithreading_3.level7.lecture15_archiver.ConsoleHelper;
import javarush.java_multithreading_3.level7.lecture15_archiver.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipRemoveCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Удаление файла из архива.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Введите полный путь файла в архиве:");
        Path sourcePath = Paths.get(ConsoleHelper.readString());
        zipFileManager.removeFile(sourcePath);

        ConsoleHelper.writeMessage("Удаление из архива завершено.");
    }
}