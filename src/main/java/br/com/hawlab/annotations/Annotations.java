package br.com.hawlab.annotations;

import org.reflections.Reflections;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Retention(RetentionPolicy.RUNTIME)
@interface PaymentGatewayType {
    String value();
}


interface PaymentGateway {
    void pay(Double value);
}

@PaymentGatewayType("Apple")
class PaymentGatewayApple implements PaymentGateway {

    @Override
    public void pay(Double value) {
        System.out.println("Pay by Apple: $ " + value.toString());
    }
}

public class Annotations {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Annotations");

        final Map<String, PaymentGateway> paymentGateways = new HashMap<>();

        Reflections reflections = new Reflections("br.com.hawlab.annotations");
        Set<Class<? extends PaymentGateway>> classes = reflections.getSubTypesOf(PaymentGateway.class);

        for (Class<? extends PaymentGateway> clazz : classes) {
            PaymentGatewayType annotation = clazz.getAnnotation(PaymentGatewayType.class);
            if (annotation != null) {
                try {
                    paymentGateways.put(annotation.value(), clazz.getDeclaredConstructor().newInstance());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        paymentGateways.forEach((s, paymentGateway) -> {
            System.out.println(s);
            System.out.println(paymentGateway);
        });

        System.out.println("------------------------------------------");
    }
}
