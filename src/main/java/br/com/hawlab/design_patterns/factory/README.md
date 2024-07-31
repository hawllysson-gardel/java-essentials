# Factory

## Descrição

O padrão de projeto Factory é um padrão criacional que fornece uma maneira de criar objetos sem especificar a classe exata do objeto que será criado. Em vez de instanciar objetos diretamente usando o operador `new`, você utiliza uma fábrica (factory) para criar o objeto. Esse padrão é útil quando a criação do objeto é complexa ou quando você deseja desacoplar o código que utiliza o objeto do código que o cria.

## Características

- **Desacoplamento:** Separa a criação do objeto de sua utilização. Isso facilita a modificação ou a substituição dos produtos criados sem alterar o código cliente.
- **Flexibilidade:** Permite que a criação do objeto seja adiada até o momento em que o cliente realmente precisa do objeto. Isso ajuda a adaptar o código a diferentes requisitos ou condições.
- **Encapsulamento da Criação:** A lógica de criação do objeto é encapsulada na fábrica, o que pode incluir complexidade adicional, como configuração ou inicialização do objeto.

## Quando Usar

- **Quando o código não deve depender da classe exata do objeto que será criado:** Usar o padrão Factory permite que você altere as classes concretas que produzem os objetos sem afetar o código que utiliza esses objetos.
- **Quando a criação do objeto é complexa:** Se a criação de um objeto envolve muitos parâmetros ou configurações, uma fábrica pode simplificar a instância criando o objeto e configurando-o conforme necessário.
- **Quando você deseja centralizar a criação de objetos:** Usar uma fábrica permite que você controle a criação de objetos em um único local, facilitando a manutenção e a modificação do processo de criação.

## Exemplo de Aplicação

Imagine um sistema que precisa criar diferentes tipos de veículos, como carros e bicicletas. Em vez de criar esses veículos diretamente no código cliente, você pode usar fábricas específicas para criar cada tipo de veículo. Isso permite que o código cliente permaneça limpo e desacoplado das classes concretas dos veículos, além de facilitar a adição de novos tipos de veículos no futuro.

## Conclusão

O padrão de projeto Factory é uma solução eficaz para a criação de objetos quando você deseja desacoplar a criação do objeto de sua utilização e quando a criação do objeto é complexa. Ele promove a flexibilidade e a manutenção do código, facilitando a evolução e a escalabilidade do sistema.
