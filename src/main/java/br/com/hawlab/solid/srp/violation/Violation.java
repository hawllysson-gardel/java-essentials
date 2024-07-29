package br.com.hawlab.solid.srp.violation;

class InsurancePolicy {
    private String policyNumber;
    private String policyHolderName;
    private String policyType;
    private double basePremium;

    public InsurancePolicy(String policyNumber, String policyHolderName, String policyType, double basePremium) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.policyType = policyType;
        this.basePremium = basePremium;
    }

    public void sendNotification(String message) {
    }

    public void generatePolicyDocument() {
    }
}

public class Violation {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: SOLID Violation (SRP)");

        InsurancePolicy healthPolicy = new InsurancePolicy("12345", "João Silva", "Health", 500.0);

        // Multiplas Responsabilidades
        healthPolicy.sendNotification("Sua apólice foi criada com sucesso!");
        healthPolicy.generatePolicyDocument();

        System.out.println("------------------------------------------");
    }
}
