package javarush.java_multithreading_3.level7.lecture15_archiver.command;

import javarush.java_multithreading_3.level7.lecture15_archiver.ConsoleHelper;
import javarush.java_multithreading_3.level7.lecture15_archiver.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;


public abstract class ZipCommand implements Command {

    public ZipFileManager getZipFileManager() throws Exception{
        ConsoleHelper.writeMessage("Введите полный путь файла архива:");
        Path zipPath = Paths.get(ConsoleHelper.readString());
        return new ZipFileManager(zipPath);
    }
}
