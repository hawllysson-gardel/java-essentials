# Garbage Collector (GC)

O Garbage Collector (GC) em Java é responsável por gerenciar a memória, liberando objetos que não são mais necessários para evitar vazamentos de memória e otimizar o uso dos recursos. O processo de GC é dividido em vários estágios, que são essenciais para entender como a memória é gerenciada. A seguir, estão os principais estágios do GC:

## Estágios do Garbage Collector

### 1. **Marcação (Mark)**
No estágio de marcação, o GC identifica todos os objetos que estão atualmente em uso. O processo começa com a marcação dos objetos raiz, como variáveis locais e referências de objetos estáticos. Em seguida, o GC percorre as referências desses objetos para marcar todos os objetos que estão acessíveis.

### 2. **Desmarcação (Unmark)**
Após a marcação, o estágio de desmarcação é opcional em alguns algoritmos de GC. Esse estágio pode ser utilizado para limpar informações de marcação dos objetos que foram considerados alcançáveis, para garantir que o próximo ciclo de coleta de lixo não reavaliará esses objetos desnecessariamente.

### 3. **Limpeza (Sweep)**
No estágio de limpeza, o GC remove objetos que não foram marcados como alcançáveis no estágio de marcação. Esses objetos são considerados como não utilizados e suas áreas de memória são liberadas, tornando-as disponíveis para novos objetos.

### 4. **Compactação (Compact)**
A compactação é um estágio que organiza os objetos restantes na memória para reduzir a fragmentação. Isso envolve mover os objetos para uma parte contígua da memória, facilitando a alocação de novos objetos e melhorando a eficiência do acesso à memória.

### 5. **Ajuste de Espaço (Space Adjustment)**
Esse estágio pode envolver a reorganização do heap ou a atualização das estruturas de dados internas do GC para refletir as mudanças após a coleta de lixo. Isso é feito para garantir que a memória esteja otimizada e pronta para a próxima operação de GC.

## Tipos de Garbage Collector

Existem vários algoritmos e tipos de Garbage Collector disponíveis no Java, cada um com seus próprios métodos e características. Alguns dos mais comuns incluem:

- **Serial GC**: Foca em aplicações de thread único e é adequado para ambientes com recursos limitados.
- **Parallel GC**: Também conhecido como "Throughput Collector", utiliza múltiplos threads para reduzir o tempo de pausa do GC.
- **Concurrent Mark-Sweep (CMS) GC**: Minimiza as pausas para a coleta de lixo, realizando a maior parte da coleta de forma concorrente com a execução da aplicação.
- **G1 GC**: Divida o heap em regiões e realiza a coleta de lixo de forma mais eficiente para reduzir as pausas e melhorar o desempenho geral.

## Conclusão

Entender os estágios do Garbage Collector ajuda a otimizar a performance da aplicação e a gerenciar melhor o uso da memória. Cada tipo de GC tem suas vantagens e desvantagens, e a escolha do coletor adequado pode ter um impacto significativo na eficiência da aplicação.
