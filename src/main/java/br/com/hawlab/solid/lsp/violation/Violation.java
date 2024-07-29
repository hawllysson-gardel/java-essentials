package br.com.hawlab.solid.lsp.violation;

class Client {
    String name;
    int startYear;

    Client(String name, int startYear) {
        this.name = name;
        this.startYear = startYear;
    }

    public boolean isPremium() {
        return false;
    }
}

class ContractedClient extends Client {
    ContractedClient(String name, int startYear) {
        super(name, startYear);
    }

    @Override
    public boolean isPremium() {
        return startYear < 2017;
    }
}

class TargetClient extends Client {
    TargetClient(String name, int startYear) {
        super(name, startYear);
    }

    @Override
    public boolean isPremium() {
        throw new RuntimeException("Ainda não é um cliente!");
    }
}

public class Violation {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: SOLID Violation (LSP)");

        Client c1 = new Client("João", 2020);
        Client c2 = new ContractedClient("Maria", 2020);
        Client c3 = new ContractedClient("José", 2013);
        Client c4 = new TargetClient("Pedro", 2020);

        System.out.println("Cliente C1 Premium? " + c1.isPremium());
        System.out.println("Cliente C2 Premium? " + c2.isPremium());
        System.out.println("Cliente C3 Premium? " + c3.isPremium());
        // Exception !
        System.out.println("Cliente C4 Premium? " + c4.isPremium());

        System.out.println("------------------------------------------");
    }
}
