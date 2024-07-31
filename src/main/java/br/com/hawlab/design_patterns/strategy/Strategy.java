package br.com.hawlab.design_patterns.strategy;

interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}

public class Strategy {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Design Patterns (Strategy)");

        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100.00);

        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(200.00);

        System.out.println("------------------------------------------");
    }
}
