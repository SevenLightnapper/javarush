package javarush.java_multithreading_3.level7.lecture15_archiver;

public class FileProperties {
    private String name;
    private long size;
    private long compressedSize;
    private int compressionMethod;

    public FileProperties(String name, long size, long compressedSize, int compressionMethod) {
        this.name = name;
        this.size = size;
        this.compressedSize = compressedSize;
        this.compressionMethod = compressionMethod;
    }

    public long getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getCompressionMethod() {
        return compressionMethod;
    }

    public long getCompressedSize() {
        return compressedSize;
    }

    public long getCompressionRatio() {
        return 100 - ((compressedSize * 100) / size);
    }

    @Override
    public String toString() {
        if (getSize() > 0) {
            String output = String.format("%s %d Kb (%d Kb) сжатие: %d%%", name, size/1024, compressedSize/1024,getCompressionRatio());
            return output;
        }
        return name;
    }
}
