# SOLID. - Dependency Inversion Principle (DIP)

## Introdução

O Princípio de Inversão de Dependência (Dependency Inversion Principle - DIP) é um dos princípios SOLID de design de software. Ele afirma que módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações (interfaces). Além disso, abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

## Definição

O Princípio de Inversão de Dependência estabelece que:

- **Abstrações Comuns**: Tanto os módulos de alto nível quanto os de baixo nível devem depender de abstrações.
- **Inversão de Dependência**: As dependências dos detalhes da implementação devem ser invertidas para depender de interfaces ou abstrações.

## Benefícios

- **Desacoplamento**: Reduz o acoplamento entre componentes de software, tornando-os mais independentes e reutilizáveis.
- **Flexibilidade**: Facilita a troca de implementações sem modificar os módulos de alto nível.
- **Testabilidade**: Melhora a testabilidade do código, permitindo a substituição fácil de implementações reais por mocks ou stubs nos testes.

## Exemplo Prático

### Violação

No contexto de um sistema de leitura de arquivos, considere uma classe principal (`Main`) que depende diretamente das implementações concretas dos leitores de arquivos: `TxtFileReader`, `CsvFileReader`, e `PdfFileReader`.

#### Classes Envolvidas na Violação:
- **TxtFileReader**: Implementa a leitura de arquivos TXT.
- **CsvFileReader**: Implementa a leitura de arquivos CSV.
- **PdfFileReader**: Implementa a leitura de arquivos PDF.
- **Main**: A classe principal que instancia diretamente os leitores de arquivos e os utiliza para processar os arquivos.

### Solução

Para evitar a violação do DIP, criamos uma interface `FileReader` que define um método `read()`, e as classes `TxtFileReader`, `CsvFileReader`, e `PdfFileReader` implementam essa interface. Utilizamos um container de IoC para resolver a implementação correta com base na extensão do arquivo.

#### Classes Envolvidas na Solução:
- **FileReader**: Interface que define o método `read()`.
- **TxtFileReader**: Implementa a interface `FileReader` para leitura de arquivos TXT.
- **CsvFileReader**: Implementa a interface `FileReader` para leitura de arquivos CSV.
- **PdfFileReader**: Implementa a interface `FileReader` para leitura de arquivos PDF.
- **FileReaderFactory**: Um container de IoC que resolve a implementação correta do `FileReader` com base na extensão do arquivo.

## Conclusão

O Princípio de Inversão de Dependência (DIP) ajuda a reduzir o acoplamento entre componentes de software, promovendo a flexibilidade e a facilidade de manutenção. Aplicar o DIP com Inversão de Controle (IoC) permite que o sistema resolva e injete as dependências corretas dinamicamente, com base nas necessidades específicas, como a extensão do arquivo no exemplo acima.
