# Strategy

## Introdução

O padrão de projeto Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los em classes separadas e torná-los intercambiáveis. Isso permite que o algoritmo varie independentemente dos clientes que o utilizam.

## Características do Padrão Strategy

1. **Encapsulamento de Algoritmos**: Cada algoritmo é encapsulado em uma classe separada que implementa uma interface comum.
2. **Intercambiabilidade**: Os algoritmos podem ser trocados facilmente em tempo de execução, sem alterar o código do cliente.
3. **Manutenção Facilitada**: Adicionar novos algoritmos ou modificar algoritmos existentes não requer mudanças no código do cliente.
4. **Responsabilidade Única**: Segue o princípio de responsabilidade única, separando a lógica do algoritmo da lógica do cliente.

## Quando Usar o Padrão Strategy

- **Variação de Algoritmos**: Quando você tem várias formas de realizar uma operação e precisa trocar esses algoritmos em tempo de execução.
- **Evitar Condicionais Complexos**: Quando você deseja evitar condicionais (if-else ou switch-case) complexos que selecionam diferentes variantes de um algoritmo.
- **Extensibilidade**: Quando você prevê a necessidade de adicionar novos algoritmos no futuro sem modificar o código existente.
- **Delegação de Comportamento**: Quando você deseja delegar a responsabilidade de escolher um algoritmo para o próprio objeto em tempo de execução.

## Benefícios

- **Flexibilidade**: Permite que o algoritmo varie independentemente dos clientes que o utilizam.
- **Reutilização**: Facilita a reutilização de algoritmos em diferentes contextos.
- **Manutenção**: Melhora a manutenção e a clareza do código, separando as preocupações entre diferentes classes.

## Desvantagens

- **Complexidade Adicional**: Pode adicionar complexidade ao projeto devido ao aumento no número de classes.
- **Overhead**: Pode introduzir overhead se os algoritmos são muito simples e a troca dinâmica não é necessária.

## Exemplo de Aplicação

Um exemplo comum do uso do padrão Strategy é em sistemas de pagamento, onde diferentes métodos de pagamento (como cartão de crédito, PayPal, transferência bancária) podem ser encapsulados em classes separadas e usados de forma intercambiável pelo cliente em tempo de execução.
