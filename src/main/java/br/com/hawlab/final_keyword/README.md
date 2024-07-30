# Uso da Palavra-chave `final` em Java

No Java, a palavra-chave `final` é usada para definir elementos que não podem ser alterados após sua inicialização. A seguir, explicamos como `final` é utilizado em variáveis, métodos e classes.

## Variáveis

Quando uma variável é declarada como `final`, seu valor não pode ser alterado depois de ser atribuído. Isso significa que a variável se torna uma constante, e qualquer tentativa de modificar seu valor após a atribuição inicial causará um erro de compilação.

## Métodos

Quando um método é marcado como `final`, ele não pode ser sobrescrito por subclasses. Isso garante que a implementação do método na classe onde foi definido permaneça inalterada, independentemente das subclasses que possam ser criadas. Essa característica é útil para assegurar que o comportamento do método não seja alterado acidentalmente.

## Classes

Quando uma classe é declarada como `final`, ela não pode ser estendida por outras classes. Isso significa que você não pode criar subclasses a partir de uma classe `final`. Esta restrição é útil para garantir que a classe não seja modificada por meio da herança, mantendo seu comportamento e estrutura originais.

## Resumo

- **Variáveis `final`**: Não podem ser alteradas após a inicialização.
- **Métodos `final`**: Não podem ser sobrescritos por subclasses.
- **Classes `final`**: Não podem ser estendidas por outras classes.

A utilização da palavra-chave `final` ajuda a garantir a imutabilidade e a integridade do código, promovendo um design mais seguro e previsível.
