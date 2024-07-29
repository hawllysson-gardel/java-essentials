package br.com.hawlab.solid.lsp.solution;

abstract class Client {
    String name;
    int startYear;

    Client(String name, int startYear) {
        this.name = name;
        this.startYear = startYear;
    }

    public abstract boolean isPremium();
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
        return false;
    }
}

class TargetLead {
    String name;

    TargetLead(String name) {
        this.name = name;
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: SOLID Solution (LSP)");

        Client c1 = new ContractedClient("Maria", 2020);
        Client c2 = new ContractedClient("José", 2013);
        Client c3 = new TargetClient("Pedro", 2020);

        TargetLead tl = new TargetLead("Pedro");

        System.out.println("Cliente C1 Premium? " + c1.isPremium());
        System.out.println("Cliente C2 Premium? " + c2.isPremium());
        System.out.println("Cliente C3 Premium? " + c3.isPremium());

        System.out.println("Target Lead: " + tl.name);

        System.out.println("------------------------------------------");
    }
}
