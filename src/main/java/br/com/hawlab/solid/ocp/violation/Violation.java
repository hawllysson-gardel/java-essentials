package br.com.hawlab.solid.ocp.violation;

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

    public double calculatePremium() {
        if (policyType.equals("Health")) {
            return basePremium * 1.1;
        } else if (policyType.equals("Life")) {
            return basePremium * 1.2;
        }

        return basePremium;
    }
}

public class Violation {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: SOLID Violation (OCP)");

        InsurancePolicy healthPolicy = new InsurancePolicy("12345", "João Silva", "Health", 500.0);

        // Violando o OCP
        System.out.println(healthPolicy.calculatePremium());

        System.out.println("------------------------------------------");
    }
}
