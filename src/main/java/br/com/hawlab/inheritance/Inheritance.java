package br.com.hawlab.inheritance;

class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void processPayment() {
        System.out.println("Processing Generic Payment: $ " + amount);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Credit Card Payment: $ " + amount + ", Card Number " + cardNumber);
    }
}

class AccountBalancePayment extends Payment {
    AccountBalancePayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Processing Account Balance Payment: $ " + amount);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Inheritance");

        Payment genericPayment = new Payment(100.0);
        Payment creditCardPayment = new CreditCardPayment(100.0, "1234-5678-9012-3456");
        Payment accountBalancePayment = new AccountBalancePayment(50.0);

        genericPayment.processPayment();
        creditCardPayment.processPayment();
        accountBalancePayment.processPayment();

        System.out.println("------------------------------------------");
    }
}
