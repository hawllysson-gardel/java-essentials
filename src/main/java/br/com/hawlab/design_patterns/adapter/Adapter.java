package br.com.hawlab.design_patterns.adapter;

interface PaymentGateway {
    void processPayment(double amount);
}

class PayPal implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " with PayPal.");
    }
}

class BitcoinPayment {
    public void executePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " with Bitcoin.");
    }
}

class BitcoinAdapter implements PaymentGateway {
    private BitcoinPayment bitcoinPayment;

    public BitcoinAdapter(BitcoinPayment bitcoinPayment) {
        this.bitcoinPayment = bitcoinPayment;
    }

    @Override
    public void processPayment(double amount) {
        bitcoinPayment.executePayment(amount);
    }
}

public class Adapter {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Design Patterns (Adapter)");

        PaymentGateway paypal = new PayPal();
        PaymentGateway bitcoinAdapter = new BitcoinAdapter(new BitcoinPayment());

        paypal.processPayment(100.0);
        bitcoinAdapter.processPayment(50.0);

        System.out.println("------------------------------------------");
    }
}
