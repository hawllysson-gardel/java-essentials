package br.com.hawlab.encapsulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.reflections.Reflections;

public class PaymentGatewayFactory {
    private static final Map<String, PaymentGateway> paymentGateways = new HashMap<>();

    static {
        Reflections reflections = new Reflections("br.com.hawlab.encapsulation");
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
    }

    public static PaymentGateway getPaymentGateway(String paymentGatewayType) {
        return paymentGateways.get(paymentGatewayType);
    }
}
