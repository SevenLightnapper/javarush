package javarush.java_core_2.level6.lecture13.task11;

import javarush.java_core_2.level6.lecture13.task11.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes) throws IllegalArgumentException{
        if (imageTypes == ImageTypes.JPG) { return  new JpgReader(); }
        if (imageTypes == ImageTypes.BMP) { return  new BmpReader(); }
        if (imageTypes == ImageTypes.PNG) { return  new PngReader(); }
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
