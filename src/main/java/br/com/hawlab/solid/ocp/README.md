# SO.LID - Open/Closed Principle (OCP)

## Introdução

O princípio aberto/fechado (Open/Closed Principle - OCP) é o segundo dos cinco princípios SOLID de design orientado a objetos. Ele afirma que entidades de software (como classes, módulos, funções) devem estar abertas para extensão, mas fechadas para modificação. Em outras palavras, você deve ser capaz de adicionar novas funcionalidades a uma classe sem modificar seu código existente.

## Definição

O OCP estabelece que uma entidade de software deve estar:

- **Aberta para Extensão**: Devemos ser capazes de adicionar novos comportamentos à entidade.
- **Fechada para Modificação**: A entidade não deve ser modificada para adicionar novos comportamentos.

## Benefícios

- **Manutenção Facilitada**: Adicionar novas funcionalidades sem alterar o código existente minimiza a introdução de bugs.
- **Flexibilidade**: Facilita a adição de novas funcionalidades.
- **Reusabilidade**: Componentes de software que seguem o OCP são mais reutilizáveis.

## Exemplo Prático

### Violação

Vamos considerar um sistema de gerenciamento de seguros de saúde e vida. Inicialmente, temos uma classe que viola o OCP, calculando o prêmio (premium) de diferentes tipos de seguros dentro da mesma classe. Para adicionar um novo tipo de seguro, precisaríamos modificar o método calculatePremium, o que viola o OCP.

### Solução

Vamos aplicar o OCP usando a técnica de polimorfismo, criando uma interface para as apólices de seguro e implementações específicas para cada tipo de seguro.

- Criar uma interface para apólices de seguro.
- Implementar classes específicas para cada tipo de seguro.
- Adicionar um novo tipo de seguro sem modificar as classes existentes.

## Conclusão

Ao aplicar o princípio aberto/fechado, conseguimos criar um código que pode ser facilmente estendido para suportar novos tipos de seguros sem modificar o código existente. Cada tipo de seguro tem sua própria classe que implementa a interface InsurancePolicy, permitindo adicionar novas funcionalidades sem alterar o comportamento das classes existentes, seguindo assim o princípio aberto/fechado.
