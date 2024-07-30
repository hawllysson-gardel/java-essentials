# Métodos Default e Static em Interfaces

Este documento explica os métodos `default` e `static` em interfaces Java, introduzidos na versão 8 do Java, e fornece diretrizes sobre quando usar cada tipo de método.

## Métodos Default

Os métodos `default` permitem que você adicione novos métodos às interfaces com uma implementação padrão. Isso é útil porque não quebra as classes existentes que já implementam a interface. As classes que implementam a interface podem optar por usar a implementação padrão ou fornecer sua própria implementação.

### Quando Usar Métodos Default

- **Adição de Métodos em Interfaces Existentes**: Use métodos `default` quando você precisar adicionar novos métodos a uma interface existente sem quebrar as classes que já a implementam.
- **Implementação Padrão**: Use quando uma implementação padrão é adequada na maioria dos casos, mas permite que as classes que implementam a interface substituam o método se necessário.
- **Evolução de APIs**: Útil para evoluir APIs, adicionando novos métodos de forma compatível com versões anteriores.

## Métodos Static

Os métodos `static` em interfaces pertencem à interface em si e não às instâncias das classes que a implementam. Eles podem ser chamados diretamente na interface e são ideais para métodos utilitários.

### Quando Usar Métodos Static

- **Métodos Utilitários**: Use métodos `static` para funcionalidades que são relacionadas à interface, mas não dependem de estados de instância.
- **Organização de Código**: Permite que métodos utilitários sejam agrupados diretamente na interface relacionada, facilitando a organização e a localização do código.
- **Acesso Direto**: Útil quando você deseja que o método esteja disponível diretamente na interface, sem a necessidade de uma instância da interface.

## Resumo das Diretrizes

- **Métodos Default**: Fornecem uma implementação padrão que pode ser usada ou sobrescrita pelas classes implementadoras. Útil para adicionar novos métodos a interfaces existentes e fornecer comportamentos padrão.
- **Métodos Static**: Pertencem à interface e são chamados diretamente na interface. Útil para métodos utilitários que não dependem de estados de instância.
