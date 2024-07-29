# SOL.ID - Liskov Substitution Principle (LSP)

## Introdução

O Princípio de Substituição de Liskov (Liskov Substitution Principle - LSP) é um dos princípios SOLID de design de software. Ele afirma que objetos de uma classe base devem poder ser substituídos por objetos de uma classe derivada sem alterar a correção do programa.

## Definição

O Princípio de Substituição de Liskov estabelece que:

- **Substituição Sem Impacto**: Uma classe derivada deve ser capaz de substituir a classe base sem causar erros ou comportamentos inesperados.
- **Contrato de Classe**: As classes derivadas devem cumprir o contrato estabelecido pela classe base, sem adicionar restrições adicionais que não estavam presentes na classe base.
- **Comportamento Consistente**: O código que usa a classe base deve funcionar corretamente ao substituir a classe base por uma classe derivada.

## Benefícios

- **Consistência**: Garante que subclasses possam substituir suas classes base sem introduzir comportamentos inesperados.
- **Robustez**: Minimiza a probabilidade de erros quando subclasses são usadas no lugar das classes base.
- **Flexibilidade**: Permite adicionar novas subclasses sem modificar o código existente que usa a classe base.

## Exemplo Prático

### Violação

A classe `TargetClient` viola o LSP porque o método `isPremium` não fornece um valor booleano, mas lança uma exceção. Isso quebra o contrato da classe base `Client`, que assume que `isPremium` sempre retornará um valor booleano. Como resultado, o código que usa a classe base pode falhar inesperadamente ao tentar usar uma instância de `TargetClient`.

### Solução

Para evitar a violação do LSP:

- **Consistência nas Implementações**: Garanta que todas as subclasses forneçam uma implementação do método `isPremium` que não altere o comportamento esperado da classe base.
- **Comportamento Padrão**: Em vez de lançar exceções, forneça uma implementação padrão ou um valor que respeite o contrato da classe base.

**Exemplo de Solução:**

- **Client**: Implementa `isPremium` retornando `false`.
- **ContractedClient**: Implementa `isPremium` com base em uma lógica específica (por exemplo, retornando `true` para contratos antigos).
- **TargetClient**: Em vez de lançar uma exceção, pode retornar um valor padrão ou uma indicação apropriada de que a informação não está disponível. Ou melhor, ela não fazer parte da classe base Client. Pois ela se trata de leads que ainda não se tornaram clientes.

## Conclusão

O Princípio de Substituição de Liskov garante que as subclasses possam substituir suas classes base sem comprometer o comportamento esperado do sistema. Seguir o LSP ajuda a criar um software mais robusto e flexível, minimizando a probabilidade de erros quando subclasses são usadas.
