package br.com.hawlab.solid.isp.violation;

interface PaymentGateway {
    void processCreditCardPayment();
    void processPayPalPayment();
    void processBitcoinPayment();
}

class CreditCardGateway implements PaymentGateway {
    @Override
    public void processCreditCardPayment() {
        System.out.println("Implementação do processamento de pagamento com cartão de crédito.");
    }

    @Override
    public void processPayPalPayment() {
        System.out.println("Esta classe não deveria implementar este método.");
    }

    @Override
    public void processBitcoinPayment() {
        System.out.println("Esta classe não deveria implementar este método.");
    }
}

class PayPalGateway implements PaymentGateway {
    @Override
    public void processCreditCardPayment() {
        System.out.println("Esta classe não deveria implementar este método.");
    }

    @Override
    public void processPayPalPayment() {
        System.out.println("Implementação do processamento de pagamento com PayPal.");
    }

    @Override
    public void processBitcoinPayment() {
        System.out.println("Esta classe não deveria implementar este método.");
    }
}

class BitcoinGateway implements PaymentGateway {
    @Override
    public void processCreditCardPayment() {
        System.out.println("Esta classe não deveria implementar este método.");
    }

    @Override
    public void processPayPalPayment() {
        System.out.println("Esta classe não deveria implementar este método.");
    }

    @Override
    public void processBitcoinPayment() {
        System.out.println("Implementação do processamento de pagamento com Bitcoin.");
    }
}

public class Violation {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: SOLID Violation (ISP)");

        CreditCardGateway creditCardGateway = new CreditCardGateway();
        PayPalGateway payPalGateway = new PayPalGateway();
        BitcoinGateway bitcoinGateway = new BitcoinGateway();

        creditCardGateway.processCreditCardPayment();
        creditCardGateway.processPayPalPayment();
        creditCardGateway.processBitcoinPayment();

        payPalGateway.processCreditCardPayment();
        payPalGateway.processPayPalPayment();
        payPalGateway.processBitcoinPayment();

        bitcoinGateway.processCreditCardPayment();
        bitcoinGateway.processPayPalPayment();
        bitcoinGateway.processBitcoinPayment();

        System.out.println("------------------------------------------");
    }
}
