# Comparação: String, StringBuilder e StringBuffer

## Visão Geral

`String`, `StringBuilder` e `StringBuffer` são classes usadas para manipulação de strings. Cada uma dessas classes tem suas características e casos de uso específicos. Este documento fornece uma comparação detalhada, ajudando a decidir qual classe usar em diferentes situações.

## Diferenças Principais

### String

- **Imutabilidade**: Instâncias de `String` são imutáveis. Qualquer operação que altera o conteúdo da string resulta na criação de um novo objeto `String`.
- **Thread-Safe**: `String` é automaticamente segura para uso em ambientes de múltiplas threads devido à sua imutabilidade.
- **Desempenho**: Menos eficiente para operações repetitivas de concatenação e modificação, pois cada modificação cria um novo objeto.

### StringBuilder

- **Mutabilidade**: Instâncias de `StringBuilder` são mutáveis. Operações de modificação (`append`, `insert`, `delete`, etc.) alteram o mesmo objeto sem criar novos objetos.
- **Não Sincronizado**: `StringBuilder` não é sincronizado, o que significa que não é seguro para uso por múltiplas threads sem sincronização explícita.
- **Desempenho**: Geralmente mais rápido que `String` e `StringBuffer` para operações repetitivas de concatenação e modificação.
- **Uso Recomendado**: Manipulação intensiva de strings em ambientes de thread único.

### StringBuffer

- **Mutabilidade**: Semelhante ao `StringBuilder`, `StringBuffer` é mutável.
- **Sincronizado**: `StringBuffer` é sincronizado, tornando seus métodos thread-safe.
- **Desempenho**: A sincronização adiciona uma sobrecarga, tornando-o geralmente mais lento que `StringBuilder`.
- **Uso Recomendado**: Manipulação de strings em ambientes de múltiplas threads onde a segurança de threads é necessária.
