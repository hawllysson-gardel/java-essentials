package br.com.hawlab.solid.dip.solution;

interface FileReader {
    String read();
}

class TxtFileReader implements FileReader {
    @Override
    public String read() {
        return "Conteúdo do arquivo TXT";
    }
}

class CsvFileReader implements FileReader {
    @Override
    public String read() {
        return "Conteúdo do arquivo CSV";
    }
}

class PdfFileReader implements FileReader {
    @Override
    public String read() {
        return "Conteúdo do arquivo PDF";
    }
}

class FileReaderFactory {
    public static FileReader getFileReader(String fileName) {
        if (fileName.endsWith(".txt")) {
            return new TxtFileReader();
        } else if (fileName.endsWith(".csv")) {
            return new CsvFileReader();
        } else if (fileName.endsWith(".pdf")) {
            return new PdfFileReader();
        } else {
            throw new IllegalArgumentException("Formato de arquivo não suportado: " + fileName);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: SOLID Solution (DIP)");

        String fileName = "arquivo.txt";
        FileReader fileReader = FileReaderFactory.getFileReader(fileName);
        String content = fileReader.read();
        System.out.println(content);

        fileName = "arquivo.csv";
        fileReader = FileReaderFactory.getFileReader(fileName);
        content = fileReader.read();
        System.out.println(content);

        fileName = "arquivo.pdf";
        fileReader = FileReaderFactory.getFileReader(fileName);
        content = fileReader.read();
        System.out.println(content);

        System.out.println("------------------------------------------");
    }
}
