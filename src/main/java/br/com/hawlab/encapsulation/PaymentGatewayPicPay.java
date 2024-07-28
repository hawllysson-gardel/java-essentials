package br.com.hawlab.encapsulation;

@PaymentGatewayType("PicPay")
public class PaymentGatewayPicPay implements PaymentGateway {

    @Override
    public void pay(Double value) {
        System.out.println("Pay by PicPay: $ " + value.toString());
    }
}
