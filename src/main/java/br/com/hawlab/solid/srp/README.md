# S.OLID - Single Responsibility Principle (SRP)

## Introdução

O princípio da responsabilidade única (SRP) é o primeiro dos cinco princípios SOLID de design orientado a objetos. O SRP estabelece que uma classe deve ter apenas um motivo para mudar. Isto é, ela deve ser responsável por apenas uma parte do funcionamento do software. Se uma classe tem mais de uma responsabilidade, essas responsabilidades se tornam acopladas, e uma mudança em uma pode afetar ou quebrar a outra.

## Benefícios

- **Manutenção Facilitada**: Com responsabilidades bem definidas, é mais fácil entender, modificar e corrigir erros no código.
- **Reusabilidade**: Classes com responsabilidades únicas são mais reutilizáveis em diferentes contextos.
- **Testabilidade**: Facilita a criação de testes unitários, já que cada classe tem uma única responsabilidade.

## Exemplo Prático

### Violação

Vamos considerar um sistema de gerenciamento de seguros de saúde e vida. Inicialmente, temos uma classe que viola o SRP misturando responsabilidades de gerenciamento de apólices e envio de notificações.

### Solução

Para seguir o SRP, vamos separar as responsabilidades em diferentes classes.

- Classe para Gerenciamento de Apólices.
- Classe para Gerenciamento de Notificações.
- Classe para Gerar Documentos de Apólices.

## Conclusão

Ao aplicar o princípio da responsabilidade única, conseguimos criar um código mais organizado, fácil de manter e extensível. Cada classe possui uma única responsabilidade, o que simplifica o entendimento e a modificação do código, além de facilitar a criação de testes unitários e aumentar a reusabilidade das classes.
