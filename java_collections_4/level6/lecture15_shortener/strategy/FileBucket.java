package javarush.java_collections_4.level6.lecture15_shortener.strategy;

import javarush.java_multithreading_3.level8.lecture15_html_editor.ExceptionHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileBucket {
    Path path;

    public FileBucket() {
        try {
            path = Files.createTempFile(null, null);
            Files.deleteIfExists(path);
            Files.createFile(path);
            path.toFile().deleteOnExit();
        } catch (IOException e) {
            ExceptionHandler.log(e);
        }
    }

    public long getFileSize() {
        try {
            return Files.size(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void putEntry(Entry entry) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path));
            oos.writeObject(entry);
        } catch (IOException e) {
            ExceptionHandler.log(e);
        }
    }

    public Entry getEntry() {
        Entry entry = null;
        if(getFileSize() > 0) {
            try {
                InputStream fis = Files.newInputStream(path);
                ObjectInputStream inputStream = new ObjectInputStream(fis);
                Object object = inputStream.readObject();
                fis.close();
                inputStream.close();
                entry = (Entry)object;
            }
            catch (Exception e) {
                ExceptionHandler.log(e);
            }
        }
        return entry;
    }

    public void remove() {
        try {
            Files.delete(path);
        } catch (IOException e) {
            ExceptionHandler.log(e);
        }
    }
}
