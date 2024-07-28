# Conceitos de Encapsulamento

## Introdução

Este projeto demonstra o uso de encapsulamento em Java para lidar com diferentes gateways de pagamento. O encapsulamento é um dos quatro pilares da Programação Orientada a Objetos (POO) e é usado para esconder os detalhes internos de uma classe e expor apenas o que é necessário através de métodos públicos.

## Encapsulamento

Encapsulamento é a prática de esconder os detalhes internos de uma classe e fornecer uma interface pública bem definida. Isso ajuda a proteger os dados internos da classe e a manter o controle sobre como esses dados são manipulados. Em resumo, encapsulamento promove a modularidade e a segurança no design de software.

## Como o Encapsulamento é Aplicado neste Projeto?

- **Interfaces e Implementações**:
    - A interface `PaymentGateway` define os métodos que devem ser implementados por qualquer classe que implemente um gateway de pagamento.
    - As classes `PaymentGatewayApple` e `PaymentGatewayPicPay` encapsulam a lógica específica do gateway de pagamento para Apple e PicPay, respectivamente. Outros componentes do sistema interagem com essas classes apenas através da interface `PaymentGateway`.

- **Fábrica de Gateways de Pagamento**:
    - A classe `PaymentGatewayFactory` encapsula a lógica de criação e gestão das instâncias de `PaymentGateway`. Ela usa reflexão para descobrir e instanciar dinamicamente todas as classes que implementam `PaymentGateway`.
    - A fábrica expõe apenas o método `getPaymentGateway(String paymentGatewayType)`, permitindo que outras partes do sistema obtenham uma instância de `PaymentGateway` sem precisar conhecer os detalhes de como essas instâncias são criadas ou gerenciadas.
