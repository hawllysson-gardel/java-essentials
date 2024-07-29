package br.com.hawlab.solid.isp.solution;

interface CreditCardPayment {
    void processCreditCardPayment();
}

interface PayPalPayment {
    void processPayPalPayment();
}

interface BitcoinPayment {
    void processBitcoinPayment();
}

class CreditCardGateway implements CreditCardPayment {
    @Override
    public void processCreditCardPayment() {
        System.out.println("Implementação do processamento de pagamento com cartão de crédito.");
    }
}

class PayPalGateway implements PayPalPayment {
    @Override
    public void processPayPalPayment() {
        System.out.println("Implementação do processamento de pagamento com PayPal.");
    }
}

class BitcoinGateway implements BitcoinPayment {
    @Override
    public void processBitcoinPayment() {
        System.out.println("Implementação do processamento de pagamento com Bitcoin.");
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: SOLID Solution (ISP)");

        CreditCardGateway creditCardGateway = new CreditCardGateway();
        PayPalGateway payPalGateway = new PayPalGateway();
        BitcoinGateway bitcoinGateway = new BitcoinGateway();

        creditCardGateway.processCreditCardPayment();
        payPalGateway.processPayPalPayment();
        bitcoinGateway.processBitcoinPayment();

        System.out.println("------------------------------------------");
    }
}
