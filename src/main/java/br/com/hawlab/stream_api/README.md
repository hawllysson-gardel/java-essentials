# Stream API

Este repositório contém exemplos de uso da Stream API em Java, demonstrando várias operações comuns que podem ser realizadas em coleções.

## O que é a Stream API?

A Stream API, introduzida no Java 8, é uma parte fundamental do Java Collections Framework. Ela permite realizar operações funcionais em elementos de uma coleção, como filtros, mapeamentos, reduções e muito mais. As streams não armazenam dados; em vez disso, elas processam dados pipelining (encadeando) operações de maneira eficiente.

## Relação com Interfaces Funcionais

A Stream API faz uso extensivo de interfaces funcionais, que são interfaces com um único método abstrato. Algumas interfaces funcionais comuns utilizadas com streams são:

- `Predicate<T>`: Usada para representar uma função que recebe um argumento do tipo `T` e retorna um `boolean`.
- `Function<T, R>`: Usada para representar uma função que recebe um argumento do tipo `T` e retorna um resultado do tipo `R`.
- `Consumer<T>`: Usada para representar uma função que recebe um argumento do tipo `T` e não retorna nenhum resultado.
- `Supplier<T>`: Usada para representar uma função que não recebe argumentos e retorna um resultado do tipo `T`.

Essas interfaces funcionais permitem que as operações da Stream API sejam passadas como expressões lambda ou referências de métodos, tornando o código mais conciso e expressivo.

## Operações da Stream API

### 1. Filtragem (`filter`)

**Descrição:** Filtra elementos de uma coleção com base em um critério específico.

**Uso:** Utilize `filter` quando quiser criar uma sublista de elementos que correspondam a uma condição específica.

### 2. Mapeamento (`map`)

**Descrição:** Transforma elementos de uma coleção em outra forma.

**Uso:** Utilize `map` quando precisar aplicar uma função a cada elemento de uma coleção e coletar os resultados transformados.

### 3. Redução (`reduce`)

**Descrição:** Reduz os elementos de uma coleção a um único valor.

**Uso:** Utilize `reduce` quando precisar agregar todos os elementos de uma coleção em um único resultado, como somar números ou concatenar strings.

### 4. Iteração (`forEach`)

**Descrição:** Executa uma operação para cada elemento de uma coleção.

**Uso:** Utilize `forEach` quando precisar executar uma ação em cada elemento de uma coleção, como imprimir ou modificar elementos.

### 5. Coleta (`collect`)

**Descrição:** Coleta os elementos de uma stream em uma coleção.

**Uso:** Utilize `collect` quando quiser converter a stream de volta para uma coleção, como uma lista ou conjunto.

### 6. Ordenação (`sorted`)

**Descrição:** Ordena os elementos de uma coleção.

**Uso:** Utilize `sorted` quando precisar ordenar os elementos de uma coleção com base em uma ordem natural ou um comparador específico.

### 7. Limitação (`limit`)

**Descrição:** Limita o número de elementos na stream.

**Uso:** Utilize `limit` quando precisar pegar apenas um número específico de elementos do início de uma stream.

### 8. Pular elementos (`skip`)

**Descrição:** Pula um número específico de elementos na stream.

**Uso:** Utilize `skip` quando precisar ignorar um número específico de elementos do início de uma stream.

### 9. Distinto (`distinct`)

**Descrição:** Remove elementos duplicados da stream.

**Uso:** Utilize `distinct` quando precisar garantir que a coleção resultante não contenha elementos duplicados.

### 10. Busca (`findFirst`, `findAny`)

**Descrição:** Encontra o primeiro ou qualquer elemento da stream.

**Uso:** Utilize `findFirst` para obter o primeiro elemento da stream, ou `findAny` para obter qualquer elemento da stream (útil em operações paralelas).

### 11. Verificação (`allMatch`, `anyMatch`, `noneMatch`)

**Descrição:** Verifica se todos, algum ou nenhum elemento da stream corresponde a um predicado.

**Uso:** Utilize essas operações para testar se elementos de uma coleção satisfazem uma condição específica.

### 12. Espiar (`peek`)

**Descrição:** Executa uma operação em cada elemento da stream e retorna uma nova stream.

**Uso:** Utilize `peek` para depuração ou para realizar ações intermediárias sem modificar os elementos da stream.

## Parallel Stream

**Descrição:** Executa operações em uma stream em paralelo, dividindo o trabalho entre vários núcleos de processador.

**Uso:** Utilize `parallelStream` quando precisar processar grandes quantidades de dados de maneira eficiente, aproveitando o poder de múltiplos núcleos de CPU. Isso pode melhorar significativamente o desempenho de operações intensivas de CPU, como cálculos complexos ou processamento de grandes coleções.

**Nota:** Nem todas as operações são adequadas para execução paralela. Operações que são dependentes da ordem dos elementos ou que modificam o estado de maneira não segura podem não se beneficiar de parallel streams.

## Conclusão

A Stream API do Java oferece uma maneira poderosa e flexível de processar coleções de maneira funcional. Cada uma das operações acima pode ser usada em diferentes cenários para simplificar e tornar o código mais legível e eficiente. Explore os exemplos neste repositório para entender melhor como aplicar essas operações em suas aplicações Java.
