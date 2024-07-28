package br.com.hawlab.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Encapsulation");

        //String paymentGatewayType = "Apple";
        String paymentGatewayType = "PicPay";
        Double value = 10.00;

        PaymentGateway paymentGateway = PaymentGatewayFactory.getPaymentGateway(paymentGatewayType);

        if (paymentGateway != null) {
            paymentGateway.pay(value);
        } else {
            System.out.println("No Found Gateway for Type: " + paymentGatewayType);
        }

        System.out.println("------------------------------------------");
    }
}
