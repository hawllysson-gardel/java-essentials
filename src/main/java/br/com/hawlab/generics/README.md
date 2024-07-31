# Generics

Generics são uma funcionalidade poderosa em Java que permite a criação de classes, interfaces e métodos que operam em tipos especificados pelo usuário. Isso adiciona um nível de abstração que facilita a reutilização de código e aumenta a segurança de tipos em tempo de compilação.

## Generics em Classes

Uma classe genérica em Java permite que você defina uma classe com um ou mais parâmetros de tipo. Isso significa que você pode criar uma classe que funciona com diferentes tipos de dados sem precisar reescrever o código para cada tipo específico.

### Benefícios de usar classes genéricas:
- **Reutilização de Código**: Você pode usar a mesma implementação de classe para diferentes tipos de dados.
- **Segurança de Tipos**: Erros de tipo são detectados em tempo de compilação, reduzindo a quantidade de erros de runtime.
- **Legibilidade e Manutenção**: Código genérico pode ser mais fácil de ler e manter, pois abstrai detalhes específicos do tipo.

## Generics em Funções

Métodos genéricos permitem que você defina métodos com parâmetros de tipo, oferecendo a mesma flexibilidade que as classes genéricas. Você pode definir um método que trabalha com diferentes tipos de dados de maneira segura e eficiente.

### Benefícios de usar métodos genéricos:
- **Flexibilidade**: Permite que métodos trabalhem com qualquer tipo de dado, tornando o código mais versátil.
- **Segurança de Tipos**: Assim como nas classes genéricas, métodos genéricos oferecem checagem de tipo em tempo de compilação.
- **Reutilização de Código**: Um único método pode ser utilizado com diferentes tipos, evitando duplicação de código.

## Como Funcionam os Generics

### Parâmetros de Tipo
Os parâmetros de tipo são definidos entre os símbolos `<` e `>`. Eles são usados para especificar os tipos com os quais a classe ou método pode operar. Por exemplo, `T` é frequentemente usado como um nome de parâmetro de tipo genérico, mas você pode usar qualquer identificador.

### Sintaxe Básica
- **Classe Genérica**: `class ClassName<T> { ... }`
- **Método Genérico**: `<T> ReturnType methodName(ParamType param) { ... }`

### Limitações e Considerações
- **Tipo Primitivo**: Generics não podem ser usados com tipos primitivos (int, char, etc.). Você deve usar os wrappers de tipos primitivos (Integer, Character, etc.).
- **Conversões**: Não há suporte para conversões implícitas ou explícitas entre diferentes instâncias de tipos genéricos.
- **Herança**: Generics em Java não suportam a covariância e contravariância diretamente. Para isso, você pode usar wildcards (`? extends T` ou `? super T`).

## Conclusão

Generics são uma ferramenta essencial no desenvolvimento Java moderno. Eles permitem a criação de código flexível, reutilizável e seguro. Entender e utilizar generics pode levar a um código mais limpo e eficiente, além de reduzir a possibilidade de erros em tempo de execução.
