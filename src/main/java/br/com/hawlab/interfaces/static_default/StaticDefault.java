package br.com.hawlab.interfaces.static_default;

interface File {
    default String read() {
        return "Conteúdo do Arquivo TXT";
    }

    void write();
}

class TxtFile implements File {
    public void write() {
        System.out.println("Escrevendo no Arquivo TXT");
    }
}

class CsvFile implements File {
    @Override
    public String read() {
        return "Conteúdo do Arquivo CSV";
    }

    public void write() {
        System.out.println("Escrevendo no Arquivo CSV");
    }
}

class FileFactory {
    public static File getFileReader(String fileName) {
        if (fileName.endsWith(".txt")) {
            return new TxtFile();
        } else if (fileName.endsWith(".csv")) {
            return new CsvFile();
        } else {
            throw new IllegalArgumentException("Formato de arquivo não suportado: " + fileName);
        }
    }
}

public class StaticDefault {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Interfaces - Static and Default Methods");

        String fileName = "arquivo.txt";
        File file = FileFactory.getFileReader(fileName);
        String content = file.read();
        file.write();
        System.out.println(content);

        fileName = "arquivo.csv";
        file = FileFactory.getFileReader(fileName);
        content = file.read();
        file.write();
        System.out.println(content);

        System.out.println("------------------------------------------");
    }
}
