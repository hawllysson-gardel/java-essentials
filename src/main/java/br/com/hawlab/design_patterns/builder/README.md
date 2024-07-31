# Padrão Builder

## Visão Geral

O padrão Builder é um padrão de design criacional que fornece uma maneira de construir objetos complexos passo a passo. Ele permite a criação de um objeto especificando sua representação e seu conteúdo, proporcionando controle mais detalhado sobre o processo de construção. Esse padrão é especialmente útil quando um objeto precisa ser criado com múltiplos componentes ou configurações opcionais.

## Características

- **Separação da Construção e Representação**: O padrão Builder separa o processo de construção do objeto de sua representação final. Isso permite criar diferentes representações do objeto usando o mesmo processo de construção.
- **Interface Fluente**: Utiliza uma interface fluente que permite a construção do objeto de maneira passo a passo, com métodos que retornam a própria instância do builder para encadeamento de métodos.
- **Imutabilidade**: O objeto construído é geralmente imutável após sua construção. O builder acumula todas as propriedades necessárias e, em seguida, cria o objeto final.
- **Flexibilidade e Configuração**: Facilita a construção de diferentes variações de um objeto configurando o builder de diferentes maneiras, sem alterar o código de construção.

## Quando Usar o Padrão Builder

- **Objetos Complexos**: Use o padrão Builder quando um objeto possui muitos parâmetros ou atributos, alguns dos quais podem ser opcionais. O Builder simplifica a criação do objeto e torna o código mais legível.
- **Configurações Variadas**: Ideal para situações onde o objeto pode ter várias configurações ou representações diferentes. O Builder permite criar essas variações de forma consistente.
- **Objetos Imutáveis**: Quando a imutabilidade do objeto é desejada, o Builder permite criar o objeto em um estado final imutável.
- **Código Legível e Manutenível**: Reduz a complexidade dos construtores que possuem muitos parâmetros e melhora a legibilidade e manutenibilidade do código.

## Exemplo de Uso

O padrão Builder é comumente utilizado para construir objetos complexos como configurações de sistemas, relatórios, interfaces de usuário, e muito mais. Por exemplo, você pode usar o padrão Builder para criar um objeto `Veículo` com diferentes tipos de motor, rodas e outros componentes opcionais, sem a necessidade de um construtor com muitos parâmetros.

## Benefícios

- **Legibilidade**: O código para construir objetos complexos é mais claro e mais fácil de entender.
- **Flexibilidade**: Permite diferentes configurações e representações do objeto sem mudar a lógica de construção.
- **Manutenibilidade**: Centraliza a lógica de construção e reduz a complexidade dos construtores múltiplos.
