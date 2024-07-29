# SOLI.D - Interface Segregation Principle (ISP)

## Introdução

O Princípio de Segregação de Interfaces (Interface Segregation Principle - ISP) é um dos princípios SOLID de design de software. Ele afirma que uma classe não deve ser forçada a depender de métodos que não utiliza. Em outras palavras, é melhor ter várias interfaces específicas do que uma única interface geral.

## Definição

O Princípio de Segregação de Interfaces estabelece que:

- **Interfaces Específicas**: Devemos criar interfaces mais específicas, que atendam a um conjunto coeso de funcionalidades.
- **Dependência Mínima**: As classes devem depender apenas dos métodos que realmente utilizam, evitando a implementação de métodos desnecessários.

## Benefícios

- **Modularidade**: Aumenta a modularidade do código, permitindo que classes implementem apenas as interfaces que realmente precisam.
- **Manutenção**: Facilita a manutenção, pois mudanças em uma interface não afetam classes que não utilizam os métodos alterados.
- **Flexibilidade**: Permite que classes sejam mais flexíveis e reutilizáveis, implementando apenas o que é necessário.

## Exemplo Prático

### Violação

No contexto de um sistema de pagamento, considere uma interface geral `PaymentGateway` que define métodos para processar diferentes tipos de pagamentos, como cartão de crédito, PayPal e Bitcoin. As classes que implementam essa interface são `CreditCardGateway`, `PayPalGateway`, e `BitcoinGateway`.

A interface `PaymentGateway` inclui métodos que nem todos os gateways de pagamento necessitam, forçando as classes a implementar métodos que não utilizam:

- `CreditCardGateway`: Implementa `processCreditCardPayment()`, mas é forçado a implementar também `processPayPalPayment()` e `processBitcoinPayment()`.
- `PayPalGateway`: Implementa `processPayPalPayment()`, mas é forçado a implementar também `processCreditCardPayment()` e `processBitcoinPayment()`.
- `BitcoinGateway`: Implementa `processBitcoinPayment()`, mas é forçado a implementar também `processCreditCardPayment()` e `processPayPalPayment()`.

### Solução

Para evitar a violação do ISP, devemos criar interfaces específicas para cada tipo de pagamento:

- **CreditCardPayment**: Define o método `processCreditCardPayment()`.
- **PayPalPayment**: Define o método `processPayPalPayment()`.
- **BitcoinPayment**: Define o método `processBitcoinPayment()`.

As classes que implementam essas interfaces agora só dependem dos métodos que realmente utilizam:

- `CreditCardGateway`: Implementa `CreditCardPayment` e apenas o método `processCreditCardPayment()`.
- `PayPalGateway`: Implementa `PayPalPayment` e apenas o método `processPayPalPayment()`.
- `BitcoinGateway`: Implementa `BitcoinPayment` e apenas o método `processBitcoinPayment()`.

## Conclusão

O Princípio de Segregação de Interfaces (ISP) garante que as classes não sejam forçadas a depender de métodos que não utilizam. Seguir o ISP ajuda a criar um código mais modular, fácil de manter e flexível, permitindo que as classes implementem apenas as interfaces que realmente necessitam.
