package br.com.hawlab.polymorphism;

class Payment {
    void processPayment(double amount) {
        System.out.println("Processing Generic Payment: $ " + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment: $ " + amount);
    }
}

class AccountBalancePayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Account Balance Payment: $ " + amount);
    }
}

public class Overriding {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Polymorphism (Overriding)");

        Payment creditCardPayment = new CreditCardPayment();
        Payment accountBalancePayment = new AccountBalancePayment();

        creditCardPayment.processPayment(100.0);
        accountBalancePayment.processPayment(50.0);

        System.out.println("------------------------------------------");
    }
}
