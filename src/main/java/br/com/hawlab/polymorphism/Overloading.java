package br.com.hawlab.polymorphism;

class PaymentProcessor {
    void processPayment(double amount) {
        System.out.println("Processing Generic Payment: $ " + amount);
    }

    void processPayment(double amount, String cardNumber) {
        System.out.println("Processing Credit Card Payment: $ " + amount + ", Card Number " + cardNumber);
    }

    void processPayment(double amount, boolean useAccountBalance) {
        if (useAccountBalance) {
            System.out.println("Processing Account Balance Payment: $ " + amount);
        } else {
            this.processPayment(amount);
        }
    }
}

public class Overloading {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Polymorphism (Overloading)");

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayment(100.0);
        paymentProcessor.processPayment(100.0, "1234-5678-9012-3456");
        paymentProcessor.processPayment(110.0, "1234-5678-9012-9999");
        paymentProcessor.processPayment(50.0, true);
        paymentProcessor.processPayment(75.0, false);

        System.out.println("------------------------------------------");
    }
}
