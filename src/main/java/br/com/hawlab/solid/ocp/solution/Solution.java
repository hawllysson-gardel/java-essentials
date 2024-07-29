package br.com.hawlab.solid.ocp.solution;

interface InsurancePolicy {
    double calculatePremium();
}

class HealthInsurancePolicy implements InsurancePolicy {
    private String policyNumber;
    private String policyHolderName;
    private double basePremium;

    public HealthInsurancePolicy(String policyNumber, String policyHolderName, double basePremium) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.basePremium = basePremium;
    }

    @Override
    public double calculatePremium() {
        return basePremium * 1.1;
    }
}

class LifeInsurancePolicy implements InsurancePolicy {
    private String policyNumber;
    private String policyHolderName;
    private double basePremium;

    public LifeInsurancePolicy(String policyNumber, String policyHolderName, double basePremium) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.basePremium = basePremium;
    }

    @Override
    public double calculatePremium() {
        return basePremium * 1.2;
    }
}

class VehicleInsurancePolicy implements InsurancePolicy {
    private String policyNumber;
    private String policyHolderName;
    private double basePremium;

    public VehicleInsurancePolicy(String policyNumber, String policyHolderName, double basePremium) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.basePremium = basePremium;
    }

    @Override
    public double calculatePremium() {
        return basePremium * 1.3;
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: SOLID Solution (OCP)");

        InsurancePolicy healthPolicy = new HealthInsurancePolicy("12345", "Pedro Silva", 500.0);
        System.out.println("Health Insurance Premium: " + healthPolicy.calculatePremium());

        InsurancePolicy lifePolicy = new LifeInsurancePolicy("123456", "Maria Silva", 500.0);
        System.out.println("Life Insurance Premium: " + lifePolicy.calculatePremium());

        InsurancePolicy vehiclePolicy = new VehicleInsurancePolicy("123457", "João Silva", 500.0);
        System.out.println("Vehicle Insurance Premium: " + vehiclePolicy.calculatePremium());

        System.out.println("------------------------------------------");
    }
}
