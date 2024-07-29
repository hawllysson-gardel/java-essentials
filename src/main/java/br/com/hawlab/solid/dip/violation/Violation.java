package br.com.hawlab.solid.dip.violation;

class TxtFileReader {
    public String read() {
        return "Conteúdo do arquivo TXT";
    }
}

class CsvFileReader {
    public String read() {
        return "Conteúdo do arquivo CSV";
    }
}

class PdfFileReader {
    public String read() {
        return "Conteúdo do arquivo PDF";
    }
}

public class Violation {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: SOLID Violation (DIP)");

        TxtFileReader txtFileReader = new TxtFileReader();
        CsvFileReader csvFileReader = new CsvFileReader();
        PdfFileReader pdfFileReader = new PdfFileReader();

        String txtContent = txtFileReader.read();
        String csvContent = csvFileReader.read();
        String pdfContent = pdfFileReader.read();

        System.out.println(txtContent);
        System.out.println(csvContent);
        System.out.println(pdfContent);

        System.out.println("------------------------------------------");
    }
}
