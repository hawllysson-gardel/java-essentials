# Padrão Adapter

## Descrição

O padrão Adapter é um padrão de design estrutural que permite que classes com interfaces incompatíveis trabalhem juntas. Ele atua como um intermediário, convertendo a interface de uma classe em outra interface que o cliente espera, facilitando a integração entre componentes que, de outra forma, não seriam compatíveis.

## Características do Padrão Adapter

- **Interoperabilidade**: Permite que classes com interfaces diferentes se comuniquem e interajam.
- **Flexibilidade**: Adiciona suporte a novos tipos de sistemas ou serviços sem a necessidade de modificar o código cliente existente.
- **Isolamento**: Separa o código cliente das mudanças nas interfaces dos sistemas ou serviços adaptados.
- **Facilidade de Integração**: Torna mais simples a integração de componentes de sistemas legados ou de terceiros.

## Quando Usar o Padrão Adapter

O padrão Adapter deve ser considerado nas seguintes situações:

1. **Interfaces Incompatíveis**: Quando você precisa conectar componentes que possuem interfaces diferentes e incompatíveis.
2. **Código Legado**: Quando se trabalha com sistemas legados que não podem ser modificados diretamente.
3. **Integração com Sistemas de Terceiros**: Ao integrar bibliotecas ou APIs externas que não seguem a interface esperada pelo seu sistema.
4. **Flexibilidade e Escalabilidade**: Quando deseja adicionar novos tipos de sistemas ou serviços de forma que eles se integrem facilmente ao seu código existente.

## Estrutura do Padrão Adapter

- **Target (Alvo)**: Define a interface que o cliente espera.
- **Client (Cliente)**: Utiliza a interface do `Target`.
- **Adaptee (Adaptado)**: A classe com a interface existente que precisa ser adaptada.
- **Adapter (Adaptador)**: Adapta a interface do `Adaptee` para que ela se ajuste à interface esperada pelo `Target`.

## Exemplo de Funcionamento

1. **Definição da Interface (Target)**: Crie uma interface que define os métodos esperados pelo cliente.
2. **Implementação do Adaptee**: Desenvolva a classe com a interface que precisa ser adaptada.
3. **Criação do Adapter**: Implemente o adapter que converte a interface do `Adaptee` para a interface do `Target`.
4. **Uso pelo Cliente**: O cliente utiliza a interface do `Target`, que é adaptada pelo adapter para funcionar com o `Adaptee`.

## Vantagens

- **Reutilização de Código**: Facilita a reutilização de código existente que não pode ser modificado.
- **Redução de Dependências**: Reduz as dependências entre o cliente e as classes com interfaces incompatíveis.
- **Simplicidade**: Simplifica a integração de novos componentes em sistemas existentes.
