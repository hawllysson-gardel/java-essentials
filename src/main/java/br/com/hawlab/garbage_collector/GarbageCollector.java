package br.com.hawlab.garbage_collector;

interface FileReader {
    String read();
}

class TxtFileReader implements FileReader {
    @Override
    public String read() {
        return "Conteúdo do arquivo TXT";
    }
}

public class GarbageCollector {
    public static void getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();

        final int MB = 1024 * 1024;
        long usedMemory = (runtime.totalMemory() - runtime.freeMemory()) / MB;

        System.out.println("Used Memory: " + usedMemory + " MB");
    }
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Garbage Collector");

        FileReader[] fileReaders = new FileReader[1000000];

        for(int i = 0; i < fileReaders.length; i++) {
            FileReader fileReader = new TxtFileReader();
            fileReaders[i] = fileReader;
        }
        System.out.println("File Reads Created!");

        getUsedMemory();

        fileReaders = null;
        Runtime.getRuntime().gc();

        System.out.println("File Reads Deleted!");

        getUsedMemory();

        System.out.println("------------------------------------------");
    }
}
