package br.com.hawlab.inheritance;

interface Reader {
    void read();
}

interface Writer {
    void write();
}

class DocumentHandler implements Reader, Writer {

    @Override
    public void read() {
        System.out.println("Reading document...");
    }

    @Override
    public void write() {
        System.out.println("Writing document...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Multiple Inheritance");

        DocumentHandler handler = new DocumentHandler();

        handler.read();
        handler.write();

        System.out.println("------------------------------------------");
    }
}
