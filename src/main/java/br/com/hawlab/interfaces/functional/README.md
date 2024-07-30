# Functional Interfaces

Este documento fornece uma visão geral das principais Functional Interfaces no Java e descreve onde e como utilizá-las.

## Single Abstract Method (SAM)

Uma Functional Interface também é conhecida como SAM Interface, que significa "Single Abstract Method". Isso significa que a interface tem exatamente um método abstrato. Este conceito permite que expressões lambda sejam usadas para instanciar interfaces funcionais de forma concisa e legível.

## Function

A interface `Function<T, R>` é usada para representar uma função que recebe um argumento do tipo `T` e retorna um resultado do tipo `R`. Ela é útil quando você precisa transformar ou mapear um valor de um tipo para outro.

**Quando usar:**
- Quando precisar transformar um tipo em outro.
- Exemplo: Converter um número inteiro em sua representação em string.

## Supplier

A interface `Supplier<T>` é usada para representar uma função que não recebe argumentos e retorna um resultado do tipo `T`. Ela é útil para gerar ou fornecer valores, especialmente em cenários de inicialização preguiçosa (lazy initialization).

**Quando usar:**
- Quando precisar fornecer ou gerar valores.
- Exemplo: Gerar uma mensagem de saudação.

## Consumer

A interface `Consumer<T>` é usada para representar uma função que recebe um argumento do tipo `T` e não retorna nada. Ela é útil para executar operações em um valor sem modificá-lo.

**Quando usar:**
- Quando precisar executar uma operação em um valor.
- Exemplo: Imprimir uma mensagem no console.

## Predicate

A interface `Predicate<T>` é usada para representar uma função que recebe um argumento do tipo `T` e retorna um valor booleano. Ela é útil para testar ou validar um valor.

**Quando usar:**
- Quando precisar testar ou validar um valor.
- Exemplo: Verificar se um número é par.

## Comparator

A interface `Comparator<T>` é usada para comparar dois argumentos do tipo `T` e retornar um inteiro que indica a ordem. Ela é útil para ordenar ou classificar coleções.

**Quando usar:**
- Quando precisar comparar e ordenar elementos.
- Exemplo: Comparar strings com base em seu comprimento.

## BinaryOperator

A interface `BinaryOperator<T>` é uma especialização de `BiFunction` que recebe dois argumentos do mesmo tipo `T` e retorna um resultado do mesmo tipo `T`. Ela é útil para operações binárias onde o resultado é do mesmo tipo que os argumentos.

**Quando usar:**
- Quando precisar combinar dois valores do mesmo tipo.
- Exemplo: Somar dois números inteiros.

## UnaryOperator

A interface `UnaryOperator<T>` é uma especialização de `Function` que recebe um argumento do tipo `T` e retorna um resultado do mesmo tipo `T`. Ela é útil para operações unárias onde o resultado é do mesmo tipo que o argumento.

**Quando usar:**
- Quando precisar transformar um valor em outro do mesmo tipo.
- Exemplo: Calcular o quadrado de um número.

## Conclusão

As Functional Interfaces no Java oferecem uma maneira poderosa e flexível de trabalhar com funções como objetos de primeira classe. Elas são fundamentais para a programação funcional em Java e são amplamente utilizadas em APIs como Streams e Optional.
