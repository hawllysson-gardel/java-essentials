package br.com.hawlab.encapsulation;

@PaymentGatewayType("Apple")
public class PaymentGatewayApple implements PaymentGateway {

    @Override
    public void pay(Double value) {
        System.out.println("Pay by Apple: $ " + value.toString());
    }
}
