package br.com.hawlab.solid.srp.solution;

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
}

class NotificationService {
    public void sendNotification(String message) {
    }
}

class PolicyDocumentService {
    public void generatePolicyDocument(InsurancePolicy policy) {
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: SOLID Solution (SRP)");

        InsurancePolicy healthPolicy = new InsurancePolicy("12345", "João Silva", "Health", 500.0);

        // Responsabilidades Atribuidas e Separadas
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Sua apólice foi criada com sucesso!");

        // Responsabilidades Atribuidas e Separadas
        PolicyDocumentService documentService = new PolicyDocumentService();
        documentService.generatePolicyDocument(healthPolicy);

        System.out.println("------------------------------------------");
    }
}
