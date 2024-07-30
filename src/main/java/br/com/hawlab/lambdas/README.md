# Diferenças entre Lambda Expressions, Stream API e Interfaces Funcionais

Este documento explica as diferenças e relações entre lambda expressions, Stream API e interfaces funcionais em Java, três conceitos fundamentais introduzidos no Java 8 que facilitam a programação funcional.

## Lambda Expressions

**Descrição:**
Lambda expressions são uma maneira concisa de representar funções anônimas (funções sem nome) que podem ser passadas como argumentos para métodos ou usadas para criar instâncias de interfaces funcionais.

**Características:**
- **Sintaxe Simples:** Oferecem uma forma compacta e legível de expressar implementações de métodos únicos.
- **Propósito:** Facilitar a passagem de comportamentos e reduzir o boilerplate de código associado à criação de classes anônimas.

**Uso Comum:**
- **Passagem de Comportamento:** Usadas para fornecer implementações de métodos em APIs que aceitam interfaces funcionais.
- **Instanciação de Interfaces Funcionais:** Criam instâncias de interfaces funcionais de maneira direta e legível.

## Stream API

**Descrição:**
A Stream API é uma ferramenta poderosa para processar coleções de dados de maneira funcional e eficiente. Ela permite realizar operações como filtragem, mapeamento e redução de maneira declarativa.

**Características:**
- **Processamento Funcional:** Permite realizar operações em dados de forma declarativa, utilizando pipelines de operações.
- **Lazy Evaluation:** As operações em streams são avaliadas somente quando necessário, o que pode melhorar a eficiência.
- **Paralelismo:** Oferece a capacidade de processar dados em paralelo para aproveitar múltiplos núcleos de CPU.

**Uso Comum:**
- **Processamento de Dados:** Facilita a execução de operações complexas e encadeadas em coleções de dados.
- **Paralelismo:** Utiliza `parallelStream()` para processamento paralelo quando se lida com grandes volumes de dados.

## Interfaces Funcionais

**Descrição:**
Interfaces funcionais são interfaces com um único método abstrato. Elas são usadas como alvos para expressões lambda e referências de métodos, fornecendo uma maneira de definir tipos de funções.

**Características:**
- **Método Único:** Contêm exatamente um método abstrato, que define o comportamento a ser implementado.
- **Anotações:** Frequentemente anotadas com `@FunctionalInterface` para garantir que contêm apenas um método abstrato.

**Uso Comum:**
- **Design de APIs:** Definem tipos de funções que podem ser usadas como argumentos ou valores de retorno em métodos.
- **Lambda Expressions:** São usadas como tipos de alvo para expressões lambda e referências de métodos.

## Resumo das Diferenças

- **Lambda Expressions:** Fornecem uma maneira concisa de implementar interfaces funcionais. Elas permitem passar comportamentos e criar instâncias de interfaces funcionais de forma simplificada.
- **Stream API:** Utiliza lambdas e interfaces funcionais para realizar operações funcionais em coleções de dados de forma eficiente e declarativa.
- **Interfaces Funcionais:** São tipos de interfaces que podem ser implementadas por lambdas ou referências de métodos. Elas definem o contrato para comportamentos que podem ser passados e manipulados.

Esses conceitos são essenciais para entender como o Java 8 e versões posteriores facilitam a programação funcional e a manipulação eficiente de dados. Explore cada um para melhorar a clareza e eficiência do seu código Java.
